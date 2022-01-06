package ♫;

import java.util.Arrays;
import ♫.C0538;

/* renamed from: ♫.节  reason: contains not printable characters */
public class C0529 {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1953;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1954;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1955 = 8;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public int[] f1956;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1957 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0530 f1958;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0531 f1959;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0538 f1960 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1961;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public float[] f1962;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f1963;

    public C0529(C0530 arrayRow, C0531 cache) {
        int i = this.f1955;
        this.f1963 = new int[i];
        this.f1956 = new int[i];
        this.f1962 = new float[i];
        this.f1954 = -1;
        this.f1953 = -1;
        this.f1961 = false;
        this.f1958 = arrayRow;
        this.f1959 = cache;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2512(C0538 variable, float value) {
        if (value == 0.0f) {
            m2504(variable, true);
        } else if (this.f1954 == -1) {
            this.f1954 = 0;
            float[] fArr = this.f1962;
            int i = this.f1954;
            fArr[i] = value;
            this.f1963[i] = variable.f1997;
            this.f1956[i] = -1;
            variable.f1993++;
            variable.m2582(this.f1958);
            this.f1957++;
            if (!this.f1961) {
                this.f1953++;
                int i2 = this.f1953;
                int[] iArr = this.f1963;
                if (i2 >= iArr.length) {
                    this.f1961 = true;
                    this.f1953 = iArr.length - 1;
                }
            }
        } else {
            int current = this.f1954;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f1957) {
                int[] iArr2 = this.f1963;
                int i3 = iArr2[current];
                int i4 = variable.f1997;
                if (i3 == i4) {
                    this.f1962[current] = value;
                    return;
                }
                if (iArr2[current] < i4) {
                    previous = current;
                }
                current = this.f1956[current];
                counter++;
            }
            int i5 = this.f1953;
            int availableIndice = i5 + 1;
            if (this.f1961) {
                int[] iArr3 = this.f1963;
                if (iArr3[i5] == -1) {
                    availableIndice = this.f1953;
                } else {
                    availableIndice = iArr3.length;
                }
            }
            int[] iArr4 = this.f1963;
            if (availableIndice >= iArr4.length && this.f1957 < iArr4.length) {
                int i6 = 0;
                while (true) {
                    int[] iArr5 = this.f1963;
                    if (i6 >= iArr5.length) {
                        break;
                    } else if (iArr5[i6] == -1) {
                        availableIndice = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            int[] iArr6 = this.f1963;
            if (availableIndice >= iArr6.length) {
                availableIndice = iArr6.length;
                this.f1955 *= 2;
                this.f1961 = false;
                this.f1953 = availableIndice - 1;
                this.f1962 = Arrays.copyOf(this.f1962, this.f1955);
                this.f1963 = Arrays.copyOf(this.f1963, this.f1955);
                this.f1956 = Arrays.copyOf(this.f1956, this.f1955);
            }
            this.f1963[availableIndice] = variable.f1997;
            this.f1962[availableIndice] = value;
            if (previous != -1) {
                int[] iArr7 = this.f1956;
                iArr7[availableIndice] = iArr7[previous];
                iArr7[previous] = availableIndice;
            } else {
                this.f1956[availableIndice] = this.f1954;
                this.f1954 = availableIndice;
            }
            variable.f1993++;
            variable.m2582(this.f1958);
            this.f1957++;
            if (!this.f1961) {
                this.f1953++;
            }
            if (this.f1957 >= this.f1963.length) {
                this.f1961 = true;
            }
            int i7 = this.f1953;
            int[] iArr8 = this.f1963;
            if (i7 >= iArr8.length) {
                this.f1961 = true;
                this.f1953 = iArr8.length - 1;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2513(C0538 variable, float value, boolean removeFromDefinition) {
        if (value != 0.0f) {
            if (this.f1954 == -1) {
                this.f1954 = 0;
                float[] fArr = this.f1962;
                int i = this.f1954;
                fArr[i] = value;
                this.f1963[i] = variable.f1997;
                this.f1956[i] = -1;
                variable.f1993++;
                variable.m2582(this.f1958);
                this.f1957++;
                if (!this.f1961) {
                    this.f1953++;
                    int i2 = this.f1953;
                    int[] iArr = this.f1963;
                    if (i2 >= iArr.length) {
                        this.f1961 = true;
                        this.f1953 = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int current = this.f1954;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f1957) {
                int[] iArr2 = this.f1963;
                int idx = iArr2[current];
                int i3 = variable.f1997;
                if (idx == i3) {
                    float[] fArr2 = this.f1962;
                    fArr2[current] = fArr2[current] + value;
                    if (fArr2[current] == 0.0f) {
                        if (current == this.f1954) {
                            this.f1954 = this.f1956[current];
                        } else {
                            int[] iArr3 = this.f1956;
                            iArr3[previous] = iArr3[current];
                        }
                        if (removeFromDefinition) {
                            variable.m2580(this.f1958);
                        }
                        if (this.f1961) {
                            this.f1953 = current;
                        }
                        variable.f1993--;
                        this.f1957--;
                        return;
                    }
                    return;
                }
                if (iArr2[current] < i3) {
                    previous = current;
                }
                current = this.f1956[current];
                counter++;
            }
            int i4 = this.f1953;
            int availableIndice = i4 + 1;
            if (this.f1961) {
                int[] iArr4 = this.f1963;
                if (iArr4[i4] == -1) {
                    availableIndice = this.f1953;
                } else {
                    availableIndice = iArr4.length;
                }
            }
            int[] iArr5 = this.f1963;
            if (availableIndice >= iArr5.length && this.f1957 < iArr5.length) {
                int i5 = 0;
                while (true) {
                    int[] iArr6 = this.f1963;
                    if (i5 >= iArr6.length) {
                        break;
                    } else if (iArr6[i5] == -1) {
                        availableIndice = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            int[] iArr7 = this.f1963;
            if (availableIndice >= iArr7.length) {
                availableIndice = iArr7.length;
                this.f1955 *= 2;
                this.f1961 = false;
                this.f1953 = availableIndice - 1;
                this.f1962 = Arrays.copyOf(this.f1962, this.f1955);
                this.f1963 = Arrays.copyOf(this.f1963, this.f1955);
                this.f1956 = Arrays.copyOf(this.f1956, this.f1955);
            }
            this.f1963[availableIndice] = variable.f1997;
            this.f1962[availableIndice] = value;
            if (previous != -1) {
                int[] iArr8 = this.f1956;
                iArr8[availableIndice] = iArr8[previous];
                iArr8[previous] = availableIndice;
            } else {
                this.f1956[availableIndice] = this.f1954;
                this.f1954 = availableIndice;
            }
            variable.f1993++;
            variable.m2582(this.f1958);
            this.f1957++;
            if (!this.f1961) {
                this.f1953++;
            }
            int i6 = this.f1953;
            int[] iArr9 = this.f1963;
            if (i6 >= iArr9.length) {
                this.f1961 = true;
                this.f1953 = iArr9.length - 1;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final float m2504(C0538 variable, boolean removeFromDefinition) {
        if (this.f1960 == variable) {
            this.f1960 = null;
        }
        if (this.f1954 == -1) {
            return 0.0f;
        }
        int current = this.f1954;
        int previous = -1;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            if (this.f1963[current] == variable.f1997) {
                if (current == this.f1954) {
                    this.f1954 = this.f1956[current];
                } else {
                    int[] iArr = this.f1956;
                    iArr[previous] = iArr[current];
                }
                if (removeFromDefinition) {
                    variable.m2580(this.f1958);
                }
                variable.f1993--;
                this.f1957--;
                this.f1963[current] = -1;
                if (this.f1961) {
                    this.f1953 = current;
                }
                return this.f1962[current];
            }
            previous = current;
            current = this.f1956[current];
            counter++;
        }
        return 0.0f;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2508() {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            C0538 variable = this.f1959.f1971[this.f1963[current]];
            if (variable != null) {
                variable.m2580(this.f1958);
            }
            current = this.f1956[current];
            counter++;
        }
        this.f1954 = -1;
        this.f1953 = -1;
        this.f1961 = false;
        this.f1957 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2514(C0538 variable) {
        if (this.f1954 == -1) {
            return false;
        }
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            if (this.f1963[current] == variable.f1997) {
                return true;
            }
            current = this.f1956[current];
            counter++;
        }
        return false;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2500() {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            float[] fArr = this.f1962;
            fArr[current] = fArr[current] * -1.0f;
            current = this.f1956[current];
            counter++;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2509(float amount) {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            float[] fArr = this.f1962;
            fArr[current] = fArr[current] / amount;
            current = this.f1956[current];
            counter++;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m2501(C0538 variable) {
        return variable.f1993 <= 1;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2506(C0533 system) {
        C0538 restrictedCandidate = null;
        C0538 unrestrictedCandidate = null;
        float unrestrictedCandidateAmount = 0.0f;
        float restrictedCandidateAmount = 0.0f;
        boolean unrestrictedCandidateIsNew = false;
        boolean restrictedCandidateIsNew = false;
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            float[] fArr = this.f1962;
            float amount = fArr[current];
            C0538 variable = this.f1959.f1971[this.f1963[current]];
            if (amount < 0.0f) {
                if (amount > (-0.001f)) {
                    fArr[current] = 0.0f;
                    amount = 0.0f;
                    variable.m2580(this.f1958);
                }
            } else if (amount < 0.001f) {
                fArr[current] = 0.0f;
                amount = 0.0f;
                variable.m2580(this.f1958);
            }
            if (amount != 0.0f) {
                if (variable.f1999 == C0538.EnumC0539.UNRESTRICTED) {
                    if (unrestrictedCandidate == null) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = m2501(variable);
                    } else if (unrestrictedCandidateAmount > amount) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = m2501(variable);
                    } else if (!unrestrictedCandidateIsNew && m2501(variable)) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = true;
                    }
                } else if (unrestrictedCandidate == null && amount < 0.0f) {
                    if (restrictedCandidate == null) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = m2501(variable);
                    } else if (restrictedCandidateAmount > amount) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = m2501(variable);
                    } else if (!restrictedCandidateIsNew && m2501(variable)) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = true;
                    }
                }
            }
            current = this.f1956[current];
            counter++;
        }
        if (unrestrictedCandidate != null) {
            return unrestrictedCandidate;
        }
        return restrictedCandidate;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2510(C0530 self, C0530 definition, boolean removeFromDefinition) {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            int i = this.f1963[current];
            C0538 r4 = definition.f1967;
            if (i == r4.f1997) {
                float value = this.f1962[current];
                m2504(r4, removeFromDefinition);
                C0529 definitionVariables = definition.f1966;
                int definitionCurrent = definitionVariables.f1954;
                int definitionCounter = 0;
                while (definitionCurrent != -1 && definitionCounter < definitionVariables.f1957) {
                    m2513(this.f1959.f1971[definitionVariables.f1963[definitionCurrent]], definitionVariables.f1962[definitionCurrent] * value, removeFromDefinition);
                    definitionCurrent = definitionVariables.f1956[definitionCurrent];
                    definitionCounter++;
                }
                self.f1965 += definition.f1965 * value;
                if (removeFromDefinition) {
                    definition.f1967.m2580(self);
                }
                current = this.f1954;
                counter = 0;
            } else {
                current = this.f1956[current];
                counter++;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2511(C0530 self, C0530[] rows) {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            C0538 variable = this.f1959.f1971[this.f1963[current]];
            if (variable.f1995 != -1) {
                float value = this.f1962[current];
                m2504(variable, true);
                C0530 definition = rows[variable.f1995];
                if (!definition.f1964) {
                    C0529 definitionVariables = definition.f1966;
                    int definitionCurrent = definitionVariables.f1954;
                    int definitionCounter = 0;
                    while (definitionCurrent != -1 && definitionCounter < definitionVariables.f1957) {
                        m2513(this.f1959.f1971[definitionVariables.f1963[definitionCurrent]], definitionVariables.f1962[definitionCurrent] * value, true);
                        definitionCurrent = definitionVariables.f1956[definitionCurrent];
                        definitionCounter++;
                    }
                }
                self.f1965 += definition.f1965 * value;
                definition.f1967.m2580(self);
                current = this.f1954;
                counter = 0;
            } else {
                current = this.f1956[current];
                counter++;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2507(boolean[] avoid, C0538 exclude) {
        C0538.EnumC0539 r5;
        int current = this.f1954;
        int counter = 0;
        C0538 pivot = null;
        float value = 0.0f;
        while (current != -1 && counter < this.f1957) {
            if (this.f1962[current] < 0.0f) {
                C0538 v = this.f1959.f1971[this.f1963[current]];
                if ((avoid == null || !avoid[v.f1997]) && v != exclude && ((r5 = v.f1999) == C0538.EnumC0539.SLACK || r5 == C0538.EnumC0539.ERROR)) {
                    float currentValue = this.f1962[current];
                    if (currentValue < value) {
                        value = currentValue;
                        pivot = v;
                    }
                }
            }
            current = this.f1956[current];
            counter++;
        }
        return pivot;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final C0538 m2505(int index) {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            if (counter == index) {
                return this.f1959.f1971[this.f1963[current]];
            }
            current = this.f1956[current];
            counter++;
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final float m2502(int index) {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            if (counter == index) {
                return this.f1962[current];
            }
            current = this.f1956[current];
            counter++;
        }
        return 0.0f;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final float m2503(C0538 v) {
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            if (this.f1963[current] == v.f1997) {
                return this.f1962[current];
            }
            current = this.f1956[current];
            counter++;
        }
        return 0.0f;
    }

    public String toString() {
        String result = "";
        int current = this.f1954;
        int counter = 0;
        while (current != -1 && counter < this.f1957) {
            result = ((result + " -> ") + this.f1962[current] + " : ") + this.f1959.f1971[this.f1963[current]];
            current = this.f1956[current];
            counter++;
        }
        return result;
    }
}
