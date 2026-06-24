package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x4 extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.m f2898b;

    public x4(b5.m mVar) {
        this.f2898b = mVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n k(String str, y2.s sVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        b5.m mVar = this.f2898b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    b2.t1.S("getEventName", 0, arrayList);
                    return new q(((b) mVar.f1062l).f2508a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    b2.t1.S("getTimestamp", 0, arrayList);
                    return new g(Double.valueOf(((b) mVar.f1062l).f2509b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    b2.t1.S("getParamValue", 1, arrayList);
                    String strF = ((t) sVar.f11756l).c(sVar, (n) arrayList.get(0)).f();
                    HashMap map = ((b) mVar.f1062l).f2510c;
                    return z3.U(map.containsKey(strF) ? map.get(strF) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    b2.t1.S("getParams", 0, arrayList);
                    HashMap map2 = ((b) mVar.f1062l).f2510c;
                    k kVar = new k();
                    for (String str2 : map2.keySet()) {
                        kVar.d(str2, z3.U(map2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    b2.t1.S("setParamValue", 2, arrayList);
                    String strF2 = ((t) sVar.f11756l).c(sVar, (n) arrayList.get(0)).f();
                    n nVarC = ((t) sVar.f11756l).c(sVar, (n) arrayList.get(1));
                    b bVar = (b) mVar.f1062l;
                    Object objD0 = b2.t1.d0(nVarC);
                    HashMap map3 = bVar.f2510c;
                    if (objD0 == null) {
                        map3.remove(strF2);
                        return nVarC;
                    }
                    map3.put(strF2, b.b(map3.get(strF2), strF2, objD0));
                    return nVarC;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    b2.t1.S("setEventName", 1, arrayList);
                    n nVarC2 = ((t) sVar.f11756l).c(sVar, (n) arrayList.get(0));
                    if (n.f2717c.equals(nVarC2) || n.f2718d.equals(nVarC2)) {
                        com.google.gson.internal.a.p("Illegal event name");
                        return null;
                    }
                    ((b) mVar.f1062l).f2508a = nVarC2.f();
                    return new q(nVarC2.f());
                }
                break;
        }
        return super.k(str, sVar, arrayList);
    }
}
