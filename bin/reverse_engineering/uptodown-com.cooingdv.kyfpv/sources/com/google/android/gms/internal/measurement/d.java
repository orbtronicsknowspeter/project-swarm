package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Iterable, n, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f2532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f2533b;

    public d(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                q(i, (n) list.get(i));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new c(this, this.f2532a.keySet().iterator(), this.f2533b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n c(String str) {
        n nVar;
        return "length".equals(str) ? new g(Double.valueOf(o())) : (!h(str) || (nVar = (n) this.f2533b.get(str)) == null) ? n.f2717c : nVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void d(String str, n nVar) {
        TreeMap treeMap = this.f2533b;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (o() != dVar.o()) {
            return false;
        }
        TreeMap treeMap = this.f2532a;
        if (treeMap.isEmpty()) {
            return dVar.f2532a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!p(iIntValue).equals(dVar.p(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return t(",");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        TreeMap treeMap = this.f2532a;
        return treeMap.size() == 1 ? p(0).g() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean h(String str) {
        return "length".equals(str) || this.f2533b.containsKey(str);
    }

    public final int hashCode() {
        return this.f2532a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (t0.f.S(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).o() == r7.o()) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.n k(java.lang.String r37, y2.s r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instruction units count: 2156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.k(java.lang.String, y2.s, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        d dVar = new d();
        for (Map.Entry entry : this.f2532a.entrySet()) {
            boolean z9 = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.f2532a;
            if (z9) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).l());
            }
        }
        return dVar;
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(o());
        for (int i = 0; i < o(); i++) {
            arrayList.add(p(i));
        }
        return arrayList;
    }

    public final Iterator n() {
        return this.f2532a.keySet().iterator();
    }

    public final int o() {
        TreeMap treeMap = this.f2532a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n p(int i) {
        n nVar;
        if (i < o()) {
            return (!r(i) || (nVar = (n) this.f2532a.get(Integer.valueOf(i))) == null) ? n.f2717c : nVar;
        }
        com.google.gson.internal.a.r("Attempting to get element outside of current array");
        return null;
    }

    public final void q(int i, n nVar) {
        if (i > 32468) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Array too large");
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.f2532a;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), nVar);
        }
    }

    public final boolean r(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f2532a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void s(int i) {
        TreeMap treeMap = this.f2532a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i6 = i - 1;
            Integer numValueOf = Integer.valueOf(i6);
            if (treeMap.containsKey(numValueOf) || i6 < 0) {
                return;
            }
            treeMap.put(numValueOf, n.f2717c);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            n nVar = (n) treeMap.get(numValueOf2);
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i - 1), nVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String t(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f2532a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= o()) {
                    break;
                }
                n nVarP = p(i);
                sb.append(str2);
                if (!(nVarP instanceof r) && !(nVarP instanceof l)) {
                    sb.append(nVarP.f());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return t(",");
    }

    public d() {
        this.f2532a = new TreeMap();
        this.f2533b = new TreeMap();
    }
}
