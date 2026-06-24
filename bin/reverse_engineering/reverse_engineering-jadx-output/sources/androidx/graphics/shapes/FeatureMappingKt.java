package androidx.graphics.shapes;

import androidx.graphics.shapes.Feature;
import i7.c;
import i7.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p6.i;
import q6.l;
import q6.m;
import q6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class FeatureMappingKt {
    private static final String LOG_TAG = "FeatureMapping";

    public static final List<ProgressableFeature> doMapping(List<ProgressableFeature> list, List<ProgressableFeature> list2) {
        list.getClass();
        list2.getClass();
        Iterator it = new d(0, list2.size() - 1, 1).iterator();
        c cVar = (c) it;
        if (!cVar.f5700l) {
            com.google.gson.internal.a.l();
            return null;
        }
        x xVar = (x) it;
        int iNextInt = xVar.nextInt();
        if (cVar.f5700l) {
            float fFeatureDistSquared = featureDistSquared(list.get(0).getFeature(), list2.get(iNextInt).getFeature());
            do {
                int iNextInt2 = xVar.nextInt();
                float fFeatureDistSquared2 = featureDistSquared(list.get(0).getFeature(), list2.get(iNextInt2).getFeature());
                if (Float.compare(fFeatureDistSquared, fFeatureDistSquared2) > 0) {
                    iNextInt = iNextInt2;
                    fFeatureDistSquared = fFeatureDistSquared2;
                }
            } while (cVar.f5700l);
        }
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayListE0 = m.e0(list2.get(iNextInt));
        int i = iNextInt;
        for (int i6 = 1; i6 < size; i6++) {
            int i10 = iNextInt - (size - i6);
            if (i10 <= i) {
                i10 += size2;
            }
            Iterator it2 = new d(i + 1, i10, 1).iterator();
            c cVar2 = (c) it2;
            if (!cVar2.f5700l) {
                com.google.gson.internal.a.l();
                return null;
            }
            x xVar2 = (x) it2;
            int iNextInt3 = xVar2.nextInt();
            if (cVar2.f5700l) {
                float fFeatureDistSquared3 = featureDistSquared(list.get(i6).getFeature(), list2.get(iNextInt3 % size2).getFeature());
                do {
                    int iNextInt4 = xVar2.nextInt();
                    float fFeatureDistSquared4 = featureDistSquared(list.get(i6).getFeature(), list2.get(iNextInt4 % size2).getFeature());
                    if (Float.compare(fFeatureDistSquared3, fFeatureDistSquared4) > 0) {
                        iNextInt3 = iNextInt4;
                        fFeatureDistSquared3 = fFeatureDistSquared4;
                    }
                } while (cVar2.f5700l);
            }
            i = iNextInt3;
            arrayListE0.add(list2.get(i % size2));
        }
        return arrayListE0;
    }

    public static final float featureDistSquared(Feature feature, Feature feature2) {
        feature.getClass();
        feature2.getClass();
        if ((feature instanceof Feature.Corner) && (feature2 instanceof Feature.Corner) && ((Feature.Corner) feature).getConvex() != ((Feature.Corner) feature2).getConvex()) {
            return Float.MAX_VALUE;
        }
        float anchor1X = (((Cubic) l.y0(feature.getCubics())).getAnchor1X() + ((Cubic) l.q0(feature.getCubics())).getAnchor0X()) / 2.0f;
        float anchor1Y = (((Cubic) l.y0(feature.getCubics())).getAnchor1Y() + ((Cubic) l.q0(feature.getCubics())).getAnchor0Y()) / 2.0f;
        float anchor1X2 = (((Cubic) l.y0(feature2.getCubics())).getAnchor1X() + ((Cubic) l.q0(feature2.getCubics())).getAnchor0X()) / 2.0f;
        float f = anchor1X - anchor1X2;
        float anchor1Y2 = anchor1Y - ((((Cubic) l.y0(feature2.getCubics())).getAnchor1Y() + ((Cubic) l.q0(feature2.getCubics())).getAnchor0Y()) / 2.0f);
        return (anchor1Y2 * anchor1Y2) + (f * f);
    }

    public static final DoubleMapper featureMapper(List<ProgressableFeature> list, List<ProgressableFeature> list2) {
        list.getClass();
        list2.getClass();
        r6.c cVarT = a.a.t();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getFeature() instanceof Feature.Corner) {
                cVarT.add(list.get(i));
            }
        }
        r6.c cVarM = a.a.m(cVarT);
        r6.c cVarT2 = a.a.t();
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (list2.get(i6).getFeature() instanceof Feature.Corner) {
                cVarT2.add(list2.get(i6));
            }
        }
        r6.c cVarM2 = a.a.m(cVarT2);
        i iVar = cVarM.c() > cVarM2.c() ? new i(doMapping(cVarM2, cVarM), cVarM2) : new i(cVarM, doMapping(cVarM, cVarM2));
        List list3 = (List) iVar.f8441a;
        List list4 = (List) iVar.f8442b;
        r6.c cVarT3 = a.a.t();
        int size3 = list3.size();
        for (int i10 = 0; i10 < size3 && i10 != list4.size(); i10++) {
            cVarT3.add(new i(Float.valueOf(((ProgressableFeature) list3.get(i10)).getProgress()), Float.valueOf(((ProgressableFeature) list4.get(i10)).getProgress())));
        }
        i[] iVarArr = (i[]) a.a.m(cVarT3).toArray(new i[0]);
        return new DoubleMapper((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
    }
}
