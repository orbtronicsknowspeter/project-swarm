package e1;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.r7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.m3 f3879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f3880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f3881e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final /* synthetic */ c h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d5(c cVar, String str, com.google.android.gms.internal.measurement.m3 m3Var, BitSet bitSet, BitSet bitSet2, ArrayMap arrayMap, ArrayMap arrayMap2) {
        this.h = cVar;
        this.f3877a = str;
        this.f3880d = bitSet;
        this.f3881e = bitSet2;
        this.f = arrayMap;
        this.g = new ArrayMap();
        for (K k5 : arrayMap2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) arrayMap2.get(k5));
            this.g.put(k5, arrayList);
        }
        this.f3878b = false;
        this.f3879c = m3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(b bVar) {
        int iP;
        boolean z9;
        boolean zU;
        switch (bVar.g) {
            case 0:
                iP = ((com.google.android.gms.internal.measurement.o1) bVar.i).p();
                break;
            default:
                iP = ((com.google.android.gms.internal.measurement.v1) bVar.i).p();
                break;
        }
        if (bVar.f3781c != null) {
            this.f3881e.set(iP, true);
        }
        Boolean bool = bVar.f3782d;
        if (bool != null) {
            this.f3880d.set(iP, bool.booleanValue());
        }
        if (bVar.f3783e != null) {
            Integer numValueOf = Integer.valueOf(iP);
            ArrayMap arrayMap = this.f;
            Long l10 = (Long) arrayMap.get(numValueOf);
            long jLongValue = bVar.f3783e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                arrayMap.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f != null) {
            Integer numValueOf2 = Integer.valueOf(iP);
            ArrayMap arrayMap2 = this.g;
            List arrayList = (List) arrayMap2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                arrayMap2.put(numValueOf2, arrayList);
            }
            switch (bVar.g) {
                case 0:
                    z9 = false;
                    break;
                default:
                    z9 = true;
                    break;
            }
            if (z9) {
                arrayList.clear();
            }
            r7.a();
            t1 t1Var = this.h.f3875a;
            g gVar = t1Var.f4262m;
            e0 e0Var = f0.G0;
            String str = this.f3877a;
            if (gVar.q(str, e0Var)) {
                switch (bVar.g) {
                    case 0:
                        zU = ((com.google.android.gms.internal.measurement.o1) bVar.i).u();
                        break;
                    default:
                        zU = false;
                        break;
                }
                if (zU) {
                    arrayList.clear();
                }
            }
            r7.a();
            boolean zQ = t1Var.f4262m.q(str, e0Var);
            Long l11 = bVar.f;
            if (!zQ) {
                arrayList.add(Long.valueOf(l11.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l11.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.t2 b(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.s2 s2VarV = com.google.android.gms.internal.measurement.t2.v();
        s2VarV.b();
        ((com.google.android.gms.internal.measurement.t2) s2VarV.f2687b).w(i);
        s2VarV.b();
        ((com.google.android.gms.internal.measurement.t2) s2VarV.f2687b).z(this.f3878b);
        com.google.android.gms.internal.measurement.m3 m3Var = this.f3879c;
        if (m3Var != null) {
            s2VarV.b();
            ((com.google.android.gms.internal.measurement.t2) s2VarV.f2687b).y(m3Var);
        }
        com.google.android.gms.internal.measurement.l3 l3VarW = com.google.android.gms.internal.measurement.m3.w();
        ArrayList arrayListO = a1.O(this.f3880d);
        l3VarW.b();
        ((com.google.android.gms.internal.measurement.m3) l3VarW.f2687b).A(arrayListO);
        ArrayList arrayListO2 = a1.O(this.f3881e);
        l3VarW.b();
        ((com.google.android.gms.internal.measurement.m3) l3VarW.f2687b).y(arrayListO2);
        ArrayMap arrayMap = this.f;
        if (arrayMap == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayMap.size());
            for (Integer num : arrayMap.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) arrayMap.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.y2 y2VarS = com.google.android.gms.internal.measurement.z2.s();
                    y2VarS.b();
                    ((com.google.android.gms.internal.measurement.z2) y2VarS.f2687b).t(iIntValue);
                    long jLongValue = l10.longValue();
                    y2VarS.b();
                    ((com.google.android.gms.internal.measurement.z2) y2VarS.f2687b).u(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.z2) y2VarS.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            l3VarW.b();
            ((com.google.android.gms.internal.measurement.m3) l3VarW.f2687b).C(arrayList);
        }
        ArrayMap arrayMap2 = this.g;
        if (arrayMap2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayMap2.size());
            for (Integer num2 : arrayMap2.keySet()) {
                com.google.android.gms.internal.measurement.n3 n3VarT = com.google.android.gms.internal.measurement.o3.t();
                int iIntValue2 = num2.intValue();
                n3VarT.b();
                ((com.google.android.gms.internal.measurement.o3) n3VarT.f2687b).u(iIntValue2);
                List list2 = (List) arrayMap2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    n3VarT.b();
                    ((com.google.android.gms.internal.measurement.o3) n3VarT.f2687b).v(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.o3) n3VarT.d());
            }
            list = arrayList3;
        }
        l3VarW.b();
        ((com.google.android.gms.internal.measurement.m3) l3VarW.f2687b).E(list);
        s2VarV.b();
        ((com.google.android.gms.internal.measurement.t2) s2VarV.f2687b).x((com.google.android.gms.internal.measurement.m3) l3VarW.d());
        return (com.google.android.gms.internal.measurement.t2) s2VarV.d();
    }

    public /* synthetic */ d5(c cVar, String str) {
        this.h = cVar;
        this.f3877a = str;
        this.f3878b = true;
        this.f3880d = new BitSet();
        this.f3881e = new BitSet();
        this.f = new ArrayMap();
        this.g = new ArrayMap();
    }
}
