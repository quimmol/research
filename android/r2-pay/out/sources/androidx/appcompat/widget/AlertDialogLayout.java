package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ♫.C0065;
import ♫.C0191;
import ♫.C0248;
import ♫.C0291;
import ♫.C0461;

public class AlertDialogLayout extends C0461 {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // ♫.C0461
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!m129(widthMeasureSpec, heightMeasureSpec)) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: Multiple debug info for r3v2 int: [D('remainingHeight' int), D('topPanel' android.view.View)] */
    @Override // ♫.C0461
    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m129(int widthMeasureSpec, int heightMeasureSpec) {
        View topPanel = null;
        View buttonPanel = null;
        View middlePanel = null;
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                int id = child.getId();
                if (id == C0065.topPanel) {
                    topPanel = child;
                } else if (id == C0065.buttonPanel) {
                    buttonPanel = child;
                } else if ((id != C0065.contentPanel && id != C0065.customPanel) || middlePanel != null) {
                    return false;
                } else {
                    middlePanel = child;
                }
            }
        }
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int childState = 0;
        int usedHeight = getPaddingTop() + getPaddingBottom();
        if (topPanel != null) {
            topPanel.measure(widthMeasureSpec, 0);
            usedHeight += topPanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(0, topPanel.getMeasuredState());
        }
        int buttonHeight = 0;
        int buttonWantsHeight = 0;
        if (buttonPanel != null) {
            buttonPanel.measure(widthMeasureSpec, 0);
            buttonHeight = m128(buttonPanel);
            buttonWantsHeight = buttonPanel.getMeasuredHeight() - buttonHeight;
            usedHeight += buttonHeight;
            childState = View.combineMeasuredStates(childState, buttonPanel.getMeasuredState());
        }
        int middleHeight = 0;
        if (middlePanel != null) {
            middlePanel.measure(widthMeasureSpec, heightMode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, heightSize - usedHeight), heightMode));
            middleHeight = middlePanel.getMeasuredHeight();
            usedHeight += middleHeight;
            childState = View.combineMeasuredStates(childState, middlePanel.getMeasuredState());
        }
        int remainingHeight = heightSize - usedHeight;
        if (buttonPanel != null) {
            int usedHeight2 = usedHeight - buttonHeight;
            int heightToGive = Math.min(remainingHeight, buttonWantsHeight);
            if (heightToGive > 0) {
                remainingHeight -= heightToGive;
                buttonHeight += heightToGive;
            }
            buttonPanel.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(buttonHeight, 1073741824));
            usedHeight = usedHeight2 + buttonPanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(childState, buttonPanel.getMeasuredState());
            remainingHeight = remainingHeight;
        }
        if (middlePanel != null && remainingHeight > 0) {
            middlePanel.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(middleHeight + remainingHeight, heightMode));
            usedHeight = (usedHeight - middleHeight) + middlePanel.getMeasuredHeight();
            childState = View.combineMeasuredStates(childState, middlePanel.getMeasuredState());
            remainingHeight -= remainingHeight;
        }
        int maxWidth = 0;
        int i2 = 0;
        while (i2 < count) {
            View child2 = getChildAt(i2);
            if (child2.getVisibility() != 8) {
                maxWidth = Math.max(maxWidth, child2.getMeasuredWidth());
            }
            i2++;
            buttonPanel = buttonPanel;
            middlePanel = middlePanel;
        }
        setMeasuredDimension(View.resolveSizeAndState(maxWidth + getPaddingLeft() + getPaddingRight(), widthMeasureSpec, childState), View.resolveSizeAndState(usedHeight, heightMeasureSpec, 0));
        if (widthMode == 1073741824) {
            return true;
        }
        m126(count, heightMeasureSpec);
        return true;
    }

    @Override // ♫.C0461
    /* renamed from: Φ  reason: contains not printable characters */
    private void m126(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                C0461.C0462 lp = (C0461.C0462) child.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) lp).width == -1) {
                    int oldHeight = ((ViewGroup.MarginLayoutParams) lp).height;
                    ((ViewGroup.MarginLayoutParams) lp).height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) lp).height = oldHeight;
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m128(View v) {
        int minHeight = C0248.m1142(v);
        if (minHeight > 0) {
            return minHeight;
        }
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            if (vg.getChildCount() == 1) {
                return m128(vg.getChildAt(0));
            }
        }
        return 0;
    }

    @Override // ♫.C0461
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childTop;
        int dividerHeight;
        int i;
        int layoutGravity;
        int childLeft;
        AlertDialogLayout alertDialogLayout = this;
        int paddingLeft = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft) - getPaddingRight();
        int totalLength = getMeasuredHeight();
        int count = getChildCount();
        int gravity = getGravity();
        int majorGravity = gravity & C0291.AppCompatTheme_windowActionBarOverlay;
        int minorGravity = gravity & 8388615;
        if (majorGravity == 16) {
            childTop = getPaddingTop() + (((bottom - top) - totalLength) / 2);
        } else if (majorGravity != 80) {
            childTop = getPaddingTop();
        } else {
            childTop = ((getPaddingTop() + bottom) - top) - totalLength;
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            dividerHeight = 0;
        } else {
            dividerHeight = dividerDrawable.getIntrinsicHeight();
        }
        int i2 = 0;
        while (i2 < count) {
            View child = alertDialogLayout.getChildAt(i2);
            if (child == null || child.getVisibility() == 8) {
                i = i2;
            } else {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                C0461.C0462 lp = (C0461.C0462) child.getLayoutParams();
                int layoutGravity2 = lp.f1723;
                if (layoutGravity2 < 0) {
                    layoutGravity = minorGravity;
                } else {
                    layoutGravity = layoutGravity2;
                }
                int r1 = C0191.m910(layoutGravity, C0248.m1146((View) this)) & 7;
                if (r1 == 1) {
                    childLeft = ((((childSpace - childWidth) / 2) + paddingLeft) + ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else if (r1 != 5) {
                    childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + paddingLeft;
                } else {
                    childLeft = (childRight - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                }
                if (alertDialogLayout.m2198(i2)) {
                    childTop += dividerHeight;
                }
                int childTop2 = childTop + ((ViewGroup.MarginLayoutParams) lp).topMargin;
                i = i2;
                m127(child, childLeft, childTop2, childWidth, childHeight);
                childTop = childTop2 + childHeight + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
            }
            i2 = i + 1;
            alertDialogLayout = this;
        }
    }

    @Override // ♫.C0461
    /* renamed from: Φ  reason: contains not printable characters */
    private void m127(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }
}
