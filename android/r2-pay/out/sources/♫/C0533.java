package ♫;

import java.util.Arrays;
import java.util.HashMap;
import ♫.C0538;
import ♫.C0544;

/* renamed from: ♫.衣  reason: contains not printable characters */
public class C0533 {

    /* renamed from: θ  reason: contains not printable characters */
    public static C0535 f1972;

    /* renamed from: ฿  reason: contains not printable characters */
    public static int f1973 = 1000;

    /* renamed from: µ  reason: contains not printable characters */
    public int f1974;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1975;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1976;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1977;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1978 = 32;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0534 f1979;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1980 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public HashMap<String, C0538> f1981 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0531 f1982;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0534 f1983;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1984;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0530[] f1985;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0538[] f1986;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean[] f1987;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1988;

    /* renamed from: ♫.衣$θ  reason: contains not printable characters */
    public interface AbstractC0534 {
        /* renamed from: θ  reason: contains not printable characters */
        void m2574(C0538 v);
    }

    public C0533() {
        int i = this.f1978;
        this.f1977 = i;
        this.f1985 = null;
        this.f1984 = false;
        this.f1987 = new boolean[i];
        this.f1975 = 1;
        this.f1976 = 0;
        this.f1974 = i;
        this.f1986 = new C0538[f1973];
        this.f1988 = 0;
        C0530[] r0 = new C0530[i];
        this.f1985 = new C0530[i];
        m2544();
        this.f1982 = new C0531();
        this.f1983 = new C0532(this.f1982);
        this.f1979 = new C0530(this.f1982);
    }

    /* renamed from: µ  reason: contains not printable characters */
    public static void m2542() {
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2550() {
        this.f1978 *= 2;
        this.f1985 = (C0530[]) Arrays.copyOf(this.f1985, this.f1978);
        C0531 r0 = this.f1982;
        r0.f1971 = (C0538[]) Arrays.copyOf(r0.f1971, this.f1978);
        int i = this.f1978;
        this.f1987 = new boolean[i];
        this.f1977 = i;
        this.f1974 = i;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m2544() {
        int i = 0;
        while (true) {
            C0530[] r1 = this.f1985;
            if (i < r1.length) {
                C0530 row = r1[i];
                if (row != null) {
                    ((C0537) this.f1982.f1970).m2577(row);
                }
                this.f1985[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m2546() {
        C0531 r1;
        int i = 0;
        while (true) {
            r1 = this.f1982;
            C0538[] r2 = r1.f1971;
            if (i >= r2.length) {
                break;
            }
            C0538 variable = r2[i];
            if (variable != null) {
                variable.m2581();
            }
            i++;
        }
        ((C0537) r1.f1969).m2576(this.f1986, this.f1988);
        this.f1988 = 0;
        Arrays.fill(this.f1982.f1971, (Object) null);
        HashMap<String, C0538> hashMap = this.f1981;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f1980 = 0;
        ((C0530) this.f1983).m2535();
        this.f1975 = 1;
        for (int i2 = 0; i2 < this.f1976; i2++) {
            this.f1985[i2].f1968 = false;
        }
        m2544();
        this.f1976 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2562(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.f1975 + 1 >= this.f1977) {
            m2550();
        }
        C0538 variable = null;
        if (anchor instanceof C0544) {
            variable = ((C0544) anchor).m2611();
            if (variable == null) {
                ((C0544) anchor).m2609();
                variable = ((C0544) anchor).m2611();
            }
            int i = variable.f1997;
            if (i == -1 || i > this.f1980 || this.f1982.f1971[i] == null) {
                if (variable.f1997 != -1) {
                    variable.m2581();
                }
                this.f1980++;
                this.f1975++;
                int i2 = this.f1980;
                variable.f1997 = i2;
                variable.f1999 = C0538.EnumC0539.UNRESTRICTED;
                this.f1982.f1971[i2] = variable;
            }
        }
        return variable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2557() {
        C0530 row = (C0530) ((C0537) this.f1982.f1970).m2575();
        if (row == null) {
            row = new C0530(this.f1982);
        } else {
            row.m2516();
        }
        C0538.m2578();
        return row;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public C0538 m2549() {
        if (this.f1975 + 1 >= this.f1977) {
            m2550();
        }
        C0538 variable = m2563(C0538.EnumC0539.SLACK, (String) null);
        this.f1980++;
        this.f1975++;
        int i = this.f1980;
        variable.f1997 = i;
        this.f1982.f1971[i] = variable;
        return variable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2560() {
        if (this.f1975 + 1 >= this.f1977) {
            m2550();
        }
        C0538 variable = m2563(C0538.EnumC0539.SLACK, (String) null);
        this.f1980++;
        this.f1975++;
        int i = this.f1980;
        variable.f1997 = i;
        this.f1982.f1971[i] = variable;
        return variable;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2551(C0530 row) {
        row.m2525(this, 0);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2566(C0530 row, int sign, int strength) {
        row.m2526(m2561(strength, (String) null), sign);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2561(int strength, String prefix) {
        if (this.f1975 + 1 >= this.f1977) {
            m2550();
        }
        C0538 variable = m2563(C0538.EnumC0539.ERROR, prefix);
        this.f1980++;
        this.f1975++;
        int i = this.f1980;
        variable.f1997 = i;
        variable.f1994 = strength;
        this.f1982.f1971[i] = variable;
        this.f1983.m2574(variable);
        return variable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final C0538 m2563(C0538.EnumC0539 type, String prefix) {
        C0538 variable = (C0538) ((C0537) this.f1982.f1969).m2575();
        if (variable == null) {
            variable = new C0538(type);
            variable.m2583(type);
        } else {
            variable.m2581();
            variable.m2583(type);
        }
        int i = this.f1988;
        int i2 = f1973;
        if (i >= i2) {
            f1973 = i2 * 2;
            this.f1986 = (C0538[]) Arrays.copyOf(this.f1986, f1973);
        }
        C0538[] r1 = this.f1986;
        int i3 = this.f1988;
        this.f1988 = i3 + 1;
        r1[i3] = variable;
        return variable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2555(Object anchor) {
        C0538 variable = ((C0544) anchor).m2611();
        if (variable != null) {
            return (int) (variable.f1996 + 0.5f);
        }
        return 0;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2547() {
        if (this.f1984) {
            boolean fullySolved = true;
            int i = 0;
            while (true) {
                if (i >= this.f1976) {
                    break;
                } else if (!this.f1985[i].f1964) {
                    fullySolved = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!fullySolved) {
                m2567(this.f1983);
            } else {
                m2564();
            }
        } else {
            m2567(this.f1983);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2567(AbstractC0534 goal) {
        m2545((C0530) goal);
        m2554();
        m2556(goal);
        m2564();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m2545(C0530 row) {
        if (this.f1976 > 0) {
            row.f1966.m2511(row, this.f1985);
            if (row.f1966.f1957 == 0) {
                row.f1964 = true;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2565(C0530 row) {
        C0538 pivotCandidate;
        if (row != null) {
            if (this.f1976 + 1 >= this.f1974 || this.f1975 + 1 >= this.f1977) {
                m2550();
            }
            boolean added = false;
            if (!row.f1964) {
                m2545(row);
                if (!row.m2522()) {
                    row.m2520();
                    if (row.m2539(this)) {
                        C0538 extra = m2560();
                        row.f1967 = extra;
                        m2548(row);
                        added = true;
                        ((C0530) this.f1979).m2536(row);
                        m2556(this.f1979);
                        if (extra.f1995 == -1) {
                            if (row.f1967 == extra && (pivotCandidate = row.m2534(extra)) != null) {
                                row.m2521(pivotCandidate);
                            }
                            if (!row.f1964) {
                                row.f1967.m2579(row);
                            }
                            this.f1976--;
                        }
                    }
                    if (!row.m2538()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!added) {
                m2548(row);
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m2548(C0530 row) {
        C0530[] r0 = this.f1985;
        int i = this.f1976;
        if (r0[i] != null) {
            ((C0537) this.f1982.f1970).m2577(r0[i]);
        }
        C0530[] r02 = this.f1985;
        int i2 = this.f1976;
        r02[i2] = row;
        C0538 r03 = row.f1967;
        r03.f1995 = i2;
        this.f1976 = i2 + 1;
        r03.m2579(row);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2556(AbstractC0534 goal) {
        boolean done = false;
        int tries = 0;
        for (int i = 0; i < this.f1975; i++) {
            this.f1987[i] = false;
        }
        while (!done) {
            tries++;
            if (tries >= this.f1975 * 2) {
                return tries;
            }
            if (((C0530) goal).m2532() != null) {
                this.f1987[((C0530) goal).m2532().f1997] = true;
            }
            C0538 pivotCandidate = ((C0530) goal).m2533(this, this.f1987);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f1987;
                int i2 = pivotCandidate.f1997;
                if (zArr[i2]) {
                    return tries;
                }
                zArr[i2] = true;
            }
            if (pivotCandidate != null) {
                float min = Float.MAX_VALUE;
                int pivotRowIndex = -1;
                for (int i3 = 0; i3 < this.f1976; i3++) {
                    C0530 current = this.f1985[i3];
                    if (current.f1967.f1999 != C0538.EnumC0539.UNRESTRICTED && !current.f1964 && current.m2540(pivotCandidate)) {
                        float a_j = current.f1966.m2503(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-current.f1965) / a_j;
                            if (value < min) {
                                min = value;
                                pivotRowIndex = i3;
                            }
                        }
                    }
                }
                if (pivotRowIndex > -1) {
                    C0530 pivotEquation = this.f1985[pivotRowIndex];
                    pivotEquation.f1967.f1995 = -1;
                    pivotEquation.m2521(pivotCandidate);
                    C0538 r5 = pivotEquation.f1967;
                    r5.f1995 = pivotRowIndex;
                    r5.m2579(pivotEquation);
                } else {
                    done = true;
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2554() {
        float f;
        int tries = 0;
        boolean infeasibleSystem = false;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f1976) {
                break;
            }
            C0530[] r4 = this.f1985;
            if (r4[i].f1967.f1999 != C0538.EnumC0539.UNRESTRICTED && r4[i].f1965 < 0.0f) {
                infeasibleSystem = true;
                break;
            }
            i++;
        }
        if (infeasibleSystem) {
            boolean done = false;
            tries = 0;
            while (!done) {
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i2 = 0;
                while (i2 < this.f1976) {
                    C0530 current = this.f1985[i2];
                    if (current.f1967.f1999 != C0538.EnumC0539.UNRESTRICTED && !current.f1964 && current.f1965 < f) {
                        int j = 1;
                        while (j < this.f1975) {
                            C0538 candidate = this.f1982.f1971[j];
                            float a_j = current.f1966.m2503(candidate);
                            if (a_j > f) {
                                for (int k = 0; k < 7; k++) {
                                    float value = candidate.f2000[k] / a_j;
                                    if ((value < min && k == strength) || k > strength) {
                                        min = value;
                                        pivotRowIndex = i2;
                                        pivotColumnIndex = j;
                                        strength = k;
                                    }
                                }
                            }
                            j++;
                            f = 0.0f;
                        }
                    }
                    i2++;
                    f = 0.0f;
                }
                if (pivotRowIndex != -1) {
                    C0530 pivotEquation = this.f1985[pivotRowIndex];
                    pivotEquation.f1967.f1995 = -1;
                    pivotEquation.m2521(this.f1982.f1971[pivotColumnIndex]);
                    C0538 r5 = pivotEquation.f1967;
                    r5.f1995 = pivotRowIndex;
                    r5.m2579(pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.f1975 / 2) {
                    done = true;
                }
                f = 0.0f;
            }
        }
        return tries;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2564() {
        for (int i = 0; i < this.f1976; i++) {
            C0530 row = this.f1985[i];
            row.f1967.f1996 = row.f1965;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0531 m2559() {
        return this.f1982;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2570(C0538 a, C0538 b, int margin, int strength) {
        C0530 row = m2557();
        C0538 slack = m2549();
        slack.f1994 = 0;
        row.m2530(a, b, slack, margin);
        if (strength != 6) {
            m2566(row, (int) (-1.0f * row.f1966.m2503(slack)), strength);
        }
        m2565(row);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2572(C0538 a, C0538 b, boolean hasMatchConstraintWidgets) {
        C0530 row = m2557();
        C0538 slack = m2549();
        slack.f1994 = 0;
        row.m2530(a, b, slack, 0);
        if (hasMatchConstraintWidgets) {
            m2566(row, (int) (-1.0f * row.f1966.m2503(slack)), 1);
        }
        m2565(row);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2552(C0538 a, C0538 b, int margin, int strength) {
        C0530 row = m2557();
        C0538 slack = m2549();
        slack.f1994 = 0;
        row.m2518(a, b, slack, margin);
        if (strength != 6) {
            m2566(row, (int) (-1.0f * row.f1966.m2503(slack)), strength);
        }
        m2565(row);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2553(C0538 a, C0538 b, boolean hasMatchConstraintWidgets) {
        C0530 row = m2557();
        C0538 slack = m2549();
        slack.f1994 = 0;
        row.m2518(a, b, slack, 0);
        if (hasMatchConstraintWidgets) {
            m2566(row, (int) (-1.0f * row.f1966.m2503(slack)), 1);
        }
        m2565(row);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2569(C0538 a, C0538 b, int m1, float bias, C0538 c, C0538 d, int m2, int strength) {
        C0530 row = m2557();
        row.m2528(a, b, m1, bias, c, d, m2);
        if (strength != 6) {
            row.m2525(this, strength);
        }
        m2565(row);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2571(C0538 a, C0538 b, C0538 c, C0538 d, float ratio, int strength) {
        C0530 row = m2557();
        row.m2531(a, b, c, d, ratio);
        if (strength != 6) {
            row.m2525(this, strength);
        }
        m2565(row);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2558(C0538 a, C0538 b, int margin, int strength) {
        C0530 row = m2557();
        row.m2527(a, b, margin);
        if (strength != 6) {
            row.m2525(this, strength);
        }
        m2565(row);
        return row;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2568(C0538 a, int value) {
        int idx = a.f1995;
        if (a.f1995 != -1) {
            C0530 row = this.f1985[idx];
            if (row.f1964) {
                row.f1965 = (float) value;
            } else if (row.f1966.f1957 == 0) {
                row.f1964 = true;
                row.f1965 = (float) value;
            } else {
                C0530 newRow = m2557();
                newRow.m2515(a, value);
                m2565(newRow);
            }
        } else {
            C0530 row2 = m2557();
            row2.m2517(a, value);
            m2565(row2);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0530 m2543(C0533 linearSystem, C0538 variableA, C0538 variableB, C0538 variableC, float percent, boolean withError) {
        C0530 row = linearSystem.m2557();
        if (withError) {
            linearSystem.m2551(row);
        }
        row.m2529(variableA, variableB, variableC, percent);
        return row;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2573(C0548 widget, C0548 target, float angle, int radius) {
        C0538 Al = m2562((Object) widget.m2664(C0544.EnumC0545.LEFT));
        C0538 At = m2562((Object) widget.m2664(C0544.EnumC0545.TOP));
        C0538 Ar = m2562((Object) widget.m2664(C0544.EnumC0545.RIGHT));
        C0538 Ab = m2562((Object) widget.m2664(C0544.EnumC0545.BOTTOM));
        C0538 Bl = m2562((Object) target.m2664(C0544.EnumC0545.LEFT));
        C0538 Bt = m2562((Object) target.m2664(C0544.EnumC0545.TOP));
        C0538 Br = m2562((Object) target.m2664(C0544.EnumC0545.RIGHT));
        C0538 Bb = m2562((Object) target.m2664(C0544.EnumC0545.BOTTOM));
        C0530 row = m2557();
        row.m2519(At, Ab, Bt, Bb, (float) (Math.sin((double) angle) * ((double) radius)));
        m2565(row);
        C0530 row2 = m2557();
        row2.m2519(Al, Ar, Bl, Br, (float) (Math.cos((double) angle) * ((double) radius)));
        m2565(row2);
    }
}
