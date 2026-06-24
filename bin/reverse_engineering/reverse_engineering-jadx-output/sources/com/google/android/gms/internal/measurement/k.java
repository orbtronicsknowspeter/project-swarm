package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class k implements n, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2678a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new i(this.f2678a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n c(String str) {
        HashMap map = this.f2678a;
        return map.containsKey(str) ? (n) map.get(str) : n.f2717c;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void d(String str, n nVar) {
        HashMap map = this.f2678a;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f2678a.equals(((k) obj).f2678a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean h(String str) {
        return this.f2678a.containsKey(str);
    }

    public final int hashCode() {
        return this.f2678a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n k(String str, y2.s sVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(toString()) : androidx.lifecycle.l.I(this, new q(str), sVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        k kVar = new k();
        for (Map.Entry entry : this.f2678a.entrySet()) {
            boolean z9 = entry.getValue() instanceof j;
            HashMap map = kVar.f2678a;
            if (z9) {
                map.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((n) entry.getValue()).l());
            }
        }
        return kVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f2678a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
