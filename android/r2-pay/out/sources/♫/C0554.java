package ♫;

import ♫.C0548;

/* renamed from: ♫.还  reason: contains not printable characters */
public class C0554 {

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean[] f2161 = new boolean[3];

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2752(C0550 container, C0533 system, C0548 widget) {
        if (((C0548) container).f2089[0] != C0548.EnumC0549.WRAP_CONTENT && widget.f2089[0] == C0548.EnumC0549.MATCH_PARENT) {
            int left = widget.f2081.f2030;
            int right = container.m2700() - widget.f2066.f2030;
            C0544 r2 = widget.f2081;
            r2.f2031 = system.m2562((Object) r2);
            C0544 r22 = widget.f2066;
            r22.f2031 = system.m2562((Object) r22);
            system.m2568(widget.f2081.f2031, left);
            system.m2568(widget.f2066.f2031, right);
            widget.f2077 = 2;
            widget.m2672(left, right);
        }
        if (((C0548) container).f2089[1] != C0548.EnumC0549.WRAP_CONTENT && widget.f2089[1] == C0548.EnumC0549.MATCH_PARENT) {
            int top = widget.f2071.f2030;
            int bottom = container.m2632() - widget.f2060.f2030;
            C0544 r23 = widget.f2071;
            r23.f2031 = system.m2562((Object) r23);
            C0544 r24 = widget.f2060;
            r24.f2031 = system.m2562((Object) r24);
            system.m2568(widget.f2071.f2031, top);
            system.m2568(widget.f2060.f2031, bottom);
            if (widget.f2099 > 0 || widget.m2698() == 8) {
                C0544 r25 = widget.f2063;
                r25.f2031 = system.m2562((Object) r25);
                system.m2568(widget.f2063.f2031, widget.f2099 + top);
            }
            widget.f2069 = 2;
            widget.m2635(top, bottom);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003c A[RETURN] */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2753(♫.C0548 r5, int r6) {
        /*
            ♫.责$θ[] r0 = r5.f2089
            r1 = r0[r6]
            ♫.责$θ r2 = ♫.C0548.EnumC0549.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.f2061
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001e
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r0 = r0[r4]
            ♫.责$θ r1 = ♫.C0548.EnumC0549.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001d
            return r3
        L_0x001d:
            return r3
        L_0x001e:
            if (r6 != 0) goto L_0x002e
            int r0 = r5.f2065
            if (r0 == 0) goto L_0x0025
            return r3
        L_0x0025:
            int r0 = r5.f2062
            if (r0 != 0) goto L_0x002d
            int r0 = r5.f2056
            if (r0 == 0) goto L_0x003c
        L_0x002d:
            return r3
        L_0x002e:
            int r0 = r5.f2059
            if (r0 == 0) goto L_0x0033
            return r3
        L_0x0033:
            int r0 = r5.f2114
            if (r0 != 0) goto L_0x003d
            int r0 = r5.f2107
            if (r0 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            return r4
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0554.m2753(♫.责, int):boolean");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2750(int optimisationLevel, C0548 widget) {
        widget.m2705();
        C0556 leftNode = widget.f2081.m2616();
        C0556 topNode = widget.f2071.m2616();
        C0556 rightNode = widget.f2066.m2616();
        C0556 bottomNode = widget.f2060.m2616();
        boolean optimiseDimensions = (optimisationLevel & 8) == 8;
        boolean isOptimizableHorizontalMatch = widget.f2089[0] == C0548.EnumC0549.MATCH_CONSTRAINT && m2753(widget, 0);
        if (!(leftNode.f2166 == 4 || rightNode.f2166 == 4)) {
            if (widget.f2089[0] == C0548.EnumC0549.FIXED || (isOptimizableHorizontalMatch && widget.m2698() == 8)) {
                if (widget.f2081.f2034 == null && widget.f2066.f2034 == null) {
                    leftNode.m2762(1);
                    rightNode.m2762(1);
                    if (optimiseDimensions) {
                        rightNode.m2767(leftNode, 1, widget.m2647());
                    } else {
                        rightNode.m2766(leftNode, widget.m2700());
                    }
                } else if (widget.f2081.f2034 != null && widget.f2066.f2034 == null) {
                    leftNode.m2762(1);
                    rightNode.m2762(1);
                    if (optimiseDimensions) {
                        rightNode.m2767(leftNode, 1, widget.m2647());
                    } else {
                        rightNode.m2766(leftNode, widget.m2700());
                    }
                } else if (widget.f2081.f2034 == null && widget.f2066.f2034 != null) {
                    leftNode.m2762(1);
                    rightNode.m2762(1);
                    leftNode.m2766(rightNode, -widget.m2700());
                    if (optimiseDimensions) {
                        leftNode.m2767(rightNode, -1, widget.m2647());
                    } else {
                        leftNode.m2766(rightNode, -widget.m2700());
                    }
                } else if (!(widget.f2081.f2034 == null || widget.f2066.f2034 == null)) {
                    leftNode.m2762(2);
                    rightNode.m2762(2);
                    if (optimiseDimensions) {
                        widget.m2647().m2775(leftNode);
                        widget.m2647().m2775(rightNode);
                        leftNode.m2759(rightNode, -1, widget.m2647());
                        rightNode.m2759(leftNode, 1, widget.m2647());
                    } else {
                        leftNode.m2758(rightNode, (float) (-widget.m2700()));
                        rightNode.m2758(leftNode, (float) widget.m2700());
                    }
                }
            } else if (isOptimizableHorizontalMatch) {
                int width = widget.m2700();
                leftNode.m2762(1);
                rightNode.m2762(1);
                if (widget.f2081.f2034 == null && widget.f2066.f2034 == null) {
                    if (optimiseDimensions) {
                        rightNode.m2767(leftNode, 1, widget.m2647());
                    } else {
                        rightNode.m2766(leftNode, width);
                    }
                } else if (widget.f2081.f2034 == null || widget.f2066.f2034 != null) {
                    if (widget.f2081.f2034 != null || widget.f2066.f2034 == null) {
                        if (!(widget.f2081.f2034 == null || widget.f2066.f2034 == null)) {
                            if (optimiseDimensions) {
                                widget.m2647().m2775(leftNode);
                                widget.m2647().m2775(rightNode);
                            }
                            if (widget.f2061 == 0.0f) {
                                leftNode.m2762(3);
                                rightNode.m2762(3);
                                leftNode.m2758(rightNode, 0.0f);
                                rightNode.m2758(leftNode, 0.0f);
                            } else {
                                leftNode.m2762(2);
                                rightNode.m2762(2);
                                leftNode.m2758(rightNode, (float) (-width));
                                rightNode.m2758(leftNode, (float) width);
                                widget.m2703(width);
                            }
                        }
                    } else if (optimiseDimensions) {
                        leftNode.m2767(rightNode, -1, widget.m2647());
                    } else {
                        leftNode.m2766(rightNode, -width);
                    }
                } else if (optimiseDimensions) {
                    rightNode.m2767(leftNode, 1, widget.m2647());
                } else {
                    rightNode.m2766(leftNode, width);
                }
            }
        }
        boolean isOptimizableVerticalMatch = widget.f2089[1] == C0548.EnumC0549.MATCH_CONSTRAINT && m2753(widget, 1);
        if (topNode.f2166 != 4 && bottomNode.f2166 != 4) {
            if (widget.f2089[1] == C0548.EnumC0549.FIXED || (isOptimizableVerticalMatch && widget.m2698() == 8)) {
                if (widget.f2071.f2034 == null && widget.f2060.f2034 == null) {
                    topNode.m2762(1);
                    bottomNode.m2762(1);
                    if (optimiseDimensions) {
                        bottomNode.m2767(topNode, 1, widget.m2668());
                    } else {
                        bottomNode.m2766(topNode, widget.m2632());
                    }
                    C0544 r6 = widget.f2063;
                    if (r6.f2034 != null) {
                        r6.m2616().m2762(1);
                        topNode.m2763(1, widget.f2063.m2616(), -widget.f2099);
                    }
                } else if (widget.f2071.f2034 != null && widget.f2060.f2034 == null) {
                    topNode.m2762(1);
                    bottomNode.m2762(1);
                    if (optimiseDimensions) {
                        bottomNode.m2767(topNode, 1, widget.m2668());
                    } else {
                        bottomNode.m2766(topNode, widget.m2632());
                    }
                    if (widget.f2099 > 0) {
                        widget.f2063.m2616().m2763(1, topNode, widget.f2099);
                    }
                } else if (widget.f2071.f2034 == null && widget.f2060.f2034 != null) {
                    topNode.m2762(1);
                    bottomNode.m2762(1);
                    if (optimiseDimensions) {
                        topNode.m2767(bottomNode, -1, widget.m2668());
                    } else {
                        topNode.m2766(bottomNode, -widget.m2632());
                    }
                    if (widget.f2099 > 0) {
                        widget.f2063.m2616().m2763(1, topNode, widget.f2099);
                    }
                } else if (widget.f2071.f2034 != null && widget.f2060.f2034 != null) {
                    topNode.m2762(2);
                    bottomNode.m2762(2);
                    if (optimiseDimensions) {
                        topNode.m2759(bottomNode, -1, widget.m2668());
                        bottomNode.m2759(topNode, 1, widget.m2668());
                        widget.m2668().m2775(topNode);
                        widget.m2647().m2775(bottomNode);
                    } else {
                        topNode.m2758(bottomNode, (float) (-widget.m2632()));
                        bottomNode.m2758(topNode, (float) widget.m2632());
                    }
                    if (widget.f2099 > 0) {
                        widget.f2063.m2616().m2763(1, topNode, widget.f2099);
                    }
                }
            } else if (isOptimizableVerticalMatch) {
                int height = widget.m2632();
                topNode.m2762(1);
                bottomNode.m2762(1);
                if (widget.f2071.f2034 == null && widget.f2060.f2034 == null) {
                    if (optimiseDimensions) {
                        bottomNode.m2767(topNode, 1, widget.m2668());
                    } else {
                        bottomNode.m2766(topNode, height);
                    }
                } else if (widget.f2071.f2034 == null || widget.f2060.f2034 != null) {
                    if (widget.f2071.f2034 != null || widget.f2060.f2034 == null) {
                        if (widget.f2071.f2034 != null && widget.f2060.f2034 != null) {
                            if (optimiseDimensions) {
                                widget.m2668().m2775(topNode);
                                widget.m2647().m2775(bottomNode);
                            }
                            if (widget.f2061 == 0.0f) {
                                topNode.m2762(3);
                                bottomNode.m2762(3);
                                topNode.m2758(bottomNode, 0.0f);
                                bottomNode.m2758(topNode, 0.0f);
                                return;
                            }
                            topNode.m2762(2);
                            bottomNode.m2762(2);
                            topNode.m2758(bottomNode, (float) (-height));
                            bottomNode.m2758(topNode, (float) height);
                            widget.m2640(height);
                            if (widget.f2099 > 0) {
                                widget.f2063.m2616().m2763(1, topNode, widget.f2099);
                            }
                        }
                    } else if (optimiseDimensions) {
                        topNode.m2767(bottomNode, -1, widget.m2668());
                    } else {
                        topNode.m2766(bottomNode, -height);
                    }
                } else if (optimiseDimensions) {
                    bottomNode.m2767(topNode, 1, widget.m2668());
                } else {
                    bottomNode.m2766(topNode, height);
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2754(C0550 container, C0533 system, int orientation, int offset, C0543 chainHead) {
        boolean isChainSpreadInside;
        boolean isChainSpread;
        boolean isChainPacked;
        float distance;
        float distance2;
        C0548 widget;
        float extraMargin;
        float dimension;
        float distance3;
        C0556 lastNode;
        float dimension2;
        float totalWeights;
        boolean isChainSpread2;
        int numMatchConstraints;
        int numMatchConstraints2;
        C0548 next;
        C0548 first = chainHead.f2025;
        C0548 last = chainHead.f2017;
        C0548 firstVisibleWidget = chainHead.f2020;
        C0548 lastVisibleWidget = chainHead.f2012;
        C0548 head = chainHead.f2014;
        boolean done = false;
        float totalWeights2 = chainHead.f2022;
        C0548 firstMatchConstraintsWidget = chainHead.f2011;
        C0548 r14 = chainHead.f2027;
        boolean isWrapContent = ((C0548) container).f2089[orientation] == C0548.EnumC0549.WRAP_CONTENT;
        if (orientation == 0) {
            isChainSpread = head.f2105 == 0;
            isChainSpreadInside = head.f2105 == 1;
            isChainPacked = head.f2105 == 2;
        } else {
            isChainSpread = head.f2106 == 0;
            isChainSpreadInside = head.f2106 == 1;
            isChainPacked = head.f2106 == 2;
        }
        int numMatchConstraints3 = 0;
        int numVisibleWidgets = 0;
        float totalMargins = 0.0f;
        float totalSize = 0.0f;
        C0548 widget2 = first;
        while (!done) {
            if (widget2.m2698() != 8) {
                numVisibleWidgets++;
                if (orientation == 0) {
                    totalSize += (float) widget2.m2700();
                } else {
                    totalSize += (float) widget2.m2632();
                }
                if (widget2 != firstVisibleWidget) {
                    totalSize += (float) widget2.f2088[offset].m2608();
                }
                if (widget2 != lastVisibleWidget) {
                    totalSize += (float) widget2.f2088[offset + 1].m2608();
                }
                totalMargins = totalMargins + ((float) widget2.f2088[offset].m2608()) + ((float) widget2.f2088[offset + 1].m2608());
            }
            C0544 r10 = widget2.f2088[offset];
            if (widget2.m2698() != 8 && widget2.f2089[orientation] == C0548.EnumC0549.MATCH_CONSTRAINT) {
                numMatchConstraints3++;
                if (orientation == 0) {
                    if (!(widget2.f2065 == 0 && widget2.f2062 == 0 && widget2.f2056 == 0)) {
                        return false;
                    }
                } else if (!(widget2.f2059 == 0 && widget2.f2114 == 0 && widget2.f2107 == 0)) {
                    return false;
                }
                if (widget2.f2061 != 0.0f) {
                    return false;
                }
            }
            C0544 nextAnchor = widget2.f2088[offset + 1].f2034;
            if (nextAnchor != null) {
                C0548 next2 = nextAnchor.f2035;
                numMatchConstraints2 = numMatchConstraints3;
                C0544[] r7 = next2.f2088;
                if (r7[offset].f2034 == null || r7[offset].f2034.f2035 != widget2) {
                    next = null;
                } else {
                    next = next2;
                }
            } else {
                numMatchConstraints2 = numMatchConstraints3;
                next = null;
            }
            if (next != null) {
                widget2 = next;
                done = done;
            } else {
                done = true;
            }
            numMatchConstraints3 = numMatchConstraints2;
            firstMatchConstraintsWidget = firstMatchConstraintsWidget;
        }
        C0556 firstNode = first.f2088[offset].m2616();
        C0556 lastNode2 = last.f2088[offset + 1].m2616();
        C0556 r142 = firstNode.f2171;
        if (r142 != null) {
            C0556 r15 = lastNode2.f2171;
            if (r15 != null) {
                if (((C0558) r142).f2174 == 1) {
                    if (((C0558) r15).f2174 == 1) {
                        if (numMatchConstraints3 > 0 && numMatchConstraints3 != numVisibleWidgets) {
                            return false;
                        }
                        float extraMargin2 = 0.0f;
                        if (isChainPacked || isChainSpread || isChainSpreadInside) {
                            if (firstVisibleWidget != null) {
                                extraMargin2 = (float) firstVisibleWidget.f2088[offset].m2608();
                            }
                            if (lastVisibleWidget != null) {
                                extraMargin2 += (float) lastVisibleWidget.f2088[offset + 1].m2608();
                            }
                        }
                        float firstOffset = firstNode.f2171.f2165;
                        float lastOffset = lastNode2.f2171.f2165;
                        if (firstOffset < lastOffset) {
                            distance = (lastOffset - firstOffset) - totalSize;
                        } else {
                            distance = (firstOffset - lastOffset) - totalSize;
                        }
                        if (numMatchConstraints3 <= 0 || numMatchConstraints3 != numVisibleWidgets) {
                            boolean isChainPacked2 = isChainPacked;
                            boolean isChainSpread3 = isChainSpread;
                            if (distance < 0.0f) {
                                isChainSpreadInside = false;
                                isChainSpread3 = false;
                                isChainPacked2 = true;
                            }
                            if (isChainPacked2) {
                                C0548 widget3 = first;
                                float distance4 = (first.m2658(orientation) * (distance - extraMargin2)) + firstOffset;
                                while (widget3 != null) {
                                    if (C0533.f1972 == null) {
                                        C0548 next3 = widget3.f2075[orientation];
                                        if (next3 != null || widget3 == last) {
                                            if (orientation == 0) {
                                                dimension2 = (float) widget3.m2700();
                                            } else {
                                                dimension2 = (float) widget3.m2632();
                                            }
                                            float distance5 = distance4 + ((float) widget3.f2088[offset].m2608());
                                            widget3.f2088[offset].m2616().m2765(firstNode.f2167, distance5);
                                            lastNode = lastNode2;
                                            widget3.f2088[offset + 1].m2616().m2765(firstNode.f2167, distance5 + dimension2);
                                            widget3.f2088[offset].m2616().m2764(system);
                                            widget3.f2088[offset + 1].m2616().m2764(system);
                                            distance4 = distance5 + dimension2 + ((float) widget3.f2088[offset + 1].m2608());
                                        } else {
                                            lastNode = lastNode2;
                                        }
                                        widget3 = next3;
                                        lastNode2 = lastNode;
                                    } else {
                                        throw null;
                                    }
                                }
                                return true;
                            } else if (!isChainSpread3 && !isChainSpreadInside) {
                                return true;
                            } else {
                                if (isChainSpread3) {
                                    distance -= extraMargin2;
                                } else if (isChainSpreadInside) {
                                    distance -= extraMargin2;
                                }
                                float gap = distance / ((float) (numVisibleWidgets + 1));
                                if (isChainSpreadInside) {
                                    if (numVisibleWidgets > 1) {
                                        gap = distance / ((float) (numVisibleWidgets - 1));
                                    } else {
                                        gap = distance / 2.0f;
                                    }
                                }
                                float distance6 = firstOffset;
                                if (first.m2698() != 8) {
                                    distance6 += gap;
                                }
                                if (isChainSpreadInside && numVisibleWidgets > 1) {
                                    distance6 = firstOffset + ((float) firstVisibleWidget.f2088[offset].m2608());
                                }
                                if (!isChainSpread3 || firstVisibleWidget == null) {
                                    widget = first;
                                    distance2 = distance6;
                                } else {
                                    widget = first;
                                    distance2 = distance6 + ((float) firstVisibleWidget.f2088[offset].m2608());
                                }
                                while (widget != null) {
                                    if (C0533.f1972 == null) {
                                        C0548 next4 = widget.f2075[orientation];
                                        if (next4 != null || widget == last) {
                                            if (orientation == 0) {
                                                dimension = (float) widget.m2700();
                                            } else {
                                                dimension = (float) widget.m2632();
                                            }
                                            if (widget != firstVisibleWidget) {
                                                distance3 = distance2 + ((float) widget.f2088[offset].m2608());
                                            } else {
                                                distance3 = distance2;
                                            }
                                            widget.f2088[offset].m2616().m2765(firstNode.f2167, distance3);
                                            extraMargin = extraMargin2;
                                            widget.f2088[offset + 1].m2616().m2765(firstNode.f2167, distance3 + dimension);
                                            widget.f2088[offset].m2616().m2764(system);
                                            widget.f2088[offset + 1].m2616().m2764(system);
                                            distance2 = distance3 + ((float) widget.f2088[offset + 1].m2608()) + dimension;
                                            if (next4 != null) {
                                                if (next4.m2698() != 8) {
                                                    distance2 += gap;
                                                }
                                            }
                                        } else {
                                            extraMargin = extraMargin2;
                                        }
                                        widget = next4;
                                        extraMargin2 = extraMargin;
                                    } else {
                                        throw null;
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (widget2.m2667() != null) {
                                if (widget2.m2667().f2089[orientation] == C0548.EnumC0549.WRAP_CONTENT) {
                                    return false;
                                }
                            }
                            float distance7 = (distance + totalSize) - totalMargins;
                            C0548 widget4 = first;
                            float position = firstOffset;
                            while (widget4 != null) {
                                if (C0533.f1972 == null) {
                                    C0548 next5 = widget4.f2075[orientation];
                                    if (next5 != null || widget4 == last) {
                                        float dimension3 = distance7 / ((float) numMatchConstraints3);
                                        if (totalWeights2 > 0.0f) {
                                            numMatchConstraints = numMatchConstraints3;
                                            float[] fArr = widget4.f2086;
                                            if (fArr[orientation] == -1.0f) {
                                                dimension3 = 0.0f;
                                            } else {
                                                dimension3 = (fArr[orientation] * distance7) / totalWeights2;
                                            }
                                        } else {
                                            numMatchConstraints = numMatchConstraints3;
                                        }
                                        isChainSpread2 = isChainSpread;
                                        if (widget4.m2698() == 8) {
                                            dimension3 = 0.0f;
                                        }
                                        float position2 = position + ((float) widget4.f2088[offset].m2608());
                                        widget4.f2088[offset].m2616().m2765(firstNode.f2167, position2);
                                        totalWeights = totalWeights2;
                                        widget4.f2088[offset + 1].m2616().m2765(firstNode.f2167, position2 + dimension3);
                                        widget4.f2088[offset].m2616().m2764(system);
                                        widget4.f2088[offset + 1].m2616().m2764(system);
                                        position = position2 + dimension3 + ((float) widget4.f2088[offset + 1].m2608());
                                    } else {
                                        numMatchConstraints = numMatchConstraints3;
                                        isChainSpread2 = isChainSpread;
                                        totalWeights = totalWeights2;
                                    }
                                    widget4 = next5;
                                    numMatchConstraints3 = numMatchConstraints;
                                    isChainSpread = isChainSpread2;
                                    totalWeights2 = totalWeights;
                                } else {
                                    throw null;
                                }
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2751(C0548 widget, int orientation, int resolvedOffset) {
        int startOffset = orientation * 2;
        int endOffset = startOffset + 1;
        widget.f2088[startOffset].m2616().f2167 = widget.m2667().f2081.m2616();
        widget.f2088[startOffset].m2616().f2165 = (float) resolvedOffset;
        ((C0558) widget.f2088[startOffset].m2616()).f2174 = 1;
        widget.f2088[endOffset].m2616().f2167 = widget.f2088[startOffset].m2616();
        widget.f2088[endOffset].m2616().f2165 = (float) widget.m2660(orientation);
        ((C0558) widget.f2088[endOffset].m2616()).f2174 = 1;
    }
}
