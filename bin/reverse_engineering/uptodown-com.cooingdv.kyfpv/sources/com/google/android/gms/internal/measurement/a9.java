package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a9 extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z5 f2505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f2506m;

    public a9(z5 z5Var) {
        super("require");
        this.f2506m = new HashMap();
        this.f2505l = z5Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n a(y2.s sVar, List list) {
        n nVar;
        b2.t1.S("require", 1, list);
        String strF = ((t) sVar.f11757l).c(sVar, (n) list.get(0)).f();
        HashMap map = this.f2506m;
        if (map.containsKey(strF)) {
            return (n) map.get(strF);
        }
        HashMap map2 = (HashMap) this.f2505l.f2934a;
        if (map2.containsKey(strF)) {
            try {
                nVar = (n) ((Callable) map2.get(strF)).call();
            } catch (Exception unused) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("Failed to create API implementation: ".concat(String.valueOf(strF)));
                return null;
            }
        } else {
            nVar = n.f2717c;
        }
        if (nVar instanceof h) {
            map.put(strF, (h) nVar);
        }
        return nVar;
    }
}
