package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ♫.AbstractC0274;
import ♫.AbstractC0351;
import ♫.AbstractC0584;
import ♫.C0065;
import ♫.C0066;
import ♫.C0158;
import ♫.C0180;
import ♫.C0248;
import ♫.C0291;
import ♫.C0296;
import ♫.C0415;
import ♫.C0461;
import ♫.C0488;
import ♫.C0492;
import ♫.C0498;
import ♫.View$OnClickListenerC0481;

public class SearchView extends C0461 implements AbstractC0351 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final C0038 f238 = new C0038();

    /* renamed from: µ  reason: contains not printable characters */
    public boolean f239;

    /* renamed from: Ø  reason: contains not printable characters */
    public final View f240;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public final ImageView f241;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f242;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f243;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public int[] f244;

    /* renamed from: ö  reason: contains not printable characters */
    public final ImageView f245;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f246;

    /* renamed from: ø  reason: contains not printable characters */
    public final View f247;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public final ImageView f248;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f249;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public int[] f250;

    /* renamed from: Φ  reason: contains not printable characters */
    public final Intent f251;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Rect f252;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final Drawable f253;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final View.OnClickListener f254;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final View f255;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final ImageView f256;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f257;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Runnable f258;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public SearchableInfo f259;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Intent f260;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Rect f261;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Bundle f262;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TextWatcher f263;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View.OnClickListener f264;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View.OnFocusChangeListener f265;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View.OnKeyListener f266;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View f267;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AdapterView.OnItemClickListener f268;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AdapterView.OnItemSelectedListener f269;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ImageView f270;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final TextView.OnEditorActionListener f271;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final SearchAutoComplete f272;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0044 f273;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final CharSequence f274;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Runnable f275;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final WeakHashMap<String, Drawable.ConstantState> f276;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0274 f277;

    /* renamed from: А  reason: contains not printable characters */
    public int f278;

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean f279;

    /* renamed from: ₢  reason: contains not printable characters */
    public int f280;

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean f281;

    /* renamed from: ₤  reason: contains not printable characters */
    public final int f282;

    /* renamed from: ₤  reason: contains not printable characters and collision with other field name */
    public boolean f283;

    /* renamed from: ₧  reason: contains not printable characters */
    public final int f284;

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean f285;

    /* renamed from: androidx.appcompat.widget.SearchView$₢  reason: contains not printable characters */
    public interface AbstractC0035 {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$一  reason: contains not printable characters */
    public interface AbstractC0040 {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$上  reason: contains not printable characters */
    public interface AbstractC0041 {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$Φ  reason: contains not printable characters */
    public class RunnableC0032 implements Runnable {
        public RunnableC0032() {
        }

        public void run() {
            SearchView.this.m163();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ø  reason: contains not printable characters */
    public class RunnableC0031 implements Runnable {
        public RunnableC0031() {
        }

        public void run() {
            AbstractC0274 r0 = SearchView.this.f277;
            if (r0 != null && (r0 instanceof View$OnClickListenerC0481)) {
                r0.m1241((Cursor) null);
            }
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f261 = new Rect();
        this.f252 = new Rect();
        this.f250 = new int[2];
        this.f244 = new int[2];
        this.f275 = new RunnableC0032();
        this.f258 = new RunnableC0031();
        this.f276 = new WeakHashMap<>();
        this.f254 = new View$OnClickListenerC0028();
        this.f266 = new View$OnKeyListenerC0039();
        this.f271 = new C0034();
        this.f268 = new C0036();
        this.f269 = new C0037();
        this.f263 = new C0033();
        C0488 a = C0488.m2290(context, attrs, C0291.SearchView, defStyleAttr, 0);
        LayoutInflater.from(context).inflate(a.m2308(C0291.SearchView_layout, C0296.abc_search_view), (ViewGroup) this, true);
        this.f272 = (SearchAutoComplete) findViewById(C0065.search_src_text);
        this.f272.setSearchView(this);
        this.f267 = findViewById(C0065.search_edit_frame);
        this.f255 = findViewById(C0065.search_plate);
        this.f247 = findViewById(C0065.submit_area);
        this.f270 = (ImageView) findViewById(C0065.search_button);
        this.f256 = (ImageView) findViewById(C0065.search_go_btn);
        this.f248 = (ImageView) findViewById(C0065.search_close_btn);
        this.f241 = (ImageView) findViewById(C0065.search_voice_btn);
        this.f245 = (ImageView) findViewById(C0065.search_mag_icon);
        C0248.m1157(this.f255, a.m2301(C0291.SearchView_queryBackground));
        C0248.m1157(this.f247, a.m2301(C0291.SearchView_submitBackground));
        this.f270.setImageDrawable(a.m2301(C0291.SearchView_searchIcon));
        this.f256.setImageDrawable(a.m2301(C0291.SearchView_goIcon));
        this.f248.setImageDrawable(a.m2301(C0291.SearchView_closeIcon));
        this.f241.setImageDrawable(a.m2301(C0291.SearchView_voiceIcon));
        this.f245.setImageDrawable(a.m2301(C0291.SearchView_searchIcon));
        this.f253 = a.m2301(C0291.SearchView_searchHintIcon);
        C0492.m2353(this.f270, getResources().getString(C0180.abc_searchview_description_search));
        this.f282 = a.m2308(C0291.SearchView_suggestionRowLayout, C0296.abc_search_dropdown_item_icons_2line);
        this.f284 = a.m2308(C0291.SearchView_commitIcon, 0);
        this.f270.setOnClickListener(this.f254);
        this.f248.setOnClickListener(this.f254);
        this.f256.setOnClickListener(this.f254);
        this.f241.setOnClickListener(this.f254);
        this.f272.setOnClickListener(this.f254);
        this.f272.addTextChangedListener(this.f263);
        this.f272.setOnEditorActionListener(this.f271);
        this.f272.setOnItemClickListener(this.f268);
        this.f272.setOnItemSelectedListener(this.f269);
        this.f272.setOnKeyListener(this.f266);
        this.f272.setOnFocusChangeListener(new View$OnFocusChangeListenerC0029());
        setIconifiedByDefault(a.m2306(C0291.SearchView_iconifiedByDefault, true));
        int maxWidth = a.m2294(C0291.SearchView_android_maxWidth, -1);
        if (maxWidth != -1) {
            setMaxWidth(maxWidth);
        }
        this.f274 = a.m2302(C0291.SearchView_defaultQueryHint);
        this.f257 = a.m2302(C0291.SearchView_queryHint);
        int imeOptions = a.m2292(C0291.SearchView_android_imeOptions, -1);
        if (imeOptions != -1) {
            setImeOptions(imeOptions);
        }
        int inputType = a.m2292(C0291.SearchView_android_inputType, -1);
        if (inputType != -1) {
            setInputType(inputType);
        }
        setFocusable(a.m2306(C0291.SearchView_android_focusable, true));
        a.m2304();
        this.f260 = new Intent("android.speech.action.WEB_SEARCH");
        this.f260.addFlags(268435456);
        this.f260.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f251 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f251.addFlags(268435456);
        this.f240 = findViewById(this.f272.getDropDownAnchor());
        View view = this.f240;
        if (view != null) {
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0030());
        }
        m145(this.f243);
        m164();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$Ø  reason: contains not printable characters */
    public class View$OnFocusChangeListenerC0029 implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC0029() {
        }

        public void onFocusChange(View v, boolean hasFocus) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f265;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, hasFocus);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ö  reason: contains not printable characters */
    public class View$OnLayoutChangeListenerC0030 implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0030() {
        }

        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            SearchView.this.m138();
        }
    }

    public int getSuggestionRowLayout() {
        return this.f282;
    }

    public int getSuggestionCommitIconResId() {
        return this.f284;
    }

    public void setSearchableInfo(SearchableInfo searchable) {
        this.f259 = searchable;
        if (this.f259 != null) {
            m165();
            m164();
        }
        this.f281 = m160();
        if (this.f281) {
            this.f272.setPrivateImeOptions("nm");
        }
        m145(m146());
    }

    public void setAppSearchData(Bundle appSearchData) {
        this.f262 = appSearchData;
    }

    public void setImeOptions(int imeOptions) {
        this.f272.setImeOptions(imeOptions);
    }

    public int getImeOptions() {
        return this.f272.getImeOptions();
    }

    public void setInputType(int inputType) {
        this.f272.setInputType(inputType);
    }

    public int getInputType() {
        return this.f272.getInputType();
    }

    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (this.f279 || !isFocusable()) {
            return false;
        }
        if (m146()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        boolean result = this.f272.requestFocus(direction, previouslyFocusedRect);
        if (result) {
            m145(false);
        }
        return result;
    }

    public void clearFocus() {
        this.f279 = true;
        super.clearFocus();
        this.f272.clearFocus();
        this.f272.setImeVisibility(false);
        this.f279 = false;
    }

    public void setOnQueryTextListener(AbstractC0040 listener) {
    }

    public void setOnCloseListener(AbstractC0035 listener) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) {
        this.f265 = listener;
    }

    public void setOnSuggestionListener(AbstractC0041 listener) {
    }

    public void setOnSearchClickListener(View.OnClickListener listener) {
        this.f264 = listener;
    }

    public CharSequence getQuery() {
        return this.f272.getText();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m158(CharSequence query, boolean submit) {
        this.f272.setText(query);
        if (query != null) {
            SearchAutoComplete searchAutoComplete = this.f272;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f242 = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            m167();
        }
    }

    public void setQueryHint(CharSequence hint) {
        this.f257 = hint;
        m164();
    }

    public CharSequence getQueryHint() {
        if (this.f257 != null) {
            return this.f257;
        }
        SearchableInfo searchableInfo = this.f259;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f274;
        }
        return getContext().getText(this.f259.getHintId());
    }

    public void setIconifiedByDefault(boolean iconified) {
        if (this.f243 != iconified) {
            this.f243 = iconified;
            m145(iconified);
            m164();
        }
    }

    public void setIconified(boolean iconify) {
        if (iconify) {
            m135();
        } else {
            m172();
        }
    }

    @Override // ♫.C0461, ♫.AbstractC0351
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m146() {
        return this.f246;
    }

    public void setSubmitButtonEnabled(boolean enabled) {
        this.f239 = enabled;
        m145(m146());
    }

    public void setQueryRefinementEnabled(boolean enable) {
        this.f285 = enable;
        AbstractC0274 r0 = this.f277;
        if (r0 instanceof View$OnClickListenerC0481) {
            ((View$OnClickListenerC0481) r0).m2274(enable ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(AbstractC0274 adapter) {
        this.f277 = adapter;
        this.f272.setAdapter(this.f277);
    }

    public AbstractC0274 getSuggestionsAdapter() {
        return this.f277;
    }

    public void setMaxWidth(int maxpixels) {
        this.f280 = maxpixels;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f280;
    }

    @Override // ♫.C0461
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        if (m146()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        if (widthMode == Integer.MIN_VALUE) {
            int i2 = this.f280;
            width = i2 > 0 ? Math.min(i2, width) : Math.min(getPreferredWidth(), width);
        } else if (widthMode == 0) {
            int i3 = this.f280;
            if (i3 <= 0) {
                i3 = getPreferredWidth();
            }
            width = i3;
        } else if (widthMode == 1073741824 && (i = this.f280) > 0) {
            width = Math.min(i, width);
        }
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        if (heightMode == Integer.MIN_VALUE) {
            height = Math.min(getPreferredHeight(), height);
        } else if (heightMode == 0) {
            height = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
    }

    @Override // ♫.C0461
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            m156(this.f272, this.f261);
            Rect rect = this.f252;
            Rect rect2 = this.f261;
            rect.set(rect2.left, 0, rect2.right, bottom - top);
            C0044 r0 = this.f273;
            if (r0 == null) {
                this.f273 = new C0044(this.f252, this.f261, this.f272);
                setTouchDelegate(this.f273);
                return;
            }
            r0.m181(this.f252, this.f261);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m156(View view, Rect rect) {
        view.getLocationInWindow(this.f250);
        getLocationInWindow(this.f244);
        int[] iArr = this.f250;
        int i = iArr[1];
        int[] iArr2 = this.f244;
        int top = i - iArr2[1];
        int left = iArr[0] - iArr2[0];
        rect.set(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0066.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0066.abc_search_view_preferred_height);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m145(boolean collapsed) {
        int iconVisibility;
        this.f246 = collapsed;
        int i = 8;
        boolean z = false;
        int visCollapsed = collapsed ? 0 : 8;
        boolean hasText = !TextUtils.isEmpty(this.f272.getText());
        this.f270.setVisibility(visCollapsed);
        m159(hasText);
        View view = this.f267;
        if (!collapsed) {
            i = 0;
        }
        view.setVisibility(i);
        if (this.f245.getDrawable() == null || this.f243) {
            iconVisibility = 8;
        } else {
            iconVisibility = 0;
        }
        this.f245.setVisibility(iconVisibility);
        m168();
        if (!hasText) {
            z = true;
        }
        m139(z);
        m166();
    }

    @Override // ♫.C0461, ♫.C0461, ♫.AbstractC0351
    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m160() {
        SearchableInfo searchableInfo = this.f259;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent testIntent = null;
            if (this.f259.getVoiceSearchLaunchWebSearch()) {
                testIntent = this.f260;
            } else if (this.f259.getVoiceSearchLaunchRecognizer()) {
                testIntent = this.f251;
            }
            if (testIntent == null || getContext().getPackageManager().resolveActivity(testIntent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // ♫.C0461
    /* renamed from: ø  reason: contains not printable characters */
    public final boolean m140() {
        return (this.f239 || this.f281) && !m146();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m159(boolean hasText) {
        int visibility = 8;
        if (this.f239 && m140() && hasFocus() && (hasText || !this.f281)) {
            visibility = 0;
        }
        this.f256.setVisibility(visibility);
    }

    /* renamed from: Г  reason: contains not printable characters */
    public final void m166() {
        int visibility = 8;
        if (m140() && (this.f256.getVisibility() == 0 || this.f241.getVisibility() == 0)) {
            visibility = 0;
        }
        this.f247.setVisibility(visibility);
    }

    /* renamed from: ₢  reason: contains not printable characters */
    public final void m168() {
        boolean showClose = true;
        boolean hasText = !TextUtils.isEmpty(this.f272.getText());
        int i = 0;
        if (!hasText && (!this.f243 || this.f283)) {
            showClose = false;
        }
        ImageView imageView = this.f248;
        if (!showClose) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable closeButtonImg = this.f248.getDrawable();
        if (closeButtonImg != null) {
            closeButtonImg.setState(hasText ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: ₧  reason: contains not printable characters */
    public final void m171() {
        post(this.f275);
    }

    /* renamed from: А  reason: contains not printable characters */
    public void m163() {
        int[] stateSet = this.f272.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable searchPlateBg = this.f255.getBackground();
        if (searchPlateBg != null) {
            searchPlateBg.setState(stateSet);
        }
        Drawable submitAreaBg = this.f247.getBackground();
        if (submitAreaBg != null) {
            submitAreaBg.setState(stateSet);
        }
        invalidate();
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f275);
        post(this.f258);
        super.onDetachedFromWindow();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m157(CharSequence queryText) {
        setQuery(queryText);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$µ  reason: contains not printable characters */
    public class View$OnClickListenerC0028 implements View.OnClickListener {
        public View$OnClickListenerC0028() {
        }

        public void onClick(View v) {
            SearchView searchView = SearchView.this;
            if (v == searchView.f270) {
                searchView.m172();
            } else if (v == searchView.f248) {
                searchView.m135();
            } else if (v == searchView.f256) {
                searchView.m167();
            } else if (v == searchView.f241) {
                searchView.m170();
            } else if (v == searchView.f272) {
                searchView.m137();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$₩  reason: contains not printable characters */
    public class View$OnKeyListenerC0039 implements View.OnKeyListener {
        public View$OnKeyListenerC0039() {
        }

        public boolean onKey(View v, int keyCode, KeyEvent event) {
            SearchView searchView = SearchView.this;
            if (searchView.f259 == null) {
                return false;
            }
            if (searchView.f272.isPopupShowing() && SearchView.this.f272.getListSelection() != -1) {
                return SearchView.this.m162(keyCode, event);
            }
            if (SearchView.this.f272.m174() || !event.hasNoModifiers() || event.getAction() != 1 || keyCode != 66) {
                return false;
            }
            v.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m154(0, (String) null, searchView2.f272.getText().toString());
            return true;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m162(int keyCode, KeyEvent event) {
        int selPoint;
        if (this.f259 != null && this.f277 != null && event.getAction() == 0 && event.hasNoModifiers()) {
            if (keyCode == 66 || keyCode == 84 || keyCode == 61) {
                return m147(this.f272.getListSelection());
            }
            if (keyCode == 21 || keyCode == 22) {
                if (keyCode == 21) {
                    selPoint = 0;
                } else {
                    selPoint = this.f272.length();
                }
                this.f272.setSelection(selPoint);
                this.f272.setListSelection(0);
                this.f272.clearListSelection();
                f238.m177(this.f272, true);
                return true;
            } else if (keyCode != 19 || this.f272.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final CharSequence m151(CharSequence hintText) {
        if (!this.f243 || this.f253 == null) {
            return hintText;
        }
        int textSize = (int) (((double) this.f272.getTextSize()) * 1.25d);
        this.f253.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        ssb.setSpan(new ImageSpan(this.f253), 1, 2, 33);
        ssb.append(hintText);
        return ssb;
    }

    /* renamed from: Б  reason: contains not printable characters */
    public final void m164() {
        CharSequence hint = getQueryHint();
        this.f272.setHint(m151(hint == null ? "" : hint));
    }

    /* renamed from: В  reason: contains not printable characters */
    public final void m165() {
        this.f272.setThreshold(this.f259.getSuggestThreshold());
        this.f272.setImeOptions(this.f259.getImeOptions());
        int inputType = this.f259.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f259.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f272.setInputType(inputType);
        AbstractC0274 r1 = this.f277;
        if (r1 != null) {
            r1.m1241((Cursor) null);
        }
        if (this.f259.getSuggestAuthority() != null) {
            this.f277 = new View$OnClickListenerC0481(getContext(), this, this.f259, this.f276);
            this.f272.setAdapter(this.f277);
            View$OnClickListenerC0481 r12 = (View$OnClickListenerC0481) this.f277;
            if (this.f285) {
                i = 2;
            }
            r12.m2274(i);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m139(boolean empty) {
        int visibility = 8;
        if (this.f281 && !m146() && empty) {
            visibility = 0;
            this.f256.setVisibility(8);
        }
        this.f241.setVisibility(visibility);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$฿  reason: contains not printable characters */
    public class C0034 implements TextView.OnEditorActionListener {
        public C0034() {
        }

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            SearchView.this.m167();
            return true;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m144(CharSequence newText) {
        CharSequence text = this.f272.getText();
        this.f242 = text;
        boolean z = true;
        boolean hasText = !TextUtils.isEmpty(text);
        m159(hasText);
        if (hasText) {
            z = false;
        }
        m139(z);
        m168();
        m166();
        this.f249 = newText.toString();
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m167() {
        CharSequence query = this.f272.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            if (this.f259 != null) {
                m154(0, (String) null, query.toString());
            }
            this.f272.setImeVisibility(false);
            m136();
        }
    }

    @Override // ♫.C0461
    /* renamed from: Ø  reason: contains not printable characters */
    public final void m136() {
        this.f272.dismissDropDown();
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m135() {
        if (!TextUtils.isEmpty(this.f272.getText())) {
            this.f272.setText("");
            this.f272.requestFocus();
            this.f272.setImeVisibility(true);
        } else if (this.f243) {
            clearFocus();
            m145(true);
        }
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m172() {
        m145(false);
        this.f272.requestFocus();
        this.f272.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f264;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public void m170() {
        if (this.f259 != null) {
            SearchableInfo searchable = this.f259;
            try {
                if (searchable.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m142(this.f260, searchable));
                } else if (searchable.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m148(this.f251, searchable));
                }
            } catch (ActivityNotFoundException e) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public void m169() {
        m145(m146());
        m171();
        if (this.f272.hasFocus()) {
            m137();
        }
    }

    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        m171();
    }

    @Override // ♫.C0461, ♫.C0461, ♫.AbstractC0351
    /* renamed from: θ  reason: contains not printable characters */
    public void m152() {
        m158("", false);
        clearFocus();
        m145(true);
        this.f272.setImeOptions(this.f278);
        this.f283 = false;
    }

    @Override // ♫.C0461, ♫.AbstractC0351
    /* renamed from: Φ  reason: contains not printable characters */
    public void m143() {
        if (!this.f283) {
            this.f283 = true;
            this.f278 = this.f272.getImeOptions();
            this.f272.setImeOptions(this.f278 | 33554432);
            this.f272.setText("");
            setIconified(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$不  reason: contains not printable characters */
    public static class C0042 extends AbstractC0584 {
        public static final Parcelable.Creator<C0042> CREATOR = new C0043();

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean f304;

        public C0042(Parcelable superState) {
            super(superState);
        }

        public C0042(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f304 = ((Boolean) source.readValue(null)).booleanValue();
        }

        @Override // ♫.AbstractC0584
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeValue(Boolean.valueOf(this.f304));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f304 + "}";
        }

        /* renamed from: androidx.appcompat.widget.SearchView$不$θ  reason: contains not printable characters */
        public static class C0043 implements Parcelable.ClassLoaderCreator<C0042> {
            /* renamed from: θ  reason: contains not printable characters */
            public C0042 createFromParcel(Parcel in, ClassLoader loader) {
                return new C0042(in, loader);
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0042 createFromParcel(Parcel in) {
                return new C0042(in, null);
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0042[] newArray(int size) {
                return new C0042[size];
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C0042 ss = new C0042(super.onSaveInstanceState());
        ss.f304 = m146();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C0042)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0042 ss = (C0042) state;
        super.onRestoreInstanceState(ss.m2863());
        m145(ss.f304);
        requestLayout();
    }

    @Override // ♫.C0461
    /* renamed from: ø  reason: contains not printable characters */
    public void m138() {
        int offset;
        if (this.f240.getWidth() > 1) {
            Resources res = getContext().getResources();
            int anchorPadding = this.f255.getPaddingLeft();
            Rect dropDownPadding = new Rect();
            boolean isLayoutRtl = C0498.m2371((View) this);
            int iconOffset = this.f243 ? res.getDimensionPixelSize(C0066.abc_dropdownitem_icon_width) + res.getDimensionPixelSize(C0066.abc_dropdownitem_text_padding_left) : 0;
            this.f272.getDropDownBackground().getPadding(dropDownPadding);
            if (isLayoutRtl) {
                offset = -dropDownPadding.left;
            } else {
                offset = anchorPadding - (dropDownPadding.left + iconOffset);
            }
            this.f272.setDropDownHorizontalOffset(offset);
            this.f272.setDropDownWidth((((this.f240.getWidth() + dropDownPadding.left) + dropDownPadding.right) + iconOffset) - anchorPadding);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m147(int position) {
        m161(position, 0, (String) null);
        this.f272.setImeVisibility(false);
        m136();
        return true;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m141(int position) {
        m153(position);
        return true;
    }

    /* renamed from: androidx.appcompat.widget.SearchView$₣  reason: contains not printable characters */
    public class C0036 implements AdapterView.OnItemClickListener {
        public C0036() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.m147(position);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$₤  reason: contains not printable characters */
    public class C0037 implements AdapterView.OnItemSelectedListener {
        public C0037() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.m141(position);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Override // ♫.C0461, ♫.C0461
    /* renamed from: θ  reason: contains not printable characters */
    public final void m153(int position) {
        CharSequence oldQuery = this.f272.getText();
        Cursor c = this.f277.m1235();
        if (c != null) {
            if (c.moveToPosition(position)) {
                CharSequence newQuery = this.f277.m1238(c);
                if (newQuery != null) {
                    setQuery(newQuery);
                } else {
                    setQuery(oldQuery);
                }
            } else {
                setQuery(oldQuery);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m161(int position, int actionKey, String actionMsg) {
        Cursor c = this.f277.m1235();
        if (c == null || !c.moveToPosition(position)) {
            return false;
        }
        m155(m149(c, actionKey, actionMsg));
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m155(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException ex) {
                Log.e("SearchView", "Failed launch activity: " + intent, ex);
            }
        }
    }

    private void setQuery(CharSequence query) {
        this.f272.setText(query);
        this.f272.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m154(int actionKey, String actionMsg, String query) {
        getContext().startActivity(m150("android.intent.action.SEARCH", null, null, query, actionKey, actionMsg));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Intent m150(String action, Uri data, String extraData, String query, int actionKey, String actionMsg) {
        Intent intent = new Intent(action);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.f242);
        if (query != null) {
            intent.putExtra("query", query);
        }
        if (extraData != null) {
            intent.putExtra("intent_extra_data_key", extraData);
        }
        Bundle bundle = this.f262;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (actionKey != 0) {
            intent.putExtra("action_key", actionKey);
            intent.putExtra("action_msg", actionMsg);
        }
        intent.setComponent(this.f259.getSearchActivity());
        return intent;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final Intent m142(Intent baseIntent, SearchableInfo searchable) {
        String str;
        Intent voiceIntent = new Intent(baseIntent);
        ComponentName searchActivity = searchable.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        return voiceIntent;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Intent m148(Intent baseIntent, SearchableInfo searchable) {
        String str;
        ComponentName searchActivity = searchable.getSearchActivity();
        Intent queryIntent = new Intent("android.intent.action.SEARCH");
        queryIntent.setComponent(searchActivity);
        PendingIntent pending = PendingIntent.getActivity(getContext(), 0, queryIntent, 1073741824);
        Bundle queryExtras = new Bundle();
        Bundle bundle = this.f262;
        if (bundle != null) {
            queryExtras.putParcelable("app_data", bundle);
        }
        Intent voiceIntent = new Intent(baseIntent);
        String languageModel = "free_form";
        String prompt = null;
        String language = null;
        int maxResults = 1;
        Resources resources = getResources();
        if (searchable.getVoiceLanguageModeId() != 0) {
            languageModel = resources.getString(searchable.getVoiceLanguageModeId());
        }
        if (searchable.getVoicePromptTextId() != 0) {
            prompt = resources.getString(searchable.getVoicePromptTextId());
        }
        if (searchable.getVoiceLanguageId() != 0) {
            language = resources.getString(searchable.getVoiceLanguageId());
        }
        if (searchable.getVoiceMaxResults() != 0) {
            maxResults = searchable.getVoiceMaxResults();
        }
        voiceIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", languageModel);
        voiceIntent.putExtra("android.speech.extra.PROMPT", prompt);
        voiceIntent.putExtra("android.speech.extra.LANGUAGE", language);
        voiceIntent.putExtra("android.speech.extra.MAX_RESULTS", maxResults);
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pending);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", queryExtras);
        return voiceIntent;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Intent m149(Cursor c, int actionKey, String actionMsg) {
        int rowNum;
        String data;
        String id;
        try {
            String action = View$OnClickListenerC0481.m2258(c, "suggest_intent_action");
            if (action == null) {
                action = this.f259.getSuggestIntentAction();
            }
            if (action == null) {
                action = "android.intent.action.SEARCH";
            }
            String data2 = View$OnClickListenerC0481.m2258(c, "suggest_intent_data");
            if (data2 == null) {
                data2 = this.f259.getSuggestIntentData();
            }
            if (data2 == null || (id = View$OnClickListenerC0481.m2258(c, "suggest_intent_data_id")) == null) {
                data = data2;
            } else {
                data = data2 + "/" + Uri.encode(id);
            }
            return m150(action, data == null ? null : Uri.parse(data), View$OnClickListenerC0481.m2258(c, "suggest_intent_extra_data"), View$OnClickListenerC0481.m2258(c, "suggest_intent_query"), actionKey, actionMsg);
        } catch (RuntimeException e) {
            try {
                rowNum = c.getPosition();
            } catch (RuntimeException e2) {
                rowNum = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + rowNum + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m137() {
        f238.m175(this.f272);
        f238.m176(this.f272);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m134(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: androidx.appcompat.widget.SearchView$θ  reason: contains not printable characters */
    public class C0033 implements TextWatcher {
        public C0033() {
        }

        public void beforeTextChanged(CharSequence s, int start, int before, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int after) {
            SearchView.this.m144(s);
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$与  reason: contains not printable characters */
    public static class C0044 extends TouchDelegate {

        /* renamed from: ø  reason: contains not printable characters */
        public final Rect f305 = new Rect();

        /* renamed from: Φ  reason: contains not printable characters */
        public final Rect f306 = new Rect();

        /* renamed from: θ  reason: contains not printable characters */
        public final int f307;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Rect f308 = new Rect();

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final View f309;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f310;

        public C0044(Rect targetBounds, Rect actualBounds, View delegateView) {
            super(targetBounds, delegateView);
            this.f307 = ViewConfiguration.get(delegateView.getContext()).getScaledTouchSlop();
            m181(targetBounds, actualBounds);
            this.f309 = delegateView;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m181(Rect desiredBounds, Rect actualBounds) {
            this.f308.set(desiredBounds);
            this.f305.set(desiredBounds);
            Rect rect = this.f305;
            int i = this.f307;
            rect.inset(-i, -i);
            this.f306.set(actualBounds);
        }

        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            boolean sendToDelegate = false;
            boolean hit = true;
            int action = event.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    sendToDelegate = this.f310;
                    if (sendToDelegate && !this.f305.contains(x, y)) {
                        hit = false;
                    }
                } else if (action == 3) {
                    sendToDelegate = this.f310;
                    this.f310 = false;
                }
            } else if (this.f308.contains(x, y)) {
                this.f310 = true;
                sendToDelegate = true;
            }
            if (!sendToDelegate) {
                return false;
            }
            if (!hit || this.f306.contains(x, y)) {
                Rect rect = this.f306;
                event.setLocation((float) (x - rect.left), (float) (y - rect.top));
            } else {
                event.setLocation((float) (this.f309.getWidth() / 2), (float) (this.f309.getHeight() / 2));
            }
            return this.f309.dispatchTouchEvent(event);
        }
    }

    public static class SearchAutoComplete extends C0415 {

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean f286;

        /* renamed from: θ  reason: contains not printable characters */
        public int f287;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public SearchView f288;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Runnable f289;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$θ  reason: contains not printable characters */
        public class RunnableC0027 implements Runnable {
            public RunnableC0027() {
            }

            public void run() {
                SearchAutoComplete.this.m173();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs) {
            this(context, attrs, C0158.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.f289 = new RunnableC0027();
            this.f287 = getThreshold();
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void setSearchView(SearchView searchView) {
            this.f288 = searchView;
        }

        public void setThreshold(int threshold) {
            super.setThreshold(threshold);
            this.f287 = threshold;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m174() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void replaceText(CharSequence text) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus && this.f288.hasFocus() && getVisibility() == 0) {
                this.f286 = true;
                if (SearchView.m134(getContext())) {
                    SearchView.f238.m177(this, true);
                }
            }
        }

        public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            this.f288.m169();
        }

        public boolean enoughToFilter() {
            return this.f287 <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int keyCode, KeyEvent event) {
            if (keyCode == 4) {
                if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState state = getKeyDispatcherState();
                    if (state != null) {
                        state.startTracking(event, this);
                    }
                    return true;
                } else if (event.getAction() == 1) {
                    KeyEvent.DispatcherState state2 = getKeyDispatcherState();
                    if (state2 != null) {
                        state2.handleUpEvent(event);
                    }
                    if (event.isTracking() && !event.isCanceled()) {
                        this.f288.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(keyCode, event);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration config = getResources().getConfiguration();
            int widthDp = config.screenWidthDp;
            int heightDp = config.screenHeightDp;
            if (widthDp >= 960 && heightDp >= 720 && config.orientation == 2) {
                return 256;
            }
            if (widthDp >= 600) {
                return 192;
            }
            if (widthDp < 640 || heightDp < 480) {
                return 160;
            }
            return 192;
        }

        @Override // ♫.C0415
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection ic = super.onCreateInputConnection(editorInfo);
            if (this.f286) {
                removeCallbacks(this.f289);
                post(this.f289);
            }
            return ic;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m173() {
            if (this.f286) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f286 = false;
            }
        }

        public void setImeVisibility(boolean visible) {
            InputMethodManager imm = (InputMethodManager) getContext().getSystemService("input_method");
            if (!visible) {
                this.f286 = false;
                removeCallbacks(this.f289);
                imm.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (imm.isActive(this)) {
                this.f286 = false;
                removeCallbacks(this.f289);
                imm.showSoftInput(this, 0);
            } else {
                this.f286 = true;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$₧  reason: contains not printable characters */
    public static class C0038 {

        /* renamed from: ø  reason: contains not printable characters */
        public Method f300;

        /* renamed from: Φ  reason: contains not printable characters */
        public Method f301;

        /* renamed from: θ  reason: contains not printable characters */
        public Method f302;

        public C0038() {
            try {
                this.f302 = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f302.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f301 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f301.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.f300 = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f300.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m175(AutoCompleteTextView view) {
            Method method = this.f302;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m176(AutoCompleteTextView view) {
            Method method = this.f301;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m177(AutoCompleteTextView view, boolean visible) {
            Method method = this.f300;
            if (method != null) {
                try {
                    method.invoke(view, Boolean.valueOf(visible));
                } catch (Exception e) {
                }
            }
        }
    }
}
