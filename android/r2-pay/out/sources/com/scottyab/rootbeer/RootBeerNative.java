package com.scottyab.rootbeer;

import ♫.C0288;

public class RootBeerNative {

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean f506;

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    static {
        f506 = false;
        try {
            System.loadLibrary("tool-checker");
            f506 = true;
        } catch (UnsatisfiedLinkError e) {
            C0288.m1282(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m321() {
        return f506;
    }
}
