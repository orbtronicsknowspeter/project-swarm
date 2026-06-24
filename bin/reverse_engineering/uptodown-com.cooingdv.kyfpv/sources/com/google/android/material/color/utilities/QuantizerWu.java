package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Box {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        int f2974b0;
        int b1;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f2975g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        int f2976g1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f2977r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        int f2978r1;
        int vol;

        private Box() {
            this.f2977r0 = 0;
            this.f2978r1 = 0;
            this.f2975g0 = 0;
            this.f2976g1 = 0;
            this.f2974b0 = 0;
            this.b1 = 0;
            this.vol = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i, int i6) {
            this.resultCount = i6;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i, double d10) {
            this.cutLocation = i;
            this.maximum = d10;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i;
        int i6;
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            i = (-iArr[getIndex(box.f2977r0, box.f2976g1, box.b1)]) + iArr[getIndex(box.f2977r0, box.f2976g1, box.f2974b0)] + iArr[getIndex(box.f2977r0, box.f2975g0, box.b1)];
            i6 = iArr[getIndex(box.f2977r0, box.f2975g0, box.f2974b0)];
        } else if (iOrdinal == 1) {
            i = (-iArr[getIndex(box.f2978r1, box.f2975g0, box.b1)]) + iArr[getIndex(box.f2978r1, box.f2975g0, box.f2974b0)] + iArr[getIndex(box.f2977r0, box.f2975g0, box.b1)];
            i6 = iArr[getIndex(box.f2977r0, box.f2975g0, box.f2974b0)];
        } else {
            if (iOrdinal != 2) {
                c2.a.h(direction, "unexpected direction ");
                return 0;
            }
            i = (-iArr[getIndex(box.f2978r1, box.f2976g1, box.f2974b0)]) + iArr[getIndex(box.f2978r1, box.f2975g0, box.f2974b0)] + iArr[getIndex(box.f2977r0, box.f2976g1, box.f2974b0)];
            i6 = iArr[getIndex(box.f2977r0, box.f2975g0, box.f2974b0)];
        }
        return i - i6;
    }

    public static int getIndex(int i, int i6, int i10) {
        return (i << 10) + (i << 6) + i + (i6 << 5) + i6 + i10;
    }

    public static int top(Box box, Direction direction, int i, int[] iArr) {
        int i6;
        int i10;
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            i6 = (iArr[getIndex(i, box.f2976g1, box.b1)] - iArr[getIndex(i, box.f2976g1, box.f2974b0)]) - iArr[getIndex(i, box.f2975g0, box.b1)];
            i10 = iArr[getIndex(i, box.f2975g0, box.f2974b0)];
        } else if (iOrdinal == 1) {
            i6 = (iArr[getIndex(box.f2978r1, i, box.b1)] - iArr[getIndex(box.f2978r1, i, box.f2974b0)]) - iArr[getIndex(box.f2977r0, i, box.b1)];
            i10 = iArr[getIndex(box.f2977r0, i, box.f2974b0)];
        } else {
            if (iOrdinal != 2) {
                c2.a.h(direction, "unexpected direction ");
                return 0;
            }
            i6 = (iArr[getIndex(box.f2978r1, box.f2976g1, i)] - iArr[getIndex(box.f2978r1, box.f2975g0, i)]) - iArr[getIndex(box.f2977r0, box.f2976g1, i)];
            i10 = iArr[getIndex(box.f2977r0, box.f2975g0, i)];
        }
        return i6 + i10;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f2978r1, box.f2976g1, box.b1)] - iArr[getIndex(box.f2978r1, box.f2976g1, box.f2974b0)]) - iArr[getIndex(box.f2978r1, box.f2975g0, box.b1)]) + iArr[getIndex(box.f2978r1, box.f2975g0, box.f2974b0)]) - iArr[getIndex(box.f2977r0, box.f2976g1, box.b1)]) + iArr[getIndex(box.f2977r0, box.f2976g1, box.f2974b0)]) + iArr[getIndex(box.f2977r0, box.f2975g0, box.b1)]) - iArr[getIndex(box.f2977r0, box.f2975g0, box.f2974b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (iRedFromArgb * iIntValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (iGreenFromArgb * iIntValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (iBlueFromArgb * iIntValue2) + iArr4[index];
            double[] dArr = this.moments;
            int i = iBlueFromArgb * iBlueFromArgb;
            dArr[index] = dArr[index] + ((double) ((i + (iGreenFromArgb * iGreenFromArgb) + (iRedFromArgb * iRedFromArgb)) * iIntValue2));
        }
    }

    public CreateBoxesResult createBoxes(int i) {
        int i6;
        this.cubes = new Box[i];
        for (int i10 = 0; i10 < i; i10++) {
            this.cubes[i10] = new Box();
        }
        double[] dArr = new double[i];
        Box box = this.cubes[0];
        box.f2978r1 = 32;
        box.f2976g1 = 32;
        box.b1 = 32;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            if (i12 >= i) {
                i6 = i;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i11], boxArr[i12]).booleanValue()) {
                Box box2 = this.cubes[i11];
                dArr[i11] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i12];
                dArr[i12] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i11] = 0.0d;
                i12--;
            }
            double d10 = dArr[0];
            int i13 = 0;
            for (int i14 = 1; i14 <= i12; i14++) {
                double d11 = dArr[i14];
                if (d11 > d10) {
                    i13 = i14;
                    d10 = d11;
                }
            }
            if (d10 <= 0.0d) {
                i6 = i12 + 1;
                break;
            }
            i12++;
            i11 = i13;
        }
        return new CreateBoxesResult(i, i6);
    }

    public void createMoments() {
        int i = 1;
        while (true) {
            int i6 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i10 = 1;
            while (i10 < i6) {
                int i11 = 0;
                int i12 = 0;
                double d10 = 0.0d;
                int i13 = 1;
                int i14 = 0;
                int i15 = 0;
                while (i13 < i6) {
                    int index = getIndex(i, i10, i13);
                    i11 += this.weights[index];
                    i14 += this.momentsR[index];
                    i15 += this.momentsG[index];
                    i12 += this.momentsB[index];
                    d10 += this.moments[index];
                    iArr[i13] = iArr[i13] + i11;
                    iArr2[i13] = iArr2[i13] + i14;
                    iArr3[i13] = iArr3[i13] + i15;
                    iArr4[i13] = iArr4[i13] + i12;
                    dArr[i13] = dArr[i13] + d10;
                    int index2 = getIndex(i - 1, i10, i13);
                    int i16 = i13;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i16];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i16];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i16];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i16];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i16];
                    i13 = i16 + 1;
                    i6 = 33;
                }
                i10++;
                i6 = 33;
            }
            i++;
        }
    }

    public List<Integer> createResult(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < i; i6++) {
            Box box = this.cubes[i6];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f2977r0 + 1, box.f2978r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f2975g0 + 1, box.f2976g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f2974b0 + 1, box.b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d10 = maximizeResultMaximize.maximum;
        double d11 = maximizeResultMaximize2.maximum;
        double d12 = maximizeResultMaximize3.maximum;
        if (d10 < d11 || d10 < d12) {
            if (d11 >= d10 && d11 >= d12) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f2978r1 = box.f2978r1;
        box2.f2976g1 = box.f2976g1;
        box2.b1 = box.b1;
        int iOrdinal = direction3.ordinal();
        if (iOrdinal == 0) {
            int i = maximizeResultMaximize.cutLocation;
            box.f2978r1 = i;
            box2.f2977r0 = i;
            box2.f2975g0 = box.f2975g0;
            box2.f2974b0 = box.f2974b0;
        } else if (iOrdinal == 1) {
            int i6 = maximizeResultMaximize2.cutLocation;
            box.f2976g1 = i6;
            box2.f2977r0 = box.f2977r0;
            box2.f2975g0 = i6;
            box2.f2974b0 = box.f2974b0;
        } else if (iOrdinal == 2) {
            int i10 = maximizeResultMaximize3.cutLocation;
            box.b1 = i10;
            box2.f2977r0 = box.f2977r0;
            box2.f2975g0 = box.f2975g0;
            box2.f2974b0 = i10;
        }
        box.vol = (box.b1 - box.f2974b0) * (box.f2976g1 - box.f2975g0) * (box.f2978r1 - box.f2977r0);
        box2.vol = (box2.b1 - box2.f2974b0) * (box2.f2976g1 - box2.f2975g0) * (box2.f2978r1 - box2.f2977r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i, int i6, int i10, int i11, int i12, int i13) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i14 = -1;
        double d10 = 0.0d;
        int i15 = i;
        while (i15 < i6) {
            int pVar = top(box2, direction, i15, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i15, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i15, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i15, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d11 = ((double) ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar)))) / ((double) pVar4);
                int i16 = i10 - pVar;
                int i17 = i11 - pVar2;
                int i18 = i12 - pVar3;
                int i19 = i13 - pVar4;
                if (i19 != 0) {
                    double d12 = (((double) ((i18 * i18) + ((i17 * i17) + (i16 * i16)))) / ((double) i19)) + d11;
                    if (d12 > d10) {
                        i14 = i15;
                        d10 = d12;
                    }
                }
            }
            i15++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i14, d10);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int i = iVolume3 * iVolume3;
        return (((((((this.moments[getIndex(box.f2978r1, box.f2976g1, box.b1)] - this.moments[getIndex(box.f2978r1, box.f2976g1, box.f2974b0)]) - this.moments[getIndex(box.f2978r1, box.f2975g0, box.b1)]) + this.moments[getIndex(box.f2978r1, box.f2975g0, box.f2974b0)]) - this.moments[getIndex(box.f2977r0, box.f2976g1, box.b1)]) + this.moments[getIndex(box.f2977r0, box.f2976g1, box.f2974b0)]) + this.moments[getIndex(box.f2977r0, box.f2975g0, box.b1)]) - this.moments[getIndex(box.f2977r0, box.f2975g0, box.f2974b0)]) - (((double) (i + ((iVolume2 * iVolume2) + (iVolume * iVolume)))) / ((double) volume(box, this.weights)));
    }
}
