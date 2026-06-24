package u5;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h8.c f10721d;

    public h(h8.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t tVar = t.f8724a;
        this.f10718a = tVar;
        this.f10719b = tVar;
        this.f10720c = linkedHashMap;
        this.f10721d = cVar;
    }

    public final void a(int i, g gVar) throws w5.e {
        i iVar = gVar.f10717b;
        int i6 = gVar.f10716a;
        h8.c cVar = this.f10721d;
        if (cVar != null) {
            h8.i iVar2 = (h8.i) cVar.h.get(String.valueOf(i));
            if (iVar2 == null) {
                return;
            }
            Set set = iVar2.f5474d;
            Set set2 = iVar2.f5475e;
            Set set3 = iVar2.f;
            if (iVar == i.NOT_ALLOWED) {
                if (!set2.contains(Integer.valueOf(i6)) && !set.contains(Integer.valueOf(i6))) {
                    return;
                }
            } else if (!set3.isEmpty()) {
                int iOrdinal = iVar.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != 2 || !set3.contains(Integer.valueOf(i6)) || !set.contains(Integer.valueOf(i6))) {
                        return;
                    }
                } else if (!set3.contains(Integer.valueOf(i6)) || !set2.contains(Integer.valueOf(i6))) {
                    return;
                }
            }
        }
        String strA = gVar.a();
        LinkedHashMap linkedHashMap = this.f10720c;
        if (!linkedHashMap.containsKey(strA)) {
            linkedHashMap.put(strA, new LinkedHashSet());
        }
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Set) entry.getValue()).contains(numValueOf)) {
                arrayList.add(z3.b((String) entry.getKey()));
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g gVar2 = (g) obj;
            if (gVar2.f10716a == i6) {
                String strA2 = gVar2.a();
                Set set4 = (Set) linkedHashMap.get(strA2);
                if (set4 != null) {
                    set4.remove(Integer.valueOf(i));
                    if (set4.isEmpty()) {
                        linkedHashMap.remove(strA2);
                    }
                }
            }
        }
        Set set5 = (Set) linkedHashMap.get(strA);
        if (set5 == null) {
            return;
        }
        set5.add(Integer.valueOf(i));
    }
}
