package g8;

import d7.l;
import j0.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements h, k0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5382b = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f5383l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5384m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f5385n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5386o = new HashMap();

    @Override // g8.h
    public void a(j7.c cVar, j7.c cVar2, z7.b bVar) {
        j(cVar, cVar2, bVar, false);
    }

    @Override // g8.h
    public void b(j7.c cVar, l lVar) {
        cVar.getClass();
        k(cVar, new b(lVar), false);
    }

    public d c() {
        return new d((HashMap) this.f5382b, (HashMap) this.f5383l, (HashMap) this.f5384m, (HashMap) this.f5385n, (HashMap) this.f5386o, this.f5381a);
    }

    @Override // g8.h
    public void d(j7.c cVar, z7.b bVar) {
        bVar.getClass();
        k(cVar, new a(bVar), false);
    }

    @Override // g8.h
    public void e(j7.c cVar, l lVar) {
        h(cVar, lVar, false);
    }

    @Override // g8.h
    public void f(j7.c cVar, l lVar) {
        i(cVar, lVar, false);
    }

    @Override // k0.d
    public void g(h0.b bVar) {
        ((j0.e) this.f5386o).v.post(new m1.a(this, bVar, 20, false));
    }

    public void h(j7.c cVar, l lVar, boolean z9) {
        HashMap map = (HashMap) this.f5386o;
        l lVar2 = (l) map.get(cVar);
        if (lVar2 == null || lVar2.equals(lVar) || z9) {
            map.put(cVar, lVar);
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.t("Default deserializers provider for ", cVar, " is already registered: ", lVar2);
        }
    }

    public void i(j7.c cVar, l lVar, boolean z9) {
        HashMap map = (HashMap) this.f5384m;
        l lVar2 = (l) map.get(cVar);
        if (lVar2 == null || lVar2.equals(lVar) || z9) {
            map.put(cVar, lVar);
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.t("Default serializers provider for ", cVar, " is already registered: ", lVar2);
        }
    }

    public void j(j7.c cVar, j7.c cVar2, z7.b bVar, boolean z9) {
        Object next;
        String strA = bVar.getDescriptor().a();
        HashMap map = (HashMap) this.f5383l;
        Object map2 = map.get(cVar);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(cVar, map2);
        }
        Map map3 = (Map) map2;
        z7.b bVar2 = (z7.b) map3.get(cVar2);
        HashMap map4 = (HashMap) this.f5385n;
        Object map5 = map4.get(cVar);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(cVar, map5);
        }
        Map map6 = (Map) map5;
        if (z9) {
            if (bVar2 != null) {
                map6.remove(bVar2.getDescriptor().a());
            }
            map3.put(cVar2, bVar);
            map6.put(strA, bVar);
            return;
        }
        if (bVar2 != null) {
            if (!bVar2.equals(bVar)) {
                throw new e("Serializer for " + cVar2 + " already registered in the scope of " + cVar);
            }
        }
        z7.b bVar3 = (z7.b) map6.get(strA);
        if (bVar3 == null) {
            map3.put(cVar2, bVar);
            map6.put(strA, bVar);
            return;
        }
        Object obj = map.get(cVar);
        obj.getClass();
        Set setEntrySet = ((Map) obj).entrySet();
        setEntrySet.getClass();
        Iterator it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == bVar3) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + cVar + "' have the same serial name '" + strA + "': '" + cVar2 + "' and '" + ((Map.Entry) next) + '\'');
    }

    public void k(j7.c cVar, c cVar2, boolean z9) {
        c cVar3;
        HashMap map = (HashMap) this.f5382b;
        cVar.getClass();
        if (!z9 && (cVar3 = (c) map.get(cVar)) != null && !cVar3.equals(cVar2)) {
            throw new e("Contextual serializer or serializer provider for " + cVar + " already registered in this module");
        }
        map.put(cVar, cVar2);
        if (d0.b.F(cVar).isInterface()) {
            this.f5381a = true;
        }
    }

    public void l(h0.b bVar) {
        m mVar = (m) ((j0.e) this.f5386o).f6499s.get((j0.a) this.f5383l);
        if (mVar != null) {
            mVar.p(bVar);
        }
    }
}
