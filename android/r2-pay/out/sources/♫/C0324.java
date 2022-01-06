package ♫;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* renamed from: ♫.习  reason: contains not printable characters */
public class C0324 {

    /* renamed from: θ  reason: contains not printable characters */
    public static C0324 f1142;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1143;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final LocationManager f1144;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0325 f1145 = new C0325();

    /* renamed from: ♫.习$θ  reason: contains not printable characters */
    public static class C0325 {

        /* renamed from: Ø  reason: contains not printable characters */
        public long f1146;

        /* renamed from: ö  reason: contains not printable characters */
        public long f1147;

        /* renamed from: ø  reason: contains not printable characters */
        public long f1148;

        /* renamed from: Φ  reason: contains not printable characters */
        public long f1149;

        /* renamed from: θ  reason: contains not printable characters */
        public long f1150;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1151;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0324 m1467(Context context) {
        if (f1142 == null) {
            Context context2 = context.getApplicationContext();
            f1142 = new C0324(context2, (LocationManager) context2.getSystemService("location"));
        }
        return f1142;
    }

    public C0324(Context context, LocationManager locationManager) {
        this.f1143 = context;
        this.f1144 = locationManager;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1472() {
        C0325 state = this.f1145;
        if (m1468()) {
            return state.f1151;
        }
        Location location = m1469();
        if (location != null) {
            m1471(location);
            return state.f1151;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int hour = Calendar.getInstance().get(11);
        return hour < 6 || hour >= 22;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: θ  reason: contains not printable characters */
    public final Location m1469() {
        Location coarseLoc = null;
        Location fineLoc = null;
        if (C0102.m541(this.f1143, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            coarseLoc = m1470("network");
        }
        if (C0102.m541(this.f1143, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            fineLoc = m1470("gps");
        }
        return (fineLoc == null || coarseLoc == null) ? fineLoc != null ? fineLoc : coarseLoc : fineLoc.getTime() > coarseLoc.getTime() ? fineLoc : coarseLoc;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Location m1470(String provider) {
        try {
            if (this.f1144.isProviderEnabled(provider)) {
                return this.f1144.getLastKnownLocation(provider);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m1468() {
        return this.f1145.f1147 > System.currentTimeMillis();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1471(Location location) {
        long nextUpdate;
        long nextUpdate2;
        C0325 state = this.f1145;
        long now = System.currentTimeMillis();
        C0323 calculator = C0323.m1465();
        calculator.m1466(now - 86400000, location.getLatitude(), location.getLongitude());
        long yesterdaySunset = calculator.f1141;
        calculator.m1466(now, location.getLatitude(), location.getLongitude());
        boolean isNight = true;
        if (calculator.f1140 != 1) {
            isNight = false;
        }
        long todaySunrise = calculator.f1139;
        long todaySunset = calculator.f1141;
        calculator.m1466(86400000 + now, location.getLatitude(), location.getLongitude());
        long tomorrowSunrise = calculator.f1139;
        if (todaySunrise == -1 || todaySunset == -1) {
            nextUpdate = now + 43200000;
        } else {
            if (now > todaySunset) {
                nextUpdate2 = 0 + tomorrowSunrise;
            } else if (now > todaySunrise) {
                nextUpdate2 = 0 + todaySunset;
            } else {
                nextUpdate2 = 0 + todaySunrise;
            }
            nextUpdate = nextUpdate2 + 60000;
        }
        state.f1151 = isNight;
        state.f1150 = yesterdaySunset;
        state.f1149 = todaySunrise;
        state.f1148 = todaySunset;
        state.f1146 = tomorrowSunrise;
        state.f1147 = nextUpdate;
    }
}
