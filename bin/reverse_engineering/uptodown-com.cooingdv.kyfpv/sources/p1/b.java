package p1;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.k1;
import e1.c0;
import f0.i;
import g5.g;
import j$.util.concurrent.ConcurrentHashMap;
import k0.y;
import m8.q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f8417c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8419b;

    public b(i iVar) {
        y.g(iVar);
        this.f8418a = iVar;
        this.f8419b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (q1.b.f8639c.contains(str) || q1.b.f8638b.contains(str2)) {
            return;
        }
        l1.i iVar = q1.b.f8640d;
        int i = iVar.f7067m;
        int i6 = 0;
        int i10 = 0;
        while (i10 < i) {
            boolean zContainsKey = bundle.containsKey((String) iVar.get(i10));
            i10++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (q1.b.f8639c.contains(str)) {
                return;
            }
            l1.i iVar2 = q1.b.f8640d;
            int i11 = iVar2.f7067m;
            while (i6 < i11) {
                boolean zContainsKey2 = bundle.containsKey((String) iVar2.get(i6));
                i6++;
                if (zContainsKey2) {
                    return;
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        k1 k1Var = (k1) this.f8418a.f4812b;
        k1Var.a(new e1(k1Var, str, str2, bundle, true));
    }

    public final c0 b(String str, q qVar) {
        if (!q1.b.f8639c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f8419b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                i iVar = this.f8418a;
                a4.i qVar2 = zEquals ? new q(iVar, qVar) : "clx".equals(str) ? new g(iVar, qVar) : null;
                if (qVar2 != null) {
                    concurrentHashMap.put(str, qVar2);
                    return new c0(27);
                }
            }
        }
        return null;
    }
}
