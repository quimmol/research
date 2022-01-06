package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import ♫.C0065;
import ♫.C0158;
import ♫.C0248;
import ♫.C0291;
import ♫.C0461;
import ♫.DialogC0320;

public class AlertController {

    /* renamed from: µ  reason: contains not printable characters */
    public int f0;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public Drawable f2;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f3;

    /* renamed from: ö  reason: contains not printable characters */
    public int f4;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public CharSequence f5;

    /* renamed from: ø  reason: contains not printable characters */
    public int f6;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public Drawable f7;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public Message f8;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public Button f9;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f10;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f11;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Drawable f12;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Message f13;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f14;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Button f15;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public TextView f16;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f17;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f18;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f19;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f20;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f21;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Handler f22;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Message f23;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View.OnClickListener f24 = new View$OnClickListenerC0009();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f25;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Window f26;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Button f27;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ImageView f28;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ListAdapter f29;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ListView f30;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TextView f31;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public NestedScrollView f32;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f33;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final DialogC0320 f34;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f35 = false;

    /* renamed from: А  reason: contains not printable characters */
    public int f36;

    /* renamed from: Б  reason: contains not printable characters */
    public int f37;

    /* renamed from: В  reason: contains not printable characters */
    public int f38 = 0;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f39 = -1;

    /* renamed from: ₢  reason: contains not printable characters */
    public int f40;

    /* renamed from: ₣  reason: contains not printable characters */
    public int f41;

    /* renamed from: ₤  reason: contains not printable characters */
    public int f42;

    /* renamed from: ₧  reason: contains not printable characters */
    public int f43;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f44 = 0;

    /* renamed from: androidx.appcompat.app.AlertController$θ  reason: contains not printable characters */
    public class View$OnClickListenerC0009 implements View.OnClickListener {
        public View$OnClickListenerC0009() {
        }

        public void onClick(View v) {
            Message m;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (v != alertController.f27 || (message3 = alertController.f23) == null) {
                AlertController alertController2 = AlertController.this;
                if (v != alertController2.f15 || (message2 = alertController2.f13) == null) {
                    AlertController alertController3 = AlertController.this;
                    if (v != alertController3.f9 || (message = alertController3.f8) == null) {
                        m = null;
                    } else {
                        m = Message.obtain(message);
                    }
                } else {
                    m = Message.obtain(message2);
                }
            } else {
                m = Message.obtain(message3);
            }
            if (m != null) {
                m.sendToTarget();
            }
            AlertController alertController4 = AlertController.this;
            alertController4.f22.obtainMessage(1, alertController4.f34).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$₩  reason: contains not printable characters */
    public static final class HandlerC0011 extends Handler {

        /* renamed from: θ  reason: contains not printable characters */
        public WeakReference<DialogInterface> f110;

        public HandlerC0011(DialogInterface dialog) {
            this.f110 = new WeakReference<>(dialog);
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) msg.obj).onClick(this.f110.get(), msg.what);
            } else if (i == 1) {
                ((DialogInterface) msg.obj).dismiss();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1(Context context) {
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(C0158.alertDialogCenterButtons, outValue, true);
        if (outValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, DialogC0320 di, Window window) {
        this.f20 = context;
        this.f34 = di;
        this.f26 = window;
        this.f22 = new HandlerC0011(di);
        TypedArray a = context.obtainStyledAttributes(null, C0291.AlertDialog, C0158.alertDialogStyle, 0);
        this.f41 = a.getResourceId(C0291.AlertDialog_android_layout, 0);
        this.f42 = a.getResourceId(C0291.AlertDialog_buttonPanelSideLayout, 0);
        this.f43 = a.getResourceId(C0291.AlertDialog_listLayout, 0);
        this.f40 = a.getResourceId(C0291.AlertDialog_multiChoiceItemLayout, 0);
        this.f36 = a.getResourceId(C0291.AlertDialog_singleChoiceItemLayout, 0);
        this.f37 = a.getResourceId(C0291.AlertDialog_listItemLayout, 0);
        this.f18 = a.getBoolean(C0291.AlertDialog_showTitle, true);
        this.f19 = a.getDimensionPixelSize(C0291.AlertDialog_buttonIconDimen, 0);
        a.recycle();
        di.m1457(1);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2(View v) {
        if (v.onCheckIsTextEditor()) {
            return true;
        }
        if (!(v instanceof ViewGroup)) {
            return false;
        }
        ViewGroup vg = (ViewGroup) v;
        int i = vg.getChildCount();
        while (i > 0) {
            i--;
            if (m2(vg.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m14() {
        this.f34.setContentView(m11());
        m5();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m11() {
        int i = this.f42;
        if (i == 0) {
            return this.f41;
        }
        if (this.f38 == 1) {
            return i;
        }
        return this.f41;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m9(CharSequence title) {
        this.f33 = title;
        TextView textView = this.f31;
        if (textView != null) {
            textView.setText(title);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m18(View customTitleView) {
        this.f14 = customTitleView;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m23(CharSequence message) {
        this.f17 = message;
        TextView textView = this.f16;
        if (textView != null) {
            textView.setText(message);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m6(int layoutResId) {
        this.f25 = null;
        this.f11 = layoutResId;
        this.f35 = false;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m7(View view) {
        this.f25 = view;
        this.f11 = 0;
        this.f35 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m19(View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) {
        this.f25 = view;
        this.f11 = 0;
        this.f35 = true;
        this.f6 = viewSpacingLeft;
        this.f1 = viewSpacingTop;
        this.f4 = viewSpacingRight;
        this.f0 = viewSpacingBottom;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m16(int whichButton, CharSequence text, DialogInterface.OnClickListener listener, Message msg, Drawable icon) {
        if (msg == null && listener != null) {
            msg = this.f22.obtainMessage(whichButton, listener);
        }
        if (whichButton == -3) {
            this.f5 = text;
            this.f8 = msg;
            this.f7 = icon;
        } else if (whichButton == -2) {
            this.f3 = text;
            this.f13 = msg;
            this.f12 = icon;
        } else if (whichButton == -1) {
            this.f10 = text;
            this.f23 = msg;
            this.f21 = icon;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m15(int resId) {
        this.f2 = null;
        this.f44 = resId;
        ImageView imageView = this.f28;
        if (imageView == null) {
            return;
        }
        if (resId != 0) {
            imageView.setVisibility(0);
            this.f28.setImageResource(this.f44);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m17(Drawable icon) {
        this.f2 = icon;
        this.f44 = 0;
        ImageView imageView = this.f28;
        if (imageView == null) {
            return;
        }
        if (icon != null) {
            imageView.setVisibility(0);
            this.f28.setImageDrawable(icon);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m12(int attrId) {
        TypedValue out = new TypedValue();
        this.f20.getTheme().resolveAttribute(attrId, out, true);
        return out.resourceId;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m24(KeyEvent event) {
        NestedScrollView nestedScrollView = this.f32;
        return nestedScrollView != null && nestedScrollView.m293(event);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m10(KeyEvent event) {
        NestedScrollView nestedScrollView = this.f32;
        return nestedScrollView != null && nestedScrollView.m293(event);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final ViewGroup m13(View customPanel, View defaultPanel) {
        if (customPanel == null) {
            if (defaultPanel instanceof ViewStub) {
                defaultPanel = ((ViewStub) defaultPanel).inflate();
            }
            return (ViewGroup) defaultPanel;
        }
        if (defaultPanel != null) {
            ViewParent parent = defaultPanel.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(defaultPanel);
            }
        }
        if (customPanel instanceof ViewStub) {
            customPanel = ((ViewStub) customPanel).inflate();
        }
        return (ViewGroup) customPanel;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m5() {
        ListAdapter listAdapter;
        View parentPanel = this.f26.findViewById(C0065.parentPanel);
        View defaultTopPanel = parentPanel.findViewById(C0065.topPanel);
        View defaultContentPanel = parentPanel.findViewById(C0065.contentPanel);
        View defaultButtonPanel = parentPanel.findViewById(C0065.buttonPanel);
        ViewGroup customPanel = (ViewGroup) parentPanel.findViewById(C0065.customPanel);
        m4(customPanel);
        View customTopPanel = customPanel.findViewById(C0065.topPanel);
        View customContentPanel = customPanel.findViewById(C0065.contentPanel);
        View customButtonPanel = customPanel.findViewById(C0065.buttonPanel);
        ViewGroup topPanel = m13(customTopPanel, defaultTopPanel);
        ViewGroup contentPanel = m13(customContentPanel, defaultContentPanel);
        ViewGroup buttonPanel = m13(customButtonPanel, defaultButtonPanel);
        m8(contentPanel);
        m20(buttonPanel);
        m3(topPanel);
        boolean hasCustomPanel = customPanel.getVisibility() != 8;
        boolean hasTopPanel = (topPanel == null || topPanel.getVisibility() == 8) ? false : true;
        boolean hasButtonPanel = buttonPanel.getVisibility() != 8;
        if (!hasButtonPanel) {
            View spacer = contentPanel.findViewById(C0065.textSpacerNoButtons);
            if (spacer != null) {
                spacer.setVisibility(0);
            }
        }
        if (hasTopPanel) {
            NestedScrollView nestedScrollView = this.f32;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View divider = null;
            if (!(this.f17 == null && this.f30 == null)) {
                divider = topPanel.findViewById(C0065.titleDividerNoCustom);
            }
            if (divider != null) {
                divider.setVisibility(0);
            }
        } else {
            View spacer2 = contentPanel.findViewById(C0065.textSpacerNoTitle);
            if (spacer2 != null) {
                spacer2.setVisibility(0);
            }
        }
        View spacer3 = this.f30;
        if (spacer3 instanceof RecycleListView) {
            ((RecycleListView) spacer3).m25(hasTopPanel, hasButtonPanel);
        }
        if (!hasCustomPanel) {
            View content = this.f30;
            if (content == null) {
                content = this.f32;
            }
            if (content != null) {
                m21(contentPanel, content, (hasTopPanel ? 1 : 0) | (hasButtonPanel ? 2 : 0), 3);
            }
        }
        ListView listView = this.f30;
        if (listView != null && (listAdapter = this.f29) != null) {
            listView.setAdapter(listAdapter);
            int checkedItem = this.f39;
            if (checkedItem > -1) {
                listView.setItemChecked(checkedItem, true);
                listView.setSelection(checkedItem);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m21(ViewGroup contentPanel, View content, int indicators, int mask) {
        View indicatorUp = this.f26.findViewById(C0065.scrollIndicatorUp);
        View indicatorDown = this.f26.findViewById(C0065.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0248.m1154(content, indicators, mask);
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
                return;
            }
            return;
        }
        if (indicatorUp != null && (indicators & 1) == 0) {
            contentPanel.removeView(indicatorUp);
            indicatorUp = null;
        }
        if (indicatorDown != null && (indicators & 2) == 0) {
            contentPanel.removeView(indicatorDown);
            indicatorDown = null;
        }
        if (indicatorUp != null || indicatorDown != null) {
            if (this.f17 != null) {
                this.f32.setOnScrollChangeListener(new C0008(this, indicatorUp, indicatorDown));
                this.f32.post(new RunnableC0007(indicatorUp, indicatorDown));
                return;
            }
            ListView listView = this.f30;
            if (listView != null) {
                listView.setOnScrollListener(new C0005(this, indicatorUp, indicatorDown));
                this.f30.post(new RunnableC0006(indicatorUp, indicatorDown));
                return;
            }
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$Φ  reason: contains not printable characters */
    public class C0008 implements NestedScrollView.AbstractC0059 {

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ View f107;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f108;

        public C0008(AlertController this$0, View view, View view2) {
            this.f108 = view;
            this.f107 = view2;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m28(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            AlertController.m0(v, this.f108, this.f107);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$ø  reason: contains not printable characters */
    public class RunnableC0007 implements Runnable {

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ View f104;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f105;

        public RunnableC0007(View view, View view2) {
            this.f105 = view;
            this.f104 = view2;
        }

        public void run() {
            AlertController.m0(AlertController.this.f32, this.f105, this.f104);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$Ø  reason: contains not printable characters */
    public class C0005 implements AbsListView.OnScrollListener {

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ View f99;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f100;

        public C0005(AlertController this$0, View view, View view2) {
            this.f100 = view;
            this.f99 = view2;
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
        }

        public void onScroll(AbsListView v, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            AlertController.m0(v, this.f100, this.f99);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$ö  reason: contains not printable characters */
    public class RunnableC0006 implements Runnable {

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ View f101;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f102;

        public RunnableC0006(View view, View view2) {
            this.f102 = view;
            this.f101 = view2;
        }

        public void run() {
            AlertController.m0(AlertController.this.f30, this.f102, this.f101);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m4(ViewGroup customPanel) {
        View customView;
        boolean hasCustomView = false;
        if (this.f25 != null) {
            customView = this.f25;
        } else if (this.f11 != 0) {
            customView = LayoutInflater.from(this.f20).inflate(this.f11, customPanel, false);
        } else {
            customView = null;
        }
        if (customView != null) {
            hasCustomView = true;
        }
        if (!hasCustomView || !m2(customView)) {
            this.f26.setFlags(131072, 131072);
        }
        if (hasCustomView) {
            FrameLayout custom = (FrameLayout) this.f26.findViewById(C0065.custom);
            custom.addView(customView, new ViewGroup.LayoutParams(-1, -1));
            if (this.f35) {
                custom.setPadding(this.f6, this.f1, this.f4, this.f0);
            }
            if (this.f30 != null) {
                ((C0461.C0462) customPanel.getLayoutParams()).f1722 = 0.0f;
                return;
            }
            return;
        }
        customPanel.setVisibility(8);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m3(ViewGroup topPanel) {
        if (this.f14 != null) {
            topPanel.addView(this.f14, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f26.findViewById(C0065.title_template).setVisibility(8);
            return;
        }
        this.f28 = (ImageView) this.f26.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f33)) || !this.f18) {
            this.f26.findViewById(C0065.title_template).setVisibility(8);
            this.f28.setVisibility(8);
            topPanel.setVisibility(8);
            return;
        }
        this.f31 = (TextView) this.f26.findViewById(C0065.alertTitle);
        this.f31.setText(this.f33);
        int i = this.f44;
        if (i != 0) {
            this.f28.setImageResource(i);
            return;
        }
        Drawable drawable = this.f2;
        if (drawable != null) {
            this.f28.setImageDrawable(drawable);
            return;
        }
        this.f31.setPadding(this.f28.getPaddingLeft(), this.f28.getPaddingTop(), this.f28.getPaddingRight(), this.f28.getPaddingBottom());
        this.f28.setVisibility(8);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m8(ViewGroup contentPanel) {
        this.f32 = (NestedScrollView) this.f26.findViewById(C0065.scrollView);
        this.f32.setFocusable(false);
        this.f32.setNestedScrollingEnabled(false);
        this.f16 = (TextView) contentPanel.findViewById(16908299);
        TextView textView = this.f16;
        if (textView != null) {
            CharSequence charSequence = this.f17;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f32.removeView(this.f16);
            if (this.f30 != null) {
                ViewGroup scrollParent = (ViewGroup) this.f32.getParent();
                int childIndex = scrollParent.indexOfChild(this.f32);
                scrollParent.removeViewAt(childIndex);
                scrollParent.addView(this.f30, childIndex, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            contentPanel.setVisibility(8);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m0(View v, View upIndicator, View downIndicator) {
        int i = 0;
        if (upIndicator != null) {
            upIndicator.setVisibility(v.canScrollVertically(-1) ? 0 : 4);
        }
        if (downIndicator != null) {
            if (!v.canScrollVertically(1)) {
                i = 4;
            }
            downIndicator.setVisibility(i);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m20(ViewGroup buttonPanel) {
        int whichButtons = 0;
        this.f27 = (Button) buttonPanel.findViewById(16908313);
        this.f27.setOnClickListener(this.f24);
        boolean hasButtons = false;
        if (!TextUtils.isEmpty(this.f10) || this.f21 != null) {
            this.f27.setText(this.f10);
            Drawable drawable = this.f21;
            if (drawable != null) {
                int i = this.f19;
                drawable.setBounds(0, 0, i, i);
                this.f27.setCompoundDrawables(this.f21, null, null, null);
            }
            this.f27.setVisibility(0);
            whichButtons = 0 | 1;
        } else {
            this.f27.setVisibility(8);
        }
        this.f15 = (Button) buttonPanel.findViewById(16908314);
        this.f15.setOnClickListener(this.f24);
        if (!TextUtils.isEmpty(this.f3) || this.f12 != null) {
            this.f15.setText(this.f3);
            Drawable drawable2 = this.f12;
            if (drawable2 != null) {
                int i2 = this.f19;
                drawable2.setBounds(0, 0, i2, i2);
                this.f15.setCompoundDrawables(this.f12, null, null, null);
            }
            this.f15.setVisibility(0);
            whichButtons |= 2;
        } else {
            this.f15.setVisibility(8);
        }
        this.f9 = (Button) buttonPanel.findViewById(16908315);
        this.f9.setOnClickListener(this.f24);
        if (!TextUtils.isEmpty(this.f5) || this.f7 != null) {
            this.f9.setText(this.f5);
            Drawable drawable3 = this.f21;
            if (drawable3 != null) {
                int i3 = this.f19;
                drawable3.setBounds(0, 0, i3, i3);
                this.f27.setCompoundDrawables(this.f21, null, null, null);
            }
            this.f9.setVisibility(0);
            whichButtons |= 4;
        } else {
            this.f9.setVisibility(8);
        }
        if (m1(this.f20)) {
            if (whichButtons == 1) {
                m22(this.f27);
            } else if (whichButtons == 2) {
                m22(this.f15);
            } else if (whichButtons == 4) {
                m22(this.f9);
            }
        }
        if (whichButtons != 0) {
            hasButtons = true;
        }
        if (!hasButtons) {
            buttonPanel.setVisibility(8);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m22(Button button) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) button.getLayoutParams();
        params.gravity = 1;
        params.weight = 0.5f;
        button.setLayoutParams(params);
    }

    public static class RecycleListView extends ListView {

        /* renamed from: Φ  reason: contains not printable characters */
        public final int f45;

        /* renamed from: θ  reason: contains not printable characters */
        public final int f46;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray ta = context.obtainStyledAttributes(attrs, C0291.RecycleListView);
            this.f45 = ta.getDimensionPixelOffset(C0291.RecycleListView_paddingBottomNoButtons, -1);
            this.f46 = ta.getDimensionPixelOffset(C0291.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m25(boolean hasTitle, boolean hasButtons) {
            if (!hasButtons || !hasTitle) {
                setPadding(getPaddingLeft(), hasTitle ? getPaddingTop() : this.f46, getPaddingRight(), hasButtons ? getPaddingBottom() : this.f45);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$µ  reason: contains not printable characters */
    public static class C0000 {

        /* renamed from: µ  reason: contains not printable characters */
        public int f47;

        /* renamed from: Ø  reason: contains not printable characters */
        public int f48;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnClickListener f49;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public Drawable f50;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public CharSequence f51;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public boolean f52;

        /* renamed from: ö  reason: contains not printable characters */
        public int f53;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public CharSequence f54;

        /* renamed from: ø  reason: contains not printable characters */
        public int f55;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnClickListener f56;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public Drawable f57;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public CharSequence f58;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public boolean f59;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f60 = 0;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnClickListener f61;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public Drawable f62;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public View f63;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public CharSequence f64;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public String f65;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f66 = false;

        /* renamed from: θ  reason: contains not printable characters */
        public int f67 = 0;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Context f68;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnCancelListener f69;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnClickListener f70;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnDismissListener f71;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnKeyListener f72;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public DialogInterface.OnMultiChoiceClickListener f73;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Cursor f74;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Drawable f75;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final LayoutInflater f76;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public View f77;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AdapterView.OnItemSelectedListener f78;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ListAdapter f79;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public CharSequence f80;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public String f81;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f82;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public CharSequence[] f83;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean[] f84;

        /* renamed from: ฿  reason: contains not printable characters */
        public int f85 = -1;

        /* renamed from: ₩  reason: contains not printable characters */
        public int f86;

        public C0000(Context context) {
            this.f68 = context;
            this.f82 = true;
            this.f76 = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m27(AlertController dialog) {
            View view = this.f77;
            if (view != null) {
                dialog.m18(view);
            } else {
                CharSequence charSequence = this.f80;
                if (charSequence != null) {
                    dialog.m9(charSequence);
                }
                Drawable drawable = this.f75;
                if (drawable != null) {
                    dialog.m17(drawable);
                }
                int i = this.f67;
                if (i != 0) {
                    dialog.m15(i);
                }
                int i2 = this.f60;
                if (i2 != 0) {
                    dialog.m15(dialog.m12(i2));
                }
            }
            CharSequence charSequence2 = this.f64;
            if (charSequence2 != null) {
                dialog.m23(charSequence2);
            }
            if (!(this.f58 == null && this.f62 == null)) {
                dialog.m16(-1, this.f58, this.f70, (Message) null, this.f62);
            }
            if (!(this.f51 == null && this.f57 == null)) {
                dialog.m16(-2, this.f51, this.f61, (Message) null, this.f57);
            }
            if (!(this.f54 == null && this.f50 == null)) {
                dialog.m16(-3, this.f54, this.f56, (Message) null, this.f50);
            }
            if (!(this.f83 == null && this.f74 == null && this.f79 == null)) {
                m26(dialog);
            }
            View view2 = this.f63;
            if (view2 == null) {
                int i3 = this.f55;
                if (i3 != 0) {
                    dialog.m6(i3);
                }
            } else if (this.f66) {
                dialog.m19(view2, this.f48, this.f53, this.f47, this.f86);
            } else {
                dialog.m7(view2);
            }
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public final void m26(AlertController dialog) {
            ListAdapter adapter;
            int layout;
            RecycleListView listView = (RecycleListView) this.f76.inflate(dialog.f43, (ViewGroup) null);
            if (this.f59) {
                Cursor cursor = this.f74;
                if (cursor == null) {
                    adapter = new C0004(this.f68, dialog.f40, 16908308, this.f83, listView);
                } else {
                    adapter = new C0003(this.f68, cursor, false, listView, dialog);
                }
            } else {
                if (this.f52) {
                    layout = dialog.f36;
                } else {
                    layout = dialog.f37;
                }
                Cursor cursor2 = this.f74;
                if (cursor2 != null) {
                    adapter = new SimpleCursorAdapter(this.f68, layout, cursor2, new String[]{this.f81}, new int[]{16908308});
                } else if (this.f79 != null) {
                    adapter = this.f79;
                } else {
                    adapter = new C0010(this.f68, layout, 16908308, this.f83);
                }
            }
            dialog.f29 = adapter;
            dialog.f39 = this.f85;
            if (this.f49 != null) {
                listView.setOnItemClickListener(new C0002(dialog));
            } else if (this.f73 != null) {
                listView.setOnItemClickListener(new C0001(listView, dialog));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f78;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f52) {
                listView.setChoiceMode(1);
            } else if (this.f59) {
                listView.setChoiceMode(2);
            }
            dialog.f30 = listView;
        }

        /* renamed from: androidx.appcompat.app.AlertController$µ$θ  reason: contains not printable characters */
        public class C0004 extends ArrayAdapter<CharSequence> {

            /* renamed from: θ  reason: contains not printable characters */
            public final /* synthetic */ RecycleListView f97;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0004(Context x0, int x1, int x2, CharSequence[] x3, RecycleListView recycleListView) {
                super(x0, x1, x2, x3);
                this.f97 = recycleListView;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                boolean[] zArr = C0000.this.f84;
                if (zArr != null && zArr[position]) {
                    this.f97.setItemChecked(position, true);
                }
                return view;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$µ$Φ  reason: contains not printable characters */
        public class C0003 extends CursorAdapter {

            /* renamed from: Φ  reason: contains not printable characters */
            public final int f92;

            /* renamed from: θ  reason: contains not printable characters */
            public final int f93;

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public final /* synthetic */ RecycleListView f94;

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public final /* synthetic */ AlertController f96;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0003(Context x0, Cursor x1, boolean x2, RecycleListView recycleListView, AlertController alertController) {
                super(x0, x1, x2);
                this.f94 = recycleListView;
                this.f96 = alertController;
                Cursor cursor = getCursor();
                this.f93 = cursor.getColumnIndexOrThrow(C0000.this.f81);
                this.f92 = cursor.getColumnIndexOrThrow(C0000.this.f65);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f93));
                RecycleListView recycleListView = this.f94;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f92) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup parent) {
                return C0000.this.f76.inflate(this.f96.f40, parent, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$µ$ø  reason: contains not printable characters */
        public class C0002 implements AdapterView.OnItemClickListener {

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public final /* synthetic */ AlertController f91;

            public C0002(AlertController alertController) {
                this.f91 = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                C0000.this.f49.onClick(this.f91.f34, position);
                if (!C0000.this.f52) {
                    this.f91.f34.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$µ$Ø  reason: contains not printable characters */
        public class C0001 implements AdapterView.OnItemClickListener {

            /* renamed from: θ  reason: contains not printable characters */
            public final /* synthetic */ RecycleListView f87;

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public final /* synthetic */ AlertController f89;

            public C0001(RecycleListView recycleListView, AlertController alertController) {
                this.f87 = recycleListView;
                this.f89 = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                boolean[] zArr = C0000.this.f84;
                if (zArr != null) {
                    zArr[position] = this.f87.isItemChecked(position);
                }
                C0000.this.f73.onClick(this.f89.f34, position, this.f87.isItemChecked(position));
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$฿  reason: contains not printable characters */
    public static class C0010 extends ArrayAdapter<CharSequence> {
        public C0010(Context context, int resource, int textViewResourceId, CharSequence[] objects) {
            super(context, resource, textViewResourceId, objects);
        }

        public boolean hasStableIds() {
            return true;
        }

        public long getItemId(int position) {
            return (long) position;
        }
    }
}
