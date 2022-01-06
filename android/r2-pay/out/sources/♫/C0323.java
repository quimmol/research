package ♫;

/* renamed from: ♫.之  reason: contains not printable characters */
public class C0323 {

    /* renamed from: θ  reason: contains not printable characters */
    public static C0323 f1138;

    /* renamed from: Φ  reason: contains not printable characters */
    public long f1139;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1140;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public long f1141;

    /* renamed from: θ  reason: contains not printable characters */
    public static C0323 m1465() {
        if (f1138 == null) {
            f1138 = new C0323();
        }
        return f1138;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1466(long time, double latitude, double longitude) {
        float daysSince2000 = ((float) (time - 946728000000L)) / 8.64E7f;
        float meanAnomaly = (0.01720197f * daysSince2000) + 6.24006f;
        double solarLng = 1.796593063d + ((double) meanAnomaly) + (Math.sin((double) meanAnomaly) * 0.03341960161924362d) + (Math.sin((double) (2.0f * meanAnomaly)) * 3.4906598739326E-4d) + (Math.sin((double) (3.0f * meanAnomaly)) * 5.236000106378924E-6d) + 3.141592653589793d;
        double arcLongitude = (-longitude) / 360.0d;
        double solarTransitJ2000 = ((double) (9.0E-4f + ((float) Math.round(((double) (daysSince2000 - 9.0E-4f)) - arcLongitude)))) + arcLongitude + (Math.sin((double) meanAnomaly) * 0.0053d) + (Math.sin(2.0d * solarLng) * -0.0069d);
        double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331d));
        double latRad = 0.01745329238474369d * latitude;
        double cosHourAngle = (Math.sin(-0.10471975803375244d) - (Math.sin(latRad) * Math.sin(solarDec))) / (Math.cos(latRad) * Math.cos(solarDec));
        if (cosHourAngle >= 1.0d) {
            this.f1140 = 1;
            this.f1141 = -1;
            this.f1139 = -1;
        } else if (cosHourAngle <= -1.0d) {
            this.f1140 = 0;
            this.f1141 = -1;
            this.f1139 = -1;
        } else {
            float hourAngle = (float) (Math.acos(cosHourAngle) / 6.283185307179586d);
            this.f1141 = Math.round((((double) hourAngle) + solarTransitJ2000) * 8.64E7d) + 946728000000L;
            this.f1139 = Math.round((solarTransitJ2000 - ((double) hourAngle)) * 8.64E7d) + 946728000000L;
            if (this.f1139 >= time || this.f1141 <= time) {
                this.f1140 = 1;
            } else {
                this.f1140 = 0;
            }
        }
    }
}
