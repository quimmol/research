package ♫;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ♫.利  reason: contains not printable characters */
public class C0356 extends MenuInflater {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final Class<?>[] f1281 = f1282;

    /* renamed from: θ  reason: contains not printable characters */
    public static final Class<?>[] f1282 = {Context.class};

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final Object[] f1283 = this.f1286;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f1284;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Object f1285;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Object[] f1286;

    public C0356(Context context) {
        super(context);
        this.f1284 = context;
        this.f1286 = new Object[]{context};
    }

    public void inflate(int menuRes, Menu menu) {
        if (!(menu instanceof AbstractMenuC0280)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        try {
            parser = this.f1284.getResources().getLayout(menuRes);
            m1674(parser, Xml.asAttributeSet(parser), menu);
            parser.close();
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1674(XmlPullParser parser, AttributeSet attrs, Menu menu) {
        C0357 menuState = new C0357(menu);
        int eventType = parser.getEventType();
        boolean lookingForEndOfUnknownTag = false;
        String unknownTagName = null;
        while (true) {
            if (eventType != 2) {
                eventType = parser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String tagName = parser.getName();
                if (tagName.equals("menu")) {
                    eventType = parser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + tagName);
                }
            }
        }
        boolean reachedEndOfMenu = false;
        while (!reachedEndOfMenu) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String tagName2 = parser.getName();
                        if (lookingForEndOfUnknownTag && tagName2.equals(unknownTagName)) {
                            lookingForEndOfUnknownTag = false;
                            unknownTagName = null;
                        } else if (tagName2.equals("group")) {
                            menuState.m1675();
                        } else if (tagName2.equals("item")) {
                            if (!menuState.m1683()) {
                                AbstractC0185 r8 = menuState.f1310;
                                if (r8 == null || !r8.m906()) {
                                    menuState.m1680();
                                } else {
                                    menuState.m1678();
                                }
                            }
                        } else if (tagName2.equals("menu")) {
                            reachedEndOfMenu = true;
                        }
                    }
                } else if (!lookingForEndOfUnknownTag) {
                    String tagName3 = parser.getName();
                    if (tagName3.equals("group")) {
                        menuState.m1681(attrs);
                    } else if (tagName3.equals("item")) {
                        menuState.m1676(attrs);
                    } else if (tagName3.equals("menu")) {
                        m1674(parser, attrs, menuState.m1678());
                    } else {
                        lookingForEndOfUnknownTag = true;
                        unknownTagName = tagName3;
                    }
                }
                eventType = parser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Object m1672() {
        if (this.f1285 == null) {
            this.f1285 = m1673(this.f1284);
        }
        return this.f1285;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Object m1673(Object owner) {
        if (!(owner instanceof Activity) && (owner instanceof ContextWrapper)) {
            return m1673(((ContextWrapper) owner).getBaseContext());
        }
        return owner;
    }

    /* renamed from: ♫.利$θ  reason: contains not printable characters */
    public static class MenuItem$OnMenuItemClickListenerC0358 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: θ  reason: contains not printable characters */
        public static final Class<?>[] f1319 = {MenuItem.class};

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Object f1320;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Method f1321;

        public MenuItem$OnMenuItemClickListenerC0358(Object realOwner, String methodName) {
            this.f1320 = realOwner;
            Class<?> c = realOwner.getClass();
            try {
                this.f1321 = c.getMethod(methodName, f1319);
            } catch (Exception e) {
                InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c.getName());
                ex.initCause(e);
                throw ex;
            }
        }

        public boolean onMenuItemClick(MenuItem item) {
            try {
                if (this.f1321.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1321.invoke(this.f1320, item)).booleanValue();
                }
                this.f1321.invoke(this.f1320, item);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: ♫.利$Φ  reason: contains not printable characters */
    public class C0357 {

        /* renamed from: µ  reason: contains not printable characters */
        public int f1287;

        /* renamed from: µ  reason: contains not printable characters and collision with other field name */
        public boolean f1288;

        /* renamed from: Ø  reason: contains not printable characters */
        public int f1289;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public CharSequence f1290;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public boolean f1291;

        /* renamed from: ö  reason: contains not printable characters */
        public int f1292;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public boolean f1293;

        /* renamed from: ø  reason: contains not printable characters */
        public int f1294;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public CharSequence f1295;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public String f1296;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public boolean f1297;

        /* renamed from: Φ  reason: contains not printable characters */
        public char f1298;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public int f1299;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public CharSequence f1300;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public String f1301;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f1302;

        /* renamed from: θ  reason: contains not printable characters */
        public char f1303;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int f1304;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ColorStateList f1305 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public PorterDuff.Mode f1306 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Menu f1307;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public CharSequence f1308;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public String f1309;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0185 f1310;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1312;

        /* renamed from: ฿  reason: contains not printable characters */
        public int f1313;

        /* renamed from: ₢  reason: contains not printable characters */
        public int f1314;

        /* renamed from: ₣  reason: contains not printable characters */
        public int f1315;

        /* renamed from: ₤  reason: contains not printable characters */
        public int f1316;

        /* renamed from: ₧  reason: contains not printable characters */
        public int f1317;

        /* renamed from: ₩  reason: contains not printable characters */
        public int f1318;

        public C0357(Menu menu) {
            this.f1307 = menu;
            m1675();
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m1675() {
            this.f1304 = 0;
            this.f1299 = 0;
            this.f1294 = 0;
            this.f1289 = 0;
            this.f1312 = true;
            this.f1302 = true;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1681(AttributeSet attrs) {
            TypedArray a = C0356.this.f1284.obtainStyledAttributes(attrs, C0291.MenuGroup);
            this.f1304 = a.getResourceId(C0291.MenuGroup_android_id, 0);
            this.f1299 = a.getInt(C0291.MenuGroup_android_menuCategory, 0);
            this.f1294 = a.getInt(C0291.MenuGroup_android_orderInCategory, 0);
            this.f1289 = a.getInt(C0291.MenuGroup_android_checkableBehavior, 0);
            this.f1312 = a.getBoolean(C0291.MenuGroup_android_visible, true);
            this.f1302 = a.getBoolean(C0291.MenuGroup_android_enabled, true);
            a.recycle();
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m1676(AttributeSet attrs) {
            TypedArray a = C0356.this.f1284.obtainStyledAttributes(attrs, C0291.MenuItem);
            this.f1292 = a.getResourceId(C0291.MenuItem_android_id, 0);
            this.f1287 = (-65536 & a.getInt(C0291.MenuItem_android_menuCategory, this.f1299)) | (65535 & a.getInt(C0291.MenuItem_android_orderInCategory, this.f1294));
            this.f1308 = a.getText(C0291.MenuItem_android_title);
            this.f1300 = a.getText(C0291.MenuItem_android_titleCondensed);
            this.f1318 = a.getResourceId(C0291.MenuItem_android_icon, 0);
            this.f1303 = m1677(a.getString(C0291.MenuItem_android_alphabeticShortcut));
            this.f1313 = a.getInt(C0291.MenuItem_alphabeticModifiers, 4096);
            this.f1298 = m1677(a.getString(C0291.MenuItem_android_numericShortcut));
            this.f1315 = a.getInt(C0291.MenuItem_numericModifiers, 4096);
            if (a.hasValue(C0291.MenuItem_android_checkable)) {
                this.f1316 = a.getBoolean(C0291.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f1316 = this.f1289;
            }
            this.f1291 = a.getBoolean(C0291.MenuItem_android_checked, false);
            this.f1293 = a.getBoolean(C0291.MenuItem_android_visible, this.f1312);
            this.f1288 = a.getBoolean(C0291.MenuItem_android_enabled, this.f1302);
            this.f1317 = a.getInt(C0291.MenuItem_showAsAction, -1);
            this.f1296 = a.getString(C0291.MenuItem_android_onClick);
            this.f1314 = a.getResourceId(C0291.MenuItem_actionLayout, 0);
            this.f1309 = a.getString(C0291.MenuItem_actionViewClass);
            this.f1301 = a.getString(C0291.MenuItem_actionProviderClass);
            boolean hasActionProvider = this.f1301 != null;
            if (hasActionProvider && this.f1314 == 0 && this.f1309 == null) {
                this.f1310 = (AbstractC0185) m1679(this.f1301, C0356.f1281, C0356.this.f1283);
            } else {
                if (hasActionProvider) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1310 = null;
            }
            this.f1295 = a.getText(C0291.MenuItem_contentDescription);
            this.f1290 = a.getText(C0291.MenuItem_tooltipText);
            if (a.hasValue(C0291.MenuItem_iconTintMode)) {
                this.f1306 = C0452.m2151(a.getInt(C0291.MenuItem_iconTintMode, -1), this.f1306);
            } else {
                this.f1306 = null;
            }
            if (a.hasValue(C0291.MenuItem_iconTint)) {
                this.f1305 = a.getColorStateList(C0291.MenuItem_iconTint);
            } else {
                this.f1305 = null;
            }
            a.recycle();
            this.f1297 = false;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final char m1677(String shortcutString) {
            if (shortcutString == null) {
                return 0;
            }
            return shortcutString.charAt(0);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1682(MenuItem item) {
            item.setChecked(this.f1291).setVisible(this.f1293).setEnabled(this.f1288).setCheckable(this.f1316 >= 1).setTitleCondensed(this.f1300).setIcon(this.f1318);
            int i = this.f1317;
            if (i >= 0) {
                item.setShowAsAction(i);
            }
            if (this.f1296 != null) {
                if (!C0356.this.f1284.isRestricted()) {
                    item.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0358(C0356.this.m1672(), this.f1296));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (item instanceof C0380) {
                C0380 r0 = (C0380) item;
            }
            if (this.f1316 >= 2) {
                if (item instanceof C0380) {
                    ((C0380) item).m1835(true);
                } else if (item instanceof MenuItemC0382) {
                    ((MenuItemC0382) item).m1862(true);
                }
            }
            boolean actionViewSpecified = false;
            String str = this.f1309;
            if (str != null) {
                item.setActionView((View) m1679(str, C0356.f1282, C0356.this.f1286));
                actionViewSpecified = true;
            }
            int i2 = this.f1314;
            if (i2 > 0) {
                if (!actionViewSpecified) {
                    item.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0185 r2 = this.f1310;
            if (r2 != null) {
                C0270.m1225(item, r2);
            }
            C0270.m1229(item, this.f1295);
            C0270.m1224(item, this.f1290);
            C0270.m1226(item, this.f1303, this.f1313);
            C0270.m1223(item, this.f1298, this.f1315);
            PorterDuff.Mode mode = this.f1306;
            if (mode != null) {
                C0270.m1228(item, mode);
            }
            ColorStateList colorStateList = this.f1305;
            if (colorStateList != null) {
                C0270.m1227(item, colorStateList);
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1680() {
            this.f1297 = true;
            m1682(this.f1307.add(this.f1304, this.f1292, this.f1287, this.f1308));
        }

        /* renamed from: θ  reason: contains not printable characters */
        public SubMenu m1678() {
            this.f1297 = true;
            SubMenu subMenu = this.f1307.addSubMenu(this.f1304, this.f1292, this.f1287, this.f1308);
            m1682(subMenu.getItem());
            return subMenu;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1683() {
            return this.f1297;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final <T> T m1679(String className, Class<?>[] constructorSignature, Object[] arguments) {
            try {
                Constructor<?> constructor = C0356.this.f1284.getClassLoader().loadClass(className).getConstructor(constructorSignature);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(arguments);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + className, e);
                return null;
            }
        }
    }
}
