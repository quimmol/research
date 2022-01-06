package ♫;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: ♫.服  reason: contains not printable characters */
public class C0463 implements AbstractC0398 {

    /* renamed from: ø  reason: contains not printable characters */
    public static Method f1724 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);

    /* renamed from: Φ  reason: contains not printable characters */
    public static Method f1725 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);

    /* renamed from: θ  reason: contains not printable characters */
    public static Method f1726;

    /* renamed from: µ  reason: contains not printable characters */
    public int f1727;

    /* renamed from: µ  reason: contains not printable characters and collision with other field name */
    public boolean f1728;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1729;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1730;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1731;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f1732;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public int f1733;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1734;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public int f1735;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Rect f1736;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f1737;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1738;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1739;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f1740;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public DataSetObserver f1741;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Rect f1742;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1743;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Handler f1744;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1745;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AdapterView.OnItemClickListener f1746;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AdapterView.OnItemSelectedListener f1747;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ListAdapter f1748;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PopupWindow f1749;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0453 f1750;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View$OnTouchListenerC0464 f1751;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0466 f1752;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final RunnableC0467 f1753;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final RunnableC0470 f1754;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f1755;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1756;

    /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
    public boolean f1757;

    static {
        try {
            f1726 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0463(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public C0463(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f1739 = -2;
        this.f1735 = -2;
        this.f1731 = 1002;
        this.f1727 = 0;
        this.f1732 = false;
        this.f1728 = false;
        this.f1756 = Integer.MAX_VALUE;
        this.f1755 = 0;
        this.f1754 = new RunnableC0470();
        this.f1751 = new View$OnTouchListenerC0464();
        this.f1752 = new C0466();
        this.f1753 = new RunnableC0467();
        this.f1742 = new Rect();
        this.f1740 = context;
        this.f1744 = new Handler(context.getMainLooper());
        TypedArray a = context.obtainStyledAttributes(attrs, C0291.ListPopupWindow, defStyleAttr, defStyleRes);
        this.f1733 = a.getDimensionPixelOffset(C0291.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1729 = a.getDimensionPixelOffset(C0291.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1729 != 0) {
            this.f1738 = true;
        }
        a.recycle();
        this.f1749 = new C0433(context, attrs, defStyleAttr, defStyleRes);
        this.f1749.setInputMethodMode(1);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2225(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.f1741;
        if (dataSetObserver == null) {
            this.f1741 = new C0465();
        } else {
            ListAdapter listAdapter = this.f1748;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1748 = adapter;
        if (adapter != null) {
            adapter.registerDataSetObserver(this.f1741);
        }
        C0453 r0 = this.f1750;
        if (r0 != null) {
            r0.setAdapter(this.f1748);
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m2199(int position) {
        this.f1755 = position;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2227(boolean modal) {
        this.f1757 = modal;
        this.f1749.setFocusable(modal);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m2207() {
        return this.f1757;
    }

    @Override // ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public Drawable m2215() {
        return this.f1749.getBackground();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2222(Drawable d) {
        this.f1749.setBackgroundDrawable(d);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2220(int animationStyle) {
        this.f1749.setAnimationStyle(animationStyle);
    }

    @Override // ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public View m2216() {
        return this.f1737;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2223(View anchor) {
        this.f1737 = anchor;
    }

    @Override // ♫.AbstractC0398
    /* renamed from: Φ  reason: contains not printable characters */
    public int m2208() {
        return this.f1733;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m2201(int offset) {
        this.f1733 = offset;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m2203() {
        if (!this.f1738) {
            return 0;
        }
        return this.f1729;
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m2229(int offset) {
        this.f1729 = offset;
        this.f1738 = true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2221(Rect bounds) {
        this.f1736 = bounds;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2205(int gravity) {
        this.f1727 = gravity;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m2200() {
        return this.f1735;
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public void m2230(int width) {
        this.f1735 = width;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2210(int width) {
        Drawable popupBackground = this.f1749.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.f1742);
            Rect rect = this.f1742;
            this.f1735 = rect.left + rect.right + width;
            return;
        }
        m2230(width);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2224(AdapterView.OnItemClickListener clickListener) {
        this.f1746 = clickListener;
    }

    @Override // ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public void m2219() {
        int widthSpec;
        int heightSpec;
        int widthSpec2;
        int heightSpec2;
        int height = m2213();
        boolean noInputMethod = m2228();
        C0247.m1135(this.f1749, this.f1731);
        boolean z = true;
        if (!this.f1749.isShowing()) {
            int widthSpec3 = this.f1735;
            if (widthSpec3 == -1) {
                widthSpec = -1;
            } else if (widthSpec3 == -2) {
                widthSpec = m2216().getWidth();
            } else {
                widthSpec = this.f1735;
            }
            int i = this.f1739;
            if (i == -1) {
                heightSpec = -1;
            } else if (i == -2) {
                heightSpec = height;
            } else {
                heightSpec = this.f1739;
            }
            this.f1749.setWidth(widthSpec);
            this.f1749.setHeight(heightSpec);
            m2206(true);
            this.f1749.setOutsideTouchable(!this.f1728 && !this.f1732);
            this.f1749.setTouchInterceptor(this.f1751);
            if (this.f1730) {
                C0247.m1137(this.f1749, this.f1734);
            }
            Method method = f1724;
            if (method != null) {
                try {
                    method.invoke(this.f1749, this.f1736);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0247.m1136(this.f1749, m2216(), this.f1733, this.f1729, this.f1727);
            this.f1750.setSelection(-1);
            if (!this.f1757 || this.f1750.isInTouchMode()) {
                m2209();
            }
            if (!this.f1757) {
                this.f1744.post(this.f1753);
            }
        } else if (C0248.m1141(m2216())) {
            int widthSpec4 = this.f1735;
            if (widthSpec4 == -1) {
                widthSpec2 = -1;
            } else if (widthSpec4 == -2) {
                widthSpec2 = m2216().getWidth();
            } else {
                widthSpec2 = this.f1735;
            }
            int i2 = this.f1739;
            if (i2 == -1) {
                heightSpec2 = noInputMethod ? height : -1;
                if (noInputMethod) {
                    this.f1749.setWidth(this.f1735 == -1 ? -1 : 0);
                    this.f1749.setHeight(0);
                } else {
                    this.f1749.setWidth(this.f1735 == -1 ? -1 : 0);
                    this.f1749.setHeight(-1);
                }
            } else {
                heightSpec2 = i2 == -2 ? height : this.f1739;
            }
            PopupWindow popupWindow = this.f1749;
            if (this.f1728 || this.f1732) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1749.update(m2216(), this.f1733, this.f1729, widthSpec2 < 0 ? -1 : widthSpec2, heightSpec2 < 0 ? -1 : heightSpec2);
        }
    }

    @Override // ♫.AbstractC0398
    public void dismiss() {
        this.f1749.dismiss();
        m2204();
        this.f1749.setContentView(null);
        this.f1750 = null;
        this.f1744.removeCallbacks(this.f1754);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2226(PopupWindow.OnDismissListener listener) {
        this.f1749.setOnDismissListener(listener);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m2204() {
        View view = this.f1745;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1745);
            }
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m2202(int mode) {
        this.f1749.setInputMethodMode(mode);
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m2231(int position) {
        C0453 list = this.f1750;
        if (m2212() && list != null) {
            list.setListSelectionHidden(false);
            list.setSelection(position);
            if (list.getChoiceMode() != 0) {
                list.setItemChecked(position, true);
            }
        }
    }

    @Override // ♫.AbstractC0398
    /* renamed from: Φ  reason: contains not printable characters */
    public void m2209() {
        C0453 list = this.f1750;
        if (list != null) {
            list.setListSelectionHidden(true);
            list.requestLayout();
        }
    }

    @Override // ♫.AbstractC0398
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m2212() {
        return this.f1749.isShowing();
    }

    @Override // ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2228() {
        return this.f1749.getInputMethodMode() == 2;
    }

    @Override // ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public ListView m2217() {
        return this.f1750;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0453 m2218(Context context, boolean hijackFocus) {
        return new C0453(context, hijackFocus);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v25, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public final int m2213() {
        int padding;
        int childWidthSpec;
        int widthSize;
        int widthMode;
        int otherHeights = 0;
        boolean ignoreBottomDecorations = false;
        if (this.f1750 == null) {
            Context context = this.f1740;
            new RunnableC0469();
            this.f1750 = m2218(context, !this.f1757);
            Drawable drawable = this.f1743;
            if (drawable != null) {
                this.f1750.setSelector(drawable);
            }
            this.f1750.setAdapter(this.f1748);
            this.f1750.setOnItemClickListener(this.f1746);
            this.f1750.setFocusable(true);
            this.f1750.setFocusableInTouchMode(true);
            this.f1750.setOnItemSelectedListener(new C0468());
            this.f1750.setOnScrollListener(this.f1752);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1747;
            if (onItemSelectedListener != null) {
                this.f1750.setOnItemSelectedListener(onItemSelectedListener);
            }
            ViewGroup dropDownView = this.f1750;
            View hintView = this.f1745;
            if (hintView != null) {
                LinearLayout hintContainer = new LinearLayout(context);
                hintContainer.setOrientation(1);
                LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i = this.f1755;
                if (i == 0) {
                    hintContainer.addView(hintView);
                    hintContainer.addView(dropDownView, hintParams);
                } else if (i != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1755);
                } else {
                    hintContainer.addView(dropDownView, hintParams);
                    hintContainer.addView(hintView);
                }
                if (this.f1735 >= 0) {
                    widthMode = Integer.MIN_VALUE;
                    widthSize = this.f1735;
                } else {
                    widthMode = 0;
                    widthSize = 0;
                }
                hintView.measure(View.MeasureSpec.makeMeasureSpec(widthSize, widthMode), 0);
                LinearLayout.LayoutParams hintParams2 = (LinearLayout.LayoutParams) hintView.getLayoutParams();
                dropDownView = hintContainer;
                otherHeights = hintView.getMeasuredHeight() + hintParams2.topMargin + hintParams2.bottomMargin;
            }
            this.f1749.setContentView(dropDownView);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1749.getContentView();
            View view = this.f1745;
            if (view != null) {
                LinearLayout.LayoutParams hintParams3 = (LinearLayout.LayoutParams) view.getLayoutParams();
                otherHeights = view.getMeasuredHeight() + hintParams3.topMargin + hintParams3.bottomMargin;
            }
        }
        Drawable background = this.f1749.getBackground();
        if (background != null) {
            background.getPadding(this.f1742);
            Rect rect = this.f1742;
            int i2 = rect.top;
            padding = rect.bottom + i2;
            if (!this.f1738) {
                this.f1729 = -i2;
            }
        } else {
            this.f1742.setEmpty();
            padding = 0;
        }
        if (this.f1749.getInputMethodMode() == 2) {
            ignoreBottomDecorations = true;
        }
        int maxHeight = m2214(m2216(), this.f1729, ignoreBottomDecorations);
        if (this.f1732 || this.f1739 == -1) {
            return maxHeight + padding;
        }
        int i3 = this.f1735;
        if (i3 == -2) {
            int i4 = this.f1740.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f1742;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i3 != -1) {
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        } else {
            int i5 = this.f1740.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f1742;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect3.left + rect3.right), 1073741824);
        }
        int listContent = this.f1750.m2156(childWidthSpec, maxHeight - otherHeights, -1);
        if (listContent > 0) {
            otherHeights += padding + this.f1750.getPaddingTop() + this.f1750.getPaddingBottom();
        }
        return listContent + otherHeights;
    }

    /* renamed from: ♫.服$θ  reason: contains not printable characters */
    public class RunnableC0469 implements Runnable {
        public RunnableC0469() {
        }

        public void run() {
            View view = C0463.this.m2216();
            if (view != null && view.getWindowToken() != null) {
                C0463.this.m2219();
            }
        }
    }

    /* renamed from: ♫.服$Φ  reason: contains not printable characters */
    public class C0468 implements AdapterView.OnItemSelectedListener {
        public C0468() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            C0453 dropDownList;
            if (position != -1 && (dropDownList = C0463.this.f1750) != null) {
                dropDownList.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2211(boolean overlapAnchor) {
        this.f1730 = true;
        this.f1734 = overlapAnchor;
    }

    /* renamed from: ♫.服$Ø  reason: contains not printable characters */
    public class C0465 extends DataSetObserver {
        public C0465() {
        }

        public void onChanged() {
            if (C0463.this.m2212()) {
                C0463.this.m2219();
            }
        }

        public void onInvalidated() {
            C0463.this.dismiss();
        }
    }

    /* renamed from: ♫.服$ø  reason: contains not printable characters */
    public class RunnableC0467 implements Runnable {
        public RunnableC0467() {
        }

        public void run() {
            C0463.this.m2209();
        }
    }

    /* renamed from: ♫.服$₩  reason: contains not printable characters */
    public class RunnableC0470 implements Runnable {
        public RunnableC0470() {
        }

        public void run() {
            C0453 r0 = C0463.this.f1750;
            if (r0 != null && C0248.m1141((View) r0) && C0463.this.f1750.getCount() > C0463.this.f1750.getChildCount()) {
                int childCount = C0463.this.f1750.getChildCount();
                C0463 r1 = C0463.this;
                if (childCount <= r1.f1756) {
                    r1.f1749.setInputMethodMode(2);
                    C0463.this.m2219();
                }
            }
        }
    }

    /* renamed from: ♫.服$µ  reason: contains not printable characters */
    public class View$OnTouchListenerC0464 implements View.OnTouchListener {
        public View$OnTouchListenerC0464() {
        }

        public boolean onTouch(View v, MotionEvent event) {
            PopupWindow popupWindow;
            int action = event.getAction();
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (action == 0 && (popupWindow = C0463.this.f1749) != null && popupWindow.isShowing() && x >= 0 && x < C0463.this.f1749.getWidth() && y >= 0 && y < C0463.this.f1749.getHeight()) {
                C0463 r3 = C0463.this;
                r3.f1744.postDelayed(r3.f1754, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0463 r32 = C0463.this;
                r32.f1744.removeCallbacks(r32.f1754);
                return false;
            }
        }
    }

    /* renamed from: ♫.服$ö  reason: contains not printable characters */
    public class C0466 implements AbsListView.OnScrollListener {
        public C0466() {
        }

        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
            if (scrollState == 1 && !C0463.this.m2228() && C0463.this.f1749.getContentView() != null) {
                C0463 r0 = C0463.this;
                r0.f1744.removeCallbacks(r0.f1754);
                C0463.this.f1754.run();
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m2206(boolean clip) {
        Method method = f1726;
        if (method != null) {
            try {
                method.invoke(this.f1749, Boolean.valueOf(clip));
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2214(View anchor, int yOffset, boolean ignoreBottomDecorations) {
        Method method = f1725;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1749, anchor, Integer.valueOf(yOffset), Boolean.valueOf(ignoreBottomDecorations))).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1749.getMaxAvailableHeight(anchor, yOffset);
    }
}
