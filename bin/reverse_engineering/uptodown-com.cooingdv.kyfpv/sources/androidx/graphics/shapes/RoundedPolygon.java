package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import p6.i;
import q6.m;
import r6.c;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class RoundedPolygon {
    public static final Companion Companion = new Companion(null);
    private final float centerX;
    private final float centerY;
    private final List<Cubic> cubics;
    private final List<Feature> features;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedPolygon(List<? extends Feature> list, float f, float f10) {
        ArrayList arrayListE0;
        ArrayList arrayListE02;
        Cubic cubic;
        List<Cubic> cubics;
        list.getClass();
        this.features = list;
        this.centerX = f;
        this.centerY = f10;
        c cVarT = a.a.t();
        int i = 0;
        Cubic cubic2 = null;
        if (list.size() <= 0 || ((Feature) list.get(0)).getCubics().size() != 3) {
            arrayListE0 = null;
            arrayListE02 = null;
        } else {
            i iVarSplit = ((Feature) list.get(0)).getCubics().get(1).split(0.5f);
            Cubic cubic3 = (Cubic) iVarSplit.f8442a;
            Cubic cubic4 = (Cubic) iVarSplit.f8443b;
            arrayListE02 = m.e0(((Feature) list.get(0)).getCubics().get(0), cubic3);
            arrayListE0 = m.e0(cubic4, ((Feature) list.get(0)).getCubics().get(2));
        }
        int size = list.size();
        if (size >= 0) {
            int i6 = 0;
            Cubic cubic5 = null;
            while (true) {
                if (i6 == 0 && arrayListE0 != null) {
                    cubics = arrayListE0;
                } else if (i6 != this.features.size()) {
                    cubics = this.features.get(i6).getCubics();
                } else if (arrayListE02 == null) {
                    break;
                } else {
                    cubics = arrayListE02;
                }
                int size2 = cubics.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    Cubic cubic6 = cubics.get(i10);
                    if (!cubic6.zeroLength$graphics_shapes_release()) {
                        if (cubic5 != null) {
                            cVarT.add(cubic5);
                        }
                        if (cubic2 == null) {
                            cubic2 = cubic6;
                            cubic5 = cubic2;
                        } else {
                            cubic5 = cubic6;
                        }
                    } else if (cubic5 != null) {
                        cubic5.getPoints$graphics_shapes_release()[6] = cubic6.getAnchor1X();
                        cubic5.getPoints$graphics_shapes_release()[7] = cubic6.getAnchor1Y();
                    }
                }
                if (i6 == size) {
                    break;
                } else {
                    i6++;
                }
            }
            cubic = cubic2;
            cubic2 = cubic5;
        } else {
            cubic = null;
        }
        if (cubic2 != null && cubic != null) {
            cVarT.add(CubicKt.Cubic(cubic2.getAnchor0X(), cubic2.getAnchor0Y(), cubic2.getControl0X(), cubic2.getControl0Y(), cubic2.getControl1X(), cubic2.getControl1Y(), cubic.getAnchor0X(), cubic.getAnchor0Y()));
        }
        c cVarM = a.a.m(cVarT);
        this.cubics = cVarM;
        Object obj = cVarM.get(cVarM.c() - 1);
        int iC = cVarM.c();
        while (i < iC) {
            Cubic cubic7 = this.cubics.get(i);
            Cubic cubic8 = (Cubic) obj;
            if (Math.abs(cubic7.getAnchor0X() - cubic8.getAnchor1X()) > 1.0E-4f || Math.abs(cubic7.getAnchor0Y() - cubic8.getAnchor1Y()) > 1.0E-4f) {
                com.google.gson.internal.a.p("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i++;
            obj = cubic7;
        }
    }

    public static /* synthetic */ float[] calculateBounds$default(RoundedPolygon roundedPolygon, float[] fArr, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        if ((i & 2) != 0) {
            z9 = true;
        }
        return roundedPolygon.calculateBounds(fArr, z9);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(RoundedPolygon roundedPolygon, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        return roundedPolygon.calculateMaxBounds(fArr);
    }

    public final float[] calculateBounds(float[] fArr, boolean z9) {
        fArr.getClass();
        if (fArr.length < 4) {
            com.google.gson.internal.a.p("Required bounds size of 4");
            return null;
        }
        int size = this.cubics.size();
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            this.cubics.get(i).calculateBounds$graphics_shapes_release(fArr, z9);
            fMin = Math.min(fMin, fArr[0]);
            fMin2 = Math.min(fMin2, fArr[1]);
            fMax = Math.max(fMax, fArr[2]);
            fMax2 = Math.max(fMax2, fArr[3]);
        }
        fArr[0] = fMin;
        fArr[1] = fMin2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
        return fArr;
    }

    public final float[] calculateMaxBounds(float[] fArr) {
        fArr.getClass();
        if (fArr.length < 4) {
            com.google.gson.internal.a.p("Required bounds size of 4");
            return null;
        }
        int size = this.cubics.size();
        float fMax = 0.0f;
        for (int i = 0; i < size; i++) {
            Cubic cubic = this.cubics.get(i);
            float fDistanceSquared = Utils.distanceSquared(cubic.getAnchor0X() - this.centerX, cubic.getAnchor0Y() - this.centerY);
            long jM47pointOnCurveOOQOV4g$graphics_shapes_release = cubic.m47pointOnCurveOOQOV4g$graphics_shapes_release(0.5f);
            fMax = Math.max(fMax, Math.max(fDistanceSquared, Utils.distanceSquared(PointKt.m59getXDnnuFBc(jM47pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerX, PointKt.m60getYDnnuFBc(jM47pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerY)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        float f = this.centerX;
        fArr[0] = f - fSqrt;
        float f10 = this.centerY;
        fArr[1] = f10 - fSqrt;
        fArr[2] = f + fSqrt;
        fArr[3] = f10 + fSqrt;
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedPolygon) {
            return l.a(this.features, ((RoundedPolygon) obj).features);
        }
        return false;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public final List<Feature> getFeatures$graphics_shapes_release() {
        return this.features;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public final RoundedPolygon normalized() {
        float[] fArrCalculateBounds$default = calculateBounds$default(this, null, false, 3, null);
        float f = fArrCalculateBounds$default[2] - fArrCalculateBounds$default[0];
        float f10 = fArrCalculateBounds$default[3] - fArrCalculateBounds$default[1];
        final float fMax = Math.max(f, f10);
        float f11 = 2;
        final float f12 = ((fMax - f) / f11) - fArrCalculateBounds$default[0];
        final float f13 = ((fMax - f10) / f11) - fArrCalculateBounds$default[1];
        return transformed(new PointTransformer() { // from class: androidx.graphics.shapes.RoundedPolygon.normalized.1
            @Override // androidx.graphics.shapes.PointTransformer
            /* JADX INFO: renamed from: transform-XgqJiTY */
            public final long mo68transformXgqJiTY(float f14, float f15) {
                float f16 = f14 + f12;
                float f17 = fMax;
                return FloatFloatPair.m9constructorimpl(f16 / f17, (f15 + f13) / f17);
            }
        });
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + q6.l.x0(this.cubics, null, null, null, null, 63) + " || Features = " + q6.l.x0(this.features, null, null, null, null, 63) + " || Center = (" + this.centerX + ", " + this.centerY + ")]";
    }

    public final RoundedPolygon transformed(PointTransformer pointTransformer) {
        pointTransformer.getClass();
        long jM66transformedso9K2fw = PointKt.m66transformedso9K2fw(FloatFloatPair.m9constructorimpl(this.centerX, this.centerY), pointTransformer);
        c cVarT = a.a.t();
        int size = this.features.size();
        for (int i = 0; i < size; i++) {
            cVarT.add(this.features.get(i).transformed$graphics_shapes_release(pointTransformer));
        }
        return new RoundedPolygon(a.a.m(cVarT), PointKt.m59getXDnnuFBc(jM66transformedso9K2fw), PointKt.m60getYDnnuFBc(jM66transformedso9K2fw));
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public final float[] calculateBounds(float[] fArr) {
        fArr.getClass();
        return calculateBounds$default(this, fArr, false, 2, null);
    }

    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }
}
