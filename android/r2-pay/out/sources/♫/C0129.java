package ♫;

import android.graphics.Path;
import android.util.Log;
import androidx.core.graphics.PathParser;
import java.util.ArrayList;

/* renamed from: ♫.ˑ  reason: contains not printable characters */
public class C0129 {

    /* renamed from: ♫.ˑ$θ  reason: contains not printable characters */
    public static class C0131 {

        /* renamed from: θ  reason: contains not printable characters */
        public int f662;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f663;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static float[] m650(float[] original, int start, int end) {
        if (start <= end) {
            int originalLength = original.length;
            if (start < 0 || start > originalLength) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int resultLength = end - start;
            float[] result = new float[resultLength];
            System.arraycopy(original, start, result, 0, Math.min(resultLength, originalLength - start));
            return result;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Path m644(String pathData) {
        Path path = new Path();
        C0130[] nodes = m651(pathData);
        if (nodes == null) {
            return null;
        }
        try {
            C0130.m656(nodes, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + pathData, e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0130[] m651(String pathData) {
        if (pathData == null) {
            return null;
        }
        int start = 0;
        int end = 1;
        ArrayList<PathParser.PathDataNode> list = new ArrayList<>();
        while (end < pathData.length()) {
            int end2 = m643(pathData, end);
            String s = pathData.substring(start, end2).trim();
            if (s.length() > 0) {
                m646((ArrayList<C0130>) list, s.charAt(0), m649(s));
            }
            start = end2;
            end = end2 + 1;
        }
        if (end - start == 1 && start < pathData.length()) {
            m646((ArrayList<C0130>) list, pathData.charAt(start), new float[0]);
        }
        return (C0130[]) list.toArray(new C0130[list.size()]);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0130[] m652(C0130[] source) {
        if (source == null) {
            return null;
        }
        C0130[] copy = new C0130[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = new C0130(source[i]);
        }
        return copy;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m648(C0130[] nodesFrom, C0130[] nodesTo) {
        if (nodesFrom == null || nodesTo == null || nodesFrom.length != nodesTo.length) {
            return false;
        }
        for (int i = 0; i < nodesFrom.length; i++) {
            if (!(nodesFrom[i].f660 == nodesTo[i].f660 && nodesFrom[i].f661.length == nodesTo[i].f661.length)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m647(C0130[] target, C0130[] source) {
        for (int i = 0; i < source.length; i++) {
            target[i].f660 = source[i].f660;
            for (int j = 0; j < source[i].f661.length; j++) {
                target[i].f661[j] = source[i].f661[j];
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m643(String s, int end) {
        while (end < s.length()) {
            char c = s.charAt(end);
            if (((c - 'A') * (c - 'Z') <= 0 || (c - 'a') * (c - 'z') <= 0) && c != 'e' && c != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m646(ArrayList<C0130> arrayList, char cmd, float[] val) {
        arrayList.add(new C0130(cmd, val));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static float[] m649(String s) {
        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] results = new float[s.length()];
            int count = 0;
            int startPosition = 1;
            C0131 result = new C0131();
            int totalLength = s.length();
            while (startPosition < totalLength) {
                m645(s, startPosition, result);
                int endPosition = result.f662;
                if (startPosition < endPosition) {
                    results[count] = Float.parseFloat(s.substring(startPosition, endPosition));
                    count++;
                }
                if (result.f663) {
                    startPosition = endPosition;
                } else {
                    startPosition = endPosition + 1;
                }
            }
            return m650(results, 0, count);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + s + "\"", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[LOOP:0: B:1:0x0007->B:20:0x003b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC] */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m645(java.lang.String r7, int r8, ♫.C0129.C0131 r9) {
        /*
            r0 = r8
            r1 = 0
            r2 = 0
            r9.f663 = r2
            r2 = 0
            r3 = 0
        L_0x0007:
            int r4 = r7.length()
            if (r0 >= r4) goto L_0x003e
            r4 = r3
            r3 = 0
            char r5 = r7.charAt(r0)
            r6 = 32
            if (r5 == r6) goto L_0x0036
            r6 = 69
            if (r5 == r6) goto L_0x0034
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0034
            r6 = 1
            switch(r5) {
                case 44: goto L_0x0036;
                case 45: goto L_0x002c;
                case 46: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0038
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            r2 = 1
            goto L_0x0038
        L_0x0028:
            r1 = 1
            r9.f663 = r6
            goto L_0x0038
        L_0x002c:
            if (r0 == r8) goto L_0x0038
            if (r4 != 0) goto L_0x0038
            r1 = 1
            r9.f663 = r6
            goto L_0x0038
        L_0x0034:
            r3 = 1
            goto L_0x0038
        L_0x0036:
            r1 = 1
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            int r0 = r0 + 1
            goto L_0x0007
        L_0x003e:
            r9.f662 = r0
            return
            switch-data {44->0x0036, 45->0x002c, 46->0x0024, }
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0129.m645(java.lang.String, int, ♫.ˑ$θ):void");
    }

    /* renamed from: ♫.ˑ$Φ  reason: contains not printable characters */
    public static class C0130 {

        /* renamed from: θ  reason: contains not printable characters */
        public char f660;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public float[] f661;

        public C0130(char type, float[] params) {
            this.f660 = type;
            this.f661 = params;
        }

        public C0130(C0130 n) {
            this.f660 = n.f660;
            float[] fArr = n.f661;
            this.f661 = C0129.m650(fArr, 0, fArr.length);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static void m656(C0130[] node, Path path) {
            float[] current = new float[6];
            char previousCommand = 'm';
            for (int i = 0; i < node.length; i++) {
                m655(path, current, previousCommand, node[i].f660, node[i].f661);
                previousCommand = node[i].f660;
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m657(C0130 nodeFrom, C0130 nodeTo, float fraction) {
            int i = 0;
            while (true) {
                float[] fArr = nodeFrom.f661;
                if (i < fArr.length) {
                    this.f661[i] = (fArr[i] * (1.0f - fraction)) + (nodeTo.f661[i] * fraction);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static void m655(Path path, float[] current, char previousCmd, char cmd, float[] val) {
            int incr;
            int k;
            float reflectiveCtrlPointY;
            float reflectiveCtrlPointX;
            float reflectiveCtrlPointY2;
            float reflectiveCtrlPointX2;
            float currentX = current[0];
            float currentY = current[1];
            float ctrlPointX = current[2];
            float ctrlPointY = current[3];
            float currentSegmentStartX = current[4];
            float currentSegmentStartY = current[5];
            switch (cmd) {
                case 'A':
                case C0291.AppCompatTheme_textAppearanceListItem /*{ENCODED_INT: 97}*/:
                    incr = 7;
                    break;
                case 'C':
                case C0291.AppCompatTheme_textAppearanceListItemSmall /*{ENCODED_INT: 99}*/:
                    incr = 6;
                    break;
                case 'H':
                case C0291.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
                case C0291.AppCompatTheme_textColorAlertDialogListItem /*{ENCODED_INT: 104}*/:
                case C0291.AppCompatTheme_windowMinWidthMajor /*{ENCODED_INT: 118}*/:
                    incr = 1;
                    break;
                case 'L':
                case 'M':
                case C0291.AppCompatTheme_popupWindowStyle /*{ENCODED_INT: 84}*/:
                case C0291.AppCompatTheme_tooltipForegroundColor /*{ENCODED_INT: 108}*/:
                case C0291.AppCompatTheme_tooltipFrameBackground /*{ENCODED_INT: 109}*/:
                case C0291.AppCompatTheme_windowFixedWidthMajor /*{ENCODED_INT: 116}*/:
                    incr = 2;
                    break;
                case C0291.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
                case C0291.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                case C0291.AppCompatTheme_windowActionModeOverlay /*{ENCODED_INT: 113}*/:
                case C0291.AppCompatTheme_windowFixedHeightMinor /*{ENCODED_INT: 115}*/:
                    incr = 4;
                    break;
                case C0291.AppCompatTheme_seekBarStyle /*{ENCODED_INT: 90}*/:
                case 'z':
                    path.close();
                    currentX = currentSegmentStartX;
                    currentY = currentSegmentStartY;
                    ctrlPointX = currentSegmentStartX;
                    ctrlPointY = currentSegmentStartY;
                    path.moveTo(currentX, currentY);
                    incr = 2;
                    break;
                default:
                    incr = 2;
                    break;
            }
            int k2 = 0;
            float currentX2 = currentX;
            float currentY2 = currentY;
            float ctrlPointX2 = ctrlPointX;
            float ctrlPointY2 = ctrlPointY;
            float currentSegmentStartX2 = currentSegmentStartX;
            float currentSegmentStartY2 = currentSegmentStartY;
            char previousCmd2 = previousCmd;
            while (k2 < val.length) {
                if (cmd == 'A') {
                    k = k2;
                    m654(path, currentX2, currentY2, val[k + 5], val[k + 6], val[k + 0], val[k + 1], val[k + 2], val[k + 3] != 0.0f, val[k + 4] != 0.0f);
                    currentX2 = val[k + 5];
                    currentY2 = val[k + 6];
                    ctrlPointX2 = currentX2;
                    ctrlPointY2 = currentY2;
                } else if (cmd == 'C') {
                    k = k2;
                    path.cubicTo(val[k + 0], val[k + 1], val[k + 2], val[k + 3], val[k + 4], val[k + 5]);
                    currentX2 = val[k + 4];
                    currentY2 = val[k + 5];
                    ctrlPointX2 = val[k + 2];
                    ctrlPointY2 = val[k + 3];
                } else if (cmd == 'H') {
                    k = k2;
                    path.lineTo(val[k + 0], currentY2);
                    currentX2 = val[k + 0];
                } else if (cmd == 'Q') {
                    k = k2;
                    path.quadTo(val[k + 0], val[k + 1], val[k + 2], val[k + 3]);
                    float ctrlPointX3 = val[k + 0];
                    float ctrlPointY3 = val[k + 1];
                    currentX2 = val[k + 2];
                    currentY2 = val[k + 3];
                    ctrlPointX2 = ctrlPointX3;
                    ctrlPointY2 = ctrlPointY3;
                } else if (cmd == 'V') {
                    k = k2;
                    path.lineTo(currentX2, val[k + 0]);
                    currentY2 = val[k + 0];
                } else if (cmd == 'a') {
                    k = k2;
                    m654(path, currentX2, currentY2, val[k2 + 5] + currentX2, val[k2 + 6] + currentY2, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3] != 0.0f, val[k2 + 4] != 0.0f);
                    currentX2 += val[k + 5];
                    currentY2 += val[k + 6];
                    ctrlPointX2 = currentX2;
                    ctrlPointY2 = currentY2;
                } else if (cmd == 'c') {
                    path.rCubicTo(val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3], val[k2 + 4], val[k2 + 5]);
                    float ctrlPointX4 = val[k2 + 2] + currentX2;
                    float ctrlPointY4 = val[k2 + 3] + currentY2;
                    currentX2 += val[k2 + 4];
                    currentY2 += val[k2 + 5];
                    ctrlPointX2 = ctrlPointX4;
                    ctrlPointY2 = ctrlPointY4;
                    k = k2;
                } else if (cmd == 'h') {
                    path.rLineTo(val[k2 + 0], 0.0f);
                    currentX2 += val[k2 + 0];
                    k = k2;
                } else if (cmd == 'q') {
                    path.rQuadTo(val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX5 = val[k2 + 0] + currentX2;
                    float ctrlPointY5 = val[k2 + 1] + currentY2;
                    currentX2 += val[k2 + 2];
                    currentY2 += val[k2 + 3];
                    ctrlPointX2 = ctrlPointX5;
                    ctrlPointY2 = ctrlPointY5;
                    k = k2;
                } else if (cmd == 'v') {
                    path.rLineTo(0.0f, val[k2 + 0]);
                    currentY2 += val[k2 + 0];
                    k = k2;
                } else if (cmd == 'L') {
                    path.lineTo(val[k2 + 0], val[k2 + 1]);
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    k = k2;
                } else if (cmd == 'M') {
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    if (k2 > 0) {
                        path.lineTo(val[k2 + 0], val[k2 + 1]);
                        k = k2;
                    } else {
                        path.moveTo(val[k2 + 0], val[k2 + 1]);
                        currentSegmentStartX2 = currentX2;
                        currentSegmentStartY2 = currentY2;
                        k = k2;
                    }
                } else if (cmd == 'S') {
                    if (previousCmd2 == 'c' || previousCmd2 == 's' || previousCmd2 == 'C' || previousCmd2 == 'S') {
                        reflectiveCtrlPointX = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointY = (2.0f * currentY2) - ctrlPointY2;
                    } else {
                        reflectiveCtrlPointX = currentX2;
                        reflectiveCtrlPointY = currentY2;
                    }
                    path.cubicTo(reflectiveCtrlPointX, reflectiveCtrlPointY, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX6 = val[k2 + 0];
                    float ctrlPointY6 = val[k2 + 1];
                    currentX2 = val[k2 + 2];
                    currentY2 = val[k2 + 3];
                    ctrlPointX2 = ctrlPointX6;
                    ctrlPointY2 = ctrlPointY6;
                    k = k2;
                } else if (cmd == 'T') {
                    float reflectiveCtrlPointX3 = currentX2;
                    float reflectiveCtrlPointY3 = currentY2;
                    if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                        reflectiveCtrlPointX3 = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointY3 = (2.0f * currentY2) - ctrlPointY2;
                    }
                    path.quadTo(reflectiveCtrlPointX3, reflectiveCtrlPointY3, val[k2 + 0], val[k2 + 1]);
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    ctrlPointX2 = reflectiveCtrlPointX3;
                    ctrlPointY2 = reflectiveCtrlPointY3;
                    k = k2;
                } else if (cmd == 'l') {
                    path.rLineTo(val[k2 + 0], val[k2 + 1]);
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    k = k2;
                } else if (cmd == 'm') {
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    if (k2 > 0) {
                        path.rLineTo(val[k2 + 0], val[k2 + 1]);
                        k = k2;
                    } else {
                        path.rMoveTo(val[k2 + 0], val[k2 + 1]);
                        currentSegmentStartX2 = currentX2;
                        currentSegmentStartY2 = currentY2;
                        k = k2;
                    }
                } else if (cmd == 's') {
                    if (previousCmd2 == 'c' || previousCmd2 == 's' || previousCmd2 == 'C' || previousCmd2 == 'S') {
                        reflectiveCtrlPointX2 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointY2 = currentY2 - ctrlPointY2;
                    } else {
                        reflectiveCtrlPointX2 = 0.0f;
                        reflectiveCtrlPointY2 = 0.0f;
                    }
                    path.rCubicTo(reflectiveCtrlPointX2, reflectiveCtrlPointY2, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX7 = val[k2 + 0] + currentX2;
                    float ctrlPointY7 = val[k2 + 1] + currentY2;
                    currentX2 += val[k2 + 2];
                    currentY2 += val[k2 + 3];
                    ctrlPointX2 = ctrlPointX7;
                    ctrlPointY2 = ctrlPointY7;
                    k = k2;
                } else if (cmd != 't') {
                    k = k2;
                } else {
                    float reflectiveCtrlPointX4 = 0.0f;
                    float reflectiveCtrlPointY4 = 0.0f;
                    if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                        reflectiveCtrlPointX4 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointY4 = currentY2 - ctrlPointY2;
                    }
                    path.rQuadTo(reflectiveCtrlPointX4, reflectiveCtrlPointY4, val[k2 + 0], val[k2 + 1]);
                    float ctrlPointX8 = currentX2 + reflectiveCtrlPointX4;
                    float ctrlPointY8 = currentY2 + reflectiveCtrlPointY4;
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    ctrlPointX2 = ctrlPointX8;
                    ctrlPointY2 = ctrlPointY8;
                    k = k2;
                }
                previousCmd2 = cmd;
                k2 = k + incr;
            }
            current[0] = currentX2;
            current[1] = currentY2;
            current[2] = ctrlPointX2;
            current[3] = ctrlPointY2;
            current[4] = currentSegmentStartX2;
            current[5] = currentSegmentStartY2;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static void m654(Path p, float x0, float y0, float x1, float y1, float a, float b, float theta, boolean isMoreThanHalf, boolean isPositiveArc) {
            double cy;
            double cx;
            double thetaD = Math.toRadians((double) theta);
            double cosTheta = Math.cos(thetaD);
            double sinTheta = Math.sin(thetaD);
            double x0p = ((((double) x0) * cosTheta) + (((double) y0) * sinTheta)) / ((double) a);
            double y0p = ((((double) (-x0)) * sinTheta) + (((double) y0) * cosTheta)) / ((double) b);
            double x1p = ((((double) x1) * cosTheta) + (((double) y1) * sinTheta)) / ((double) a);
            double y1p = ((((double) (-x1)) * sinTheta) + (((double) y1) * cosTheta)) / ((double) b);
            double dx = x0p - x1p;
            double dy = y0p - y1p;
            double xm = (x0p + x1p) / 2.0d;
            double ym = (y0p + y1p) / 2.0d;
            double dsq = (dx * dx) + (dy * dy);
            if (dsq == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double disc = (1.0d / dsq) - 0.25d;
            if (disc < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + dsq);
                float adjust = (float) (Math.sqrt(dsq) / 1.99999d);
                m654(p, x0, y0, x1, y1, a * adjust, b * adjust, theta, isMoreThanHalf, isPositiveArc);
                return;
            }
            double s = Math.sqrt(disc);
            double sdx = s * dx;
            double sdy = s * dy;
            if (isMoreThanHalf == isPositiveArc) {
                cx = xm - sdy;
                cy = ym + sdx;
            } else {
                cx = xm + sdy;
                cy = ym - sdx;
            }
            double eta0 = Math.atan2(y0p - cy, x0p - cx);
            double sweep = Math.atan2(y1p - cy, x1p - cx) - eta0;
            if (isPositiveArc != (sweep >= 0.0d)) {
                if (sweep > 0.0d) {
                    sweep -= 6.283185307179586d;
                } else {
                    sweep += 6.283185307179586d;
                }
            }
            double cx2 = cx * ((double) a);
            double cy2 = ((double) b) * cy;
            m653(p, (cx2 * cosTheta) - (cy2 * sinTheta), (cx2 * sinTheta) + (cy2 * cosTheta), (double) a, (double) b, (double) x0, (double) y0, thetaD, eta0, sweep);
        }

        /* JADX INFO: Multiple debug info for r2v12 double: [D('anglePerSegment' double), D('e2x' double)] */
        /* JADX INFO: Multiple debug info for r11v2 double: [D('e2y' double), D('cosEta1' double)] */
        /* JADX INFO: Multiple debug info for r6v2 double: [D('q1y' double), D('numSegments' int)] */
        /* JADX INFO: Multiple debug info for r4v10 double: [D('ep2y' double), D('q2y' double)] */
        /* renamed from: θ  reason: contains not printable characters */
        public static void m653(Path p, double cx, double cy, double a, double b, double e1x, double e1y, double theta, double start, double sweep) {
            double d = a;
            int numSegments = (int) Math.ceil(Math.abs((sweep * 4.0d) / 3.141592653589793d));
            double cosTheta = Math.cos(theta);
            double sinTheta = Math.sin(theta);
            double cosEta1 = Math.cos(start);
            double sinEta1 = Math.sin(start);
            double anglePerSegment = sweep / ((double) numSegments);
            double ep1x = (((-d) * cosTheta) * sinEta1) - ((b * sinTheta) * cosEta1);
            double ep1y = ((-d) * sinTheta * sinEta1) + (b * cosTheta * cosEta1);
            double e1x2 = e1x;
            double e1y2 = e1y;
            int i = 0;
            double eta1 = start;
            while (i < numSegments) {
                double eta2 = eta1 + anglePerSegment;
                double sinEta2 = Math.sin(eta2);
                double cosEta2 = Math.cos(eta2);
                double e2x = (cx + ((d * cosTheta) * cosEta2)) - ((b * sinTheta) * sinEta2);
                double cosEta12 = cy + (d * sinTheta * cosEta2) + (b * cosTheta * sinEta2);
                double ep2x = (((-d) * cosTheta) * sinEta2) - ((b * sinTheta) * cosEta2);
                double ep2y = ((-d) * sinTheta * sinEta2) + (b * cosTheta * cosEta2);
                double tanDiff2 = Math.tan((eta2 - eta1) / 2.0d);
                double alpha = (Math.sin(eta2 - eta1) * (Math.sqrt(((tanDiff2 * 3.0d) * tanDiff2) + 4.0d) - 1.0d)) / 3.0d;
                p.rLineTo(0.0f, 0.0f);
                p.cubicTo((float) (e1x2 + (alpha * ep1x)), (float) (e1y2 + (alpha * ep1y)), (float) (e2x - (alpha * ep2x)), (float) (cosEta12 - (alpha * ep2y)), (float) e2x, (float) cosEta12);
                eta1 = eta2;
                e1x2 = e2x;
                e1y2 = cosEta12;
                ep1x = ep2x;
                ep1y = ep2y;
                i++;
                d = a;
                numSegments = numSegments;
                sinEta1 = sinEta1;
                anglePerSegment = anglePerSegment;
                cosEta1 = cosEta1;
                cosTheta = cosTheta;
                sinTheta = sinTheta;
            }
        }
    }
}
