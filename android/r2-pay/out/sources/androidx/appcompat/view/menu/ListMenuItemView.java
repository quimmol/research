package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import ♫.AbstractC0394;
import ♫.C0065;
import ♫.C0158;
import ♫.C0248;
import ♫.C0291;
import ♫.C0296;
import ♫.C0380;
import ♫.C0488;

public class ListMenuItemView extends LinearLayout implements AbstractC0394.AbstractC0395, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f135;

    /* renamed from: ø  reason: contains not printable characters */
    public ImageView f136;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f137;

    /* renamed from: Φ  reason: contains not printable characters */
    public Drawable f138;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public ImageView f139;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public TextView f140;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f141;

    /* renamed from: θ  reason: contains not printable characters */
    public int f142;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f143;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f144;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater f145;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CheckBox f146;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ImageView f147;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LinearLayout f148;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public RadioButton f149;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TextView f150;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0380 f151;

    public ListMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        C0488 a = C0488.m2290(getContext(), attrs, C0291.MenuView, defStyleAttr, 0);
        this.f144 = a.m2301(C0291.MenuView_android_itemBackground);
        this.f142 = a.m2308(C0291.MenuView_android_itemTextAppearance, -1);
        this.f141 = a.m2306(C0291.MenuView_preserveIconSpacing, false);
        this.f143 = context;
        this.f138 = a.m2301(C0291.MenuView_subMenuArrow);
        TypedArray b = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0158.dropDownListViewStyle, 0);
        this.f137 = b.hasValue(0);
        a.m2304();
        b.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        C0248.m1157(this, this.f144);
        this.f150 = (TextView) findViewById(C0065.title);
        int i = this.f142;
        if (i != -1) {
            this.f150.setTextAppearance(this.f143, i);
        }
        this.f140 = (TextView) findViewById(C0065.shortcut);
        this.f139 = (ImageView) findViewById(C0065.submenuarrow);
        ImageView imageView = this.f139;
        if (imageView != null) {
            imageView.setImageDrawable(this.f138);
        }
        this.f136 = (ImageView) findViewById(C0065.group_divider);
        this.f148 = (LinearLayout) findViewById(C0065.content);
    }

    @Override // ♫.AbstractC0394.AbstractC0395
    /* renamed from: θ  reason: contains not printable characters */
    public void m67(C0380 itemData, int menuType) {
        this.f151 = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        setTitle(itemData.m1844((AbstractC0394.AbstractC0395) this));
        setCheckable(itemData.isCheckable());
        boolean r0 = itemData.m1857();
        itemData.m1841();
        m68(r0);
        setIcon(itemData.getIcon());
        setEnabled(itemData.isEnabled());
        setSubMenuArrowVisible(itemData.hasSubMenu());
        setContentDescription(itemData.getContentDescription());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m65(View v) {
        m66(v, -1);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m66(View v, int index) {
        LinearLayout linearLayout = this.f148;
        if (linearLayout != null) {
            linearLayout.addView(v, index);
        } else {
            addView(v, index);
        }
    }

    public void setForceShowIcon(boolean forceShow) {
        this.f135 = forceShow;
        this.f141 = forceShow;
    }

    public void setTitle(CharSequence title) {
        if (title != null) {
            this.f150.setText(title);
            if (this.f150.getVisibility() != 0) {
                this.f150.setVisibility(0);
            }
        } else if (this.f150.getVisibility() != 8) {
            this.f150.setVisibility(8);
        }
    }

    @Override // ♫.AbstractC0394.AbstractC0395
    public C0380 getItemData() {
        return this.f151;
    }

    public void setCheckable(boolean checkable) {
        CompoundButton otherCompoundButton;
        CompoundButton compoundButton;
        if (checkable || this.f149 != null || this.f146 != null) {
            if (this.f151.m1833()) {
                if (this.f149 == null) {
                    m62();
                }
                compoundButton = this.f149;
                otherCompoundButton = this.f146;
            } else {
                if (this.f146 == null) {
                    m64();
                }
                compoundButton = this.f146;
                otherCompoundButton = this.f149;
            }
            if (checkable) {
                compoundButton.setChecked(this.f151.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (otherCompoundButton != null && otherCompoundButton.getVisibility() != 8) {
                    otherCompoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f146;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f149;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean checked) {
        CompoundButton compoundButton;
        if (this.f151.m1833()) {
            if (this.f149 == null) {
                m62();
            }
            compoundButton = this.f149;
        } else {
            if (this.f146 == null) {
                m64();
            }
            compoundButton = this.f146;
        }
        compoundButton.setChecked(checked);
    }

    private void setSubMenuArrowVisible(boolean hasSubmenu) {
        ImageView imageView = this.f139;
        if (imageView != null) {
            imageView.setVisibility(hasSubmenu ? 0 : 8);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m68(boolean showShortcut) {
        int newVisibility = (!showShortcut || !this.f151.m1857()) ? 8 : 0;
        if (newVisibility == 0) {
            this.f140.setText(this.f151.m1845());
        }
        if (this.f140.getVisibility() != newVisibility) {
            this.f140.setVisibility(newVisibility);
        }
    }

    public void setIcon(Drawable icon) {
        boolean showIcon = this.f151.m1859() || this.f135;
        if (!showIcon && !this.f141) {
            return;
        }
        if (this.f147 != null || icon != null || this.f141) {
            if (this.f147 == null) {
                m63();
            }
            if (icon != null || this.f141) {
                this.f147.setImageDrawable(showIcon ? icon : null);
                if (this.f147.getVisibility() != 0) {
                    this.f147.setVisibility(0);
                    return;
                }
                return;
            }
            this.f147.setVisibility(8);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f147 != null && this.f141) {
            ViewGroup.LayoutParams lp = getLayoutParams();
            LinearLayout.LayoutParams iconLp = (LinearLayout.LayoutParams) this.f147.getLayoutParams();
            if (lp.height > 0 && iconLp.width <= 0) {
                iconLp.width = lp.height;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m63() {
        this.f147 = (ImageView) getInflater().inflate(C0296.abc_list_menu_item_icon, (ViewGroup) this, false);
        m66(this.f147, 0);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m62() {
        this.f149 = (RadioButton) getInflater().inflate(C0296.abc_list_menu_item_radio, (ViewGroup) this, false);
        m65(this.f149);
    }

    @Override // ♫.AbstractC0394.AbstractC0395
    /* renamed from: θ  reason: contains not printable characters */
    public final void m64() {
        this.f146 = (CheckBox) getInflater().inflate(C0296.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        m65(this.f146);
    }

    @Override // ♫.AbstractC0394.AbstractC0395
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m69() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.f145 == null) {
            this.f145 = LayoutInflater.from(getContext());
        }
        return this.f145;
    }

    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        ImageView imageView = this.f136;
        if (imageView != null) {
            imageView.setVisibility((this.f137 || !groupDividerEnabled) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f136;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.f136.getLayoutParams();
            rect.top += this.f136.getHeight() + lp.topMargin + lp.bottomMargin;
        }
    }
}
