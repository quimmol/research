package ♫;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ♫.C0129;

/* renamed from: ♫.ᒾ  reason: contains not printable characters */
public class C0209 {
    /* renamed from: θ  reason: contains not printable characters */
    public static Animator m945(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, id);
        }
        return m946(context, context.getResources(), context.getTheme(), id);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Animator m946(Context context, Resources resources, Resources.Theme theme, int id) {
        return m947(context, resources, theme, id, 1.0f);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Animator m947(Context context, Resources resources, Resources.Theme theme, int id, float pathErrorScale) {
        XmlResourceParser parser = null;
        try {
            parser = resources.getAnimation(id);
            Animator animator = m948(context, resources, theme, parser, pathErrorScale);
            parser.close();
            return animator;
        } catch (XmlPullParserException ex) {
            Resources.NotFoundException rnf = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
            rnf.initCause(ex);
            throw rnf;
        } catch (IOException ex2) {
            Resources.NotFoundException rnf2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
            rnf2.initCause(ex2);
            throw rnf2;
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    /* renamed from: ♫.ᒾ$θ  reason: contains not printable characters */
    public static class C0210 implements TypeEvaluator<C0129.C0130[]> {

        /* renamed from: θ  reason: contains not printable characters */
        public C0129.C0130[] f832;

        /* renamed from: θ  reason: contains not printable characters */
        public C0129.C0130[] evaluate(float fraction, C0129.C0130[] startPathData, C0129.C0130[] endPathData) {
            if (C0129.m648(startPathData, endPathData)) {
                C0129.C0130[] r0 = this.f832;
                if (r0 == null || !C0129.m648(r0, startPathData)) {
                    this.f832 = C0129.m652(startPathData);
                }
                for (int i = 0; i < startPathData.length; i++) {
                    this.f832[i].m657(startPathData[i], endPathData[i], fraction);
                }
                return this.f832;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PropertyValuesHolder m954(TypedArray styledAttributes, int valueType, int valueFromId, int valueToId, String propertyName) {
        int valueType2;
        PropertyValuesHolder returnValue;
        int valueTo;
        char c;
        int valueFrom;
        int valueTo2;
        char c2;
        float valueTo3;
        float valueFrom2;
        float valueTo4;
        int toType;
        PropertyValuesHolder propertyValuesHolder;
        TypedValue tvFrom = styledAttributes.peekValue(valueFromId);
        boolean hasFrom = tvFrom != null;
        int fromType = hasFrom ? tvFrom.type : 0;
        TypedValue tvTo = styledAttributes.peekValue(valueToId);
        boolean hasTo = tvTo != null;
        int toType2 = hasTo ? tvTo.type : 0;
        if (valueType != 4) {
            valueType2 = valueType;
        } else if ((!hasFrom || !m960(fromType)) && (!hasTo || !m960(toType2))) {
            valueType2 = 0;
        } else {
            valueType2 = 3;
        }
        boolean getFloats = valueType2 == 0;
        if (valueType2 == 2) {
            String fromString = styledAttributes.getString(valueFromId);
            String toString = styledAttributes.getString(valueToId);
            C0129.C0130[] nodesFrom = C0129.m651(fromString);
            C0129.C0130[] nodesTo = C0129.m651(toString);
            if (nodesFrom == null && nodesTo == null) {
                toType = toType2;
                propertyValuesHolder = null;
            } else if (nodesFrom != null) {
                TypeEvaluator evaluator = new C0210();
                if (nodesTo == null) {
                    toType = toType2;
                    returnValue = PropertyValuesHolder.ofObject(propertyName, evaluator, nodesFrom);
                } else if (C0129.m648(nodesFrom, nodesTo)) {
                    returnValue = PropertyValuesHolder.ofObject(propertyName, evaluator, nodesFrom, nodesTo);
                    toType = toType2;
                } else {
                    throw new InflateException(" Can't morph from " + fromString + " to " + toString);
                }
            } else {
                toType = toType2;
                propertyValuesHolder = null;
                if (nodesTo != null) {
                    returnValue = PropertyValuesHolder.ofObject(propertyName, new C0210(), nodesTo);
                }
            }
            returnValue = propertyValuesHolder;
        } else {
            TypeEvaluator evaluator2 = null;
            if (valueType2 == 3) {
                evaluator2 = C0211.m963();
            }
            if (getFloats) {
                if (hasFrom) {
                    if (fromType == 5) {
                        valueFrom2 = styledAttributes.getDimension(valueFromId, 0.0f);
                    } else {
                        valueFrom2 = styledAttributes.getFloat(valueFromId, 0.0f);
                    }
                    if (hasTo) {
                        if (toType2 == 5) {
                            valueTo4 = styledAttributes.getDimension(valueToId, 0.0f);
                        } else {
                            valueTo4 = styledAttributes.getFloat(valueToId, 0.0f);
                        }
                        returnValue = PropertyValuesHolder.ofFloat(propertyName, valueFrom2, valueTo4);
                    } else {
                        returnValue = PropertyValuesHolder.ofFloat(propertyName, valueFrom2);
                    }
                } else {
                    if (toType2 == 5) {
                        valueTo3 = styledAttributes.getDimension(valueToId, 0.0f);
                    } else {
                        valueTo3 = styledAttributes.getFloat(valueToId, 0.0f);
                    }
                    returnValue = PropertyValuesHolder.ofFloat(propertyName, valueTo3);
                }
            } else if (hasFrom) {
                if (fromType == 5) {
                    valueFrom = (int) styledAttributes.getDimension(valueFromId, 0.0f);
                } else if (m960(fromType)) {
                    valueFrom = styledAttributes.getColor(valueFromId, 0);
                } else {
                    valueFrom = styledAttributes.getInt(valueFromId, 0);
                }
                if (hasTo) {
                    if (toType2 == 5) {
                        valueTo2 = (int) styledAttributes.getDimension(valueToId, 0.0f);
                        c2 = 0;
                    } else if (m960(toType2)) {
                        c2 = 0;
                        valueTo2 = styledAttributes.getColor(valueToId, 0);
                    } else {
                        c2 = 0;
                        valueTo2 = styledAttributes.getInt(valueToId, 0);
                    }
                    int[] iArr = new int[2];
                    iArr[c2] = valueFrom;
                    iArr[1] = valueTo2;
                    returnValue = PropertyValuesHolder.ofInt(propertyName, iArr);
                } else {
                    returnValue = PropertyValuesHolder.ofInt(propertyName, valueFrom);
                }
            } else if (hasTo) {
                if (toType2 == 5) {
                    valueTo = (int) styledAttributes.getDimension(valueToId, 0.0f);
                    c = 0;
                } else if (m960(toType2)) {
                    c = 0;
                    valueTo = styledAttributes.getColor(valueToId, 0);
                } else {
                    c = 0;
                    valueTo = styledAttributes.getInt(valueToId, 0);
                }
                int[] iArr2 = new int[1];
                iArr2[c] = valueTo;
                returnValue = PropertyValuesHolder.ofInt(propertyName, iArr2);
            } else {
                returnValue = null;
            }
            if (!(returnValue == null || evaluator2 == null)) {
                returnValue.setEvaluator(evaluator2);
            }
        }
        return returnValue;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m957(ValueAnimator anim, TypedArray arrayAnimator, TypedArray arrayObjectAnimator, float pixelSize, XmlPullParser parser) {
        long duration = (long) C0124.m621(arrayAnimator, parser, "duration", 1, 300);
        long startDelay = (long) C0124.m621(arrayAnimator, parser, "startOffset", 2, 0);
        int valueType = C0124.m621(arrayAnimator, parser, "valueType", 7, 4);
        if (C0124.m629(parser, "valueFrom") && C0124.m629(parser, "valueTo")) {
            if (valueType == 4) {
                valueType = m944(arrayAnimator, 5, 6);
            }
            PropertyValuesHolder pvh = m954(arrayAnimator, valueType, 5, 6, "");
            if (pvh != null) {
                anim.setValues(pvh);
            }
        }
        anim.setDuration(duration);
        anim.setStartDelay(startDelay);
        anim.setRepeatCount(C0124.m621(arrayAnimator, parser, "repeatCount", 3, 0));
        anim.setRepeatMode(C0124.m621(arrayAnimator, parser, "repeatMode", 4, 1));
        if (arrayObjectAnimator != null) {
            m956(anim, arrayObjectAnimator, valueType, pixelSize, parser);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m956(ValueAnimator anim, TypedArray arrayObjectAnimator, int valueType, float pixelSize, XmlPullParser parser) {
        ObjectAnimator oa = (ObjectAnimator) anim;
        String pathData = C0124.m626(arrayObjectAnimator, parser, "pathData", 1);
        if (pathData != null) {
            String propertyXName = C0124.m626(arrayObjectAnimator, parser, "propertyXName", 2);
            String propertyYName = C0124.m626(arrayObjectAnimator, parser, "propertyYName", 3);
            if (valueType == 2 || valueType == 4) {
            }
            if (propertyXName == null && propertyYName == null) {
                throw new InflateException(arrayObjectAnimator.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m958(C0129.m644(pathData), oa, 0.5f * pixelSize, propertyXName, propertyYName);
            return;
        }
        oa.setPropertyName(C0124.m626(arrayObjectAnimator, parser, "propertyName", 0));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m958(Path path, ObjectAnimator oa, float precision, String propertyXName, String propertyYName) {
        Path path2 = path;
        boolean z = false;
        PathMeasure measureForTotalLength = new PathMeasure(path2, false);
        float totalLength = 0.0f;
        ArrayList<Float> contourLengths = new ArrayList<>();
        contourLengths.add(Float.valueOf(0.0f));
        while (true) {
            totalLength += measureForTotalLength.getLength();
            contourLengths.add(Float.valueOf(totalLength));
            if (!measureForTotalLength.nextContour()) {
                break;
            }
            z = false;
            path2 = path;
        }
        PathMeasure pathMeasure = new PathMeasure(path2, z);
        int numPoints = Math.min(100, ((int) (totalLength / precision)) + 1);
        float[] mX = new float[numPoints];
        float[] mY = new float[numPoints];
        float[] position = new float[2];
        float step = totalLength / ((float) (numPoints - 1));
        float currentDistance = 0.0f;
        int contourIndex = 0;
        for (int i = 0; i < numPoints; i++) {
            pathMeasure.getPosTan(currentDistance - contourLengths.get(contourIndex).floatValue(), position, null);
            mX[i] = position[0];
            mY[i] = position[1];
            currentDistance += step;
            if (contourIndex + 1 < contourLengths.size() && currentDistance > contourLengths.get(contourIndex + 1).floatValue()) {
                contourIndex++;
                pathMeasure.nextContour();
            }
        }
        PropertyValuesHolder x = null;
        PropertyValuesHolder y = null;
        if (propertyXName != null) {
            x = PropertyValuesHolder.ofFloat(propertyXName, mX);
        }
        if (propertyYName != null) {
            y = PropertyValuesHolder.ofFloat(propertyYName, mY);
        }
        if (x == null) {
            oa.setValues(y);
        } else if (y == null) {
            oa.setValues(x);
        } else {
            oa.setValues(x, y);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Animator m948(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, float pixelSize) {
        return m949(context, res, theme, parser, Xml.asAttributeSet(parser), null, 0, pixelSize);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: θ  reason: contains not printable characters */
    public static Animator m949(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, AttributeSet attrs, AnimatorSet parent, int sequenceOrdering, float pixelSize) {
        int depth = parser.getDepth();
        Animator anim = null;
        ArrayList<Animator> childAnims = null;
        while (true) {
            int type = parser.next();
            if (type != 3 || parser.getDepth() > depth) {
                if (type == 1) {
                    break;
                } else if (type == 2) {
                    String name = parser.getName();
                    boolean gotValues = false;
                    if (name.equals("objectAnimator")) {
                        anim = m952(context, res, theme, attrs, pixelSize, parser);
                    } else if (name.equals("animator")) {
                        anim = m955(context, res, theme, attrs, null, pixelSize, parser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        TypedArray a = C0124.m624(res, theme, attrs, C0172.f779);
                        m949(context, res, theme, parser, attrs, animatorSet, C0124.m621(a, parser, "ordering", 0, 0), pixelSize);
                        a.recycle();
                        anim = animatorSet;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] values = m961(context, res, theme, parser, Xml.asAttributeSet(parser));
                        if (!(values == null || anim == null || !(anim instanceof ValueAnimator))) {
                            ((ValueAnimator) anim).setValues(values);
                        }
                        gotValues = true;
                        anim = anim;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + parser.getName());
                    }
                    if (parent != null && !gotValues) {
                        if (childAnims == null) {
                            childAnims = new ArrayList<>();
                        }
                        childAnims.add(anim);
                    }
                }
            } else {
                break;
            }
        }
        if (!(parent == null || childAnims == null)) {
            Animator[] animsArray = new Animator[childAnims.size()];
            int index = 0;
            Iterator<Animator> it = childAnims.iterator();
            while (it.hasNext()) {
                animsArray[index] = it.next();
                index++;
            }
            if (sequenceOrdering == 0) {
                parent.playTogether(animsArray);
            } else {
                parent.playSequentially(animsArray);
            }
        }
        return anim;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PropertyValuesHolder[] m961(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, AttributeSet attrs) {
        ArrayList<PropertyValuesHolder> values = null;
        while (true) {
            int type = parser.getEventType();
            if (type == 3 || type == 1) {
                PropertyValuesHolder[] valuesArray = null;
            } else if (type != 2) {
                parser.next();
            } else {
                if (parser.getName().equals("propertyValuesHolder")) {
                    TypedArray a = C0124.m624(res, theme, attrs, C0172.f781);
                    String propertyName = C0124.m626(a, parser, "propertyName", 3);
                    int valueType = C0124.m621(a, parser, "valueType", 2, 4);
                    PropertyValuesHolder pvh = m953(context, res, theme, parser, propertyName, valueType);
                    if (pvh == null) {
                        pvh = m954(a, valueType, 0, 1, propertyName);
                    }
                    if (pvh != null) {
                        if (values == null) {
                            values = new ArrayList<>();
                        }
                        values.add(pvh);
                    }
                    a.recycle();
                }
                parser.next();
            }
        }
        PropertyValuesHolder[] valuesArray2 = null;
        if (values != null) {
            int count = values.size();
            valuesArray2 = new PropertyValuesHolder[count];
            for (int i = 0; i < count; i++) {
                valuesArray2[i] = values.get(i);
            }
        }
        return valuesArray2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m943(Resources res, Resources.Theme theme, AttributeSet attrs, XmlPullParser parser) {
        int valueType;
        TypedArray a = C0124.m624(res, theme, attrs, C0172.f782);
        boolean hasValue = false;
        TypedValue keyframeValue = C0124.m625(a, parser, "value", 0);
        if (keyframeValue != null) {
            hasValue = true;
        }
        if (!hasValue || !m960(keyframeValue.type)) {
            valueType = 0;
        } else {
            valueType = 3;
        }
        a.recycle();
        return valueType;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m944(TypedArray styledAttributes, int valueFromId, int valueToId) {
        TypedValue tvFrom = styledAttributes.peekValue(valueFromId);
        boolean hasTo = true;
        int toType = 0;
        boolean hasFrom = tvFrom != null;
        int fromType = hasFrom ? tvFrom.type : 0;
        TypedValue tvTo = styledAttributes.peekValue(valueToId);
        if (tvTo == null) {
            hasTo = false;
        }
        if (hasTo) {
            toType = tvTo.type;
        }
        if ((!hasFrom || !m960(fromType)) && (!hasTo || !m960(toType))) {
            return 0;
        }
        return 3;
    }

    /* JADX INFO: Multiple debug info for r18v6 'type'  int: [D('endIndex' int), D('type' int)] */
    /* renamed from: θ  reason: contains not printable characters */
    public static PropertyValuesHolder m953(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, String propertyName, int valueType) {
        int type;
        PropertyValuesHolder value;
        PropertyValuesHolder value2;
        int type2;
        ArrayList<Keyframe> keyframes;
        PropertyValuesHolder value3 = null;
        ArrayList<Keyframe> keyframes2 = null;
        int valueType2 = valueType;
        while (true) {
            int next = parser.next();
            type = next;
            if (next != 3 && type != 1) {
                if (parser.getName().equals("keyframe")) {
                    if (valueType2 == 4) {
                        valueType2 = m943(res, theme, Xml.asAttributeSet(parser), parser);
                    }
                    Keyframe keyframe = m951(context, res, theme, Xml.asAttributeSet(parser), valueType2, parser);
                    if (keyframe != null) {
                        if (keyframes2 == null) {
                            keyframes2 = new ArrayList<>();
                        }
                        keyframes2.add(keyframe);
                    }
                    parser.next();
                }
            }
        }
        if (keyframes2 != null) {
            int size = keyframes2.size();
            int count = size;
            if (size > 0) {
                Keyframe firstKeyframe = keyframes2.get(0);
                Keyframe lastKeyframe = keyframes2.get(count - 1);
                float endFraction = lastKeyframe.getFraction();
                float f = 0.0f;
                if (endFraction < 1.0f) {
                    if (endFraction < 0.0f) {
                        lastKeyframe.setFraction(1.0f);
                    } else {
                        keyframes2.add(keyframes2.size(), m950(lastKeyframe, 1.0f));
                        count++;
                    }
                }
                float startFraction = firstKeyframe.getFraction();
                if (startFraction != 0.0f) {
                    if (startFraction < 0.0f) {
                        firstKeyframe.setFraction(0.0f);
                    } else {
                        keyframes2.add(0, m950(firstKeyframe, 0.0f));
                        count++;
                    }
                }
                Keyframe[] keyframeArray = new Keyframe[count];
                keyframes2.toArray(keyframeArray);
                int i = 0;
                while (i < count) {
                    Keyframe keyframe2 = keyframeArray[i];
                    if (keyframe2.getFraction() >= f) {
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == 0) {
                        keyframe2.setFraction(f);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == count - 1) {
                        keyframe2.setFraction(1.0f);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else {
                        value2 = value3;
                        int j = i + 1;
                        keyframes = keyframes2;
                        int endIndex = i;
                        while (true) {
                            type2 = type;
                            if (j >= count - 1) {
                                break;
                            } else if (keyframeArray[j].getFraction() >= 0.0f) {
                                break;
                            } else {
                                endIndex = j;
                                j++;
                                type = type2;
                            }
                        }
                        m959(keyframeArray, keyframeArray[endIndex + 1].getFraction() - keyframeArray[i - 1].getFraction(), i, endIndex);
                    }
                    i++;
                    keyframes2 = keyframes;
                    type = type2;
                    value3 = value2;
                    f = 0.0f;
                }
                PropertyValuesHolder value4 = PropertyValuesHolder.ofKeyframe(propertyName, keyframeArray);
                if (valueType2 != 3) {
                    return value4;
                }
                value4.setEvaluator(C0211.m963());
                return value4;
            }
            value = null;
        } else {
            value = null;
        }
        return value;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Keyframe m950(Keyframe sampleKeyframe, float fraction) {
        if (sampleKeyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(fraction);
        }
        if (sampleKeyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(fraction);
        }
        return Keyframe.ofObject(fraction);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m959(Keyframe[] keyframes, float gap, int startIndex, int endIndex) {
        float increment = gap / ((float) ((endIndex - startIndex) + 2));
        for (int i = startIndex; i <= endIndex; i++) {
            keyframes[i].setFraction(keyframes[i - 1].getFraction() + increment);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Keyframe m951(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, int valueType, XmlPullParser parser) {
        Keyframe keyframe;
        TypedArray a = C0124.m624(res, theme, attrs, C0172.f782);
        Keyframe keyframe2 = null;
        float fraction = C0124.m622(a, parser, "fraction", 3, -1.0f);
        TypedValue keyframeValue = C0124.m625(a, parser, "value", 0);
        boolean hasValue = keyframeValue != null;
        if (valueType == 4) {
            if (!hasValue || !m960(keyframeValue.type)) {
                valueType = 0;
            } else {
                valueType = 3;
            }
        }
        if (!hasValue) {
            if (valueType == 0) {
                keyframe = Keyframe.ofFloat(fraction);
            } else {
                keyframe = Keyframe.ofInt(fraction);
            }
            keyframe2 = keyframe;
        } else if (valueType == 0) {
            keyframe2 = Keyframe.ofFloat(fraction, C0124.m622(a, parser, "value", 0, 0.0f));
        } else if (valueType == 1 || valueType == 3) {
            keyframe2 = Keyframe.ofInt(fraction, C0124.m621(a, parser, "value", 0, 0));
        }
        int resID = C0124.m620(a, parser, "interpolator", 1, 0);
        if (resID > 0) {
            keyframe2.setInterpolator(C0204.m938(context, resID));
        }
        a.recycle();
        return keyframe2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ObjectAnimator m952(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, float pathErrorScale, XmlPullParser parser) {
        ObjectAnimator anim = new ObjectAnimator();
        m955(context, res, theme, attrs, anim, pathErrorScale, parser);
        return anim;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ValueAnimator m955(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, ValueAnimator anim, float pathErrorScale, XmlPullParser parser) {
        TypedArray arrayAnimator = C0124.m624(res, theme, attrs, C0172.f784);
        TypedArray arrayObjectAnimator = C0124.m624(res, theme, attrs, C0172.f783);
        if (anim == null) {
            anim = new ValueAnimator();
        }
        m957(anim, arrayAnimator, arrayObjectAnimator, pathErrorScale, parser);
        int resID = C0124.m620(arrayAnimator, parser, "interpolator", 0, 0);
        if (resID > 0) {
            anim.setInterpolator(C0204.m938(context, resID));
        }
        arrayAnimator.recycle();
        if (arrayObjectAnimator != null) {
            arrayObjectAnimator.recycle();
        }
        return anim;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m960(int type) {
        return type >= 28 && type <= 31;
    }
}
