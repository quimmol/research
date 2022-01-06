package ♫;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: ♫.势  reason: contains not printable characters */
public class Window$CallbackC0361 implements Window.Callback {

    /* renamed from: θ  reason: contains not printable characters */
    public final Window.Callback f1331;

    public Window$CallbackC0361(Window.Callback wrapped) {
        if (wrapped != null) {
            this.f1331 = wrapped;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f1331.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return this.f1331.dispatchKeyShortcutEvent(event);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        return this.f1331.dispatchTouchEvent(event);
    }

    public boolean dispatchTrackballEvent(MotionEvent event) {
        return this.f1331.dispatchTrackballEvent(event);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return this.f1331.dispatchGenericMotionEvent(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return this.f1331.dispatchPopulateAccessibilityEvent(event);
    }

    public View onCreatePanelView(int featureId) {
        return this.f1331.onCreatePanelView(featureId);
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return this.f1331.onCreatePanelMenu(featureId, menu);
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return this.f1331.onPreparePanel(featureId, view, menu);
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return this.f1331.onMenuOpened(featureId, menu);
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        return this.f1331.onMenuItemSelected(featureId, item);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
        this.f1331.onWindowAttributesChanged(attrs);
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        this.f1331.onWindowFocusChanged(hasFocus);
    }

    public void onAttachedToWindow() {
        this.f1331.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f1331.onDetachedFromWindow();
    }

    public void onPanelClosed(int featureId, Menu menu) {
        this.f1331.onPanelClosed(featureId, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f1331.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f1331.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1331.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        return this.f1331.onWindowStartingActionMode(callback, type);
    }

    public void onActionModeStarted(ActionMode mode) {
        this.f1331.onActionModeStarted(mode);
    }

    public void onActionModeFinished(ActionMode mode) {
        this.f1331.onActionModeFinished(mode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        this.f1331.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    public void onPointerCaptureChanged(boolean hasCapture) {
        this.f1331.onPointerCaptureChanged(hasCapture);
    }
}
