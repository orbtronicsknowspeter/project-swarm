package f8;

import d8.o0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class r extends a {
    public final e8.t f;
    public final b8.e g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e8.b bVar, e8.t tVar, String str, b8.e eVar) {
        super(bVar, str);
        bVar.getClass();
        this.f = tVar;
        this.g = eVar;
    }

    @Override // f8.a
    public e8.k b(String str) {
        str.getClass();
        return (e8.k) q6.a0.g0(q(), str);
    }

    @Override // f8.a, c8.e
    public final c8.c beginStructure(b8.e eVar) {
        eVar.getClass();
        b8.e eVar2 = this.g;
        if (eVar != eVar2) {
            return super.beginStructure(eVar);
        }
        e8.k kVarC = c();
        String strA = eVar2.a();
        if (kVarC instanceof e8.t) {
            return new r(this.f4927c, (e8.t) kVarC, this.f4928d, eVar2);
        }
        throw m.e("Expected " + kotlin.jvm.internal.y.a(e8.t.class).c() + ", but had " + kotlin.jvm.internal.y.a(kVarC.getClass()).c() + " as the serialized body of " + strA + " at element: " + s(), kVarC.toString(), -1);
    }

    @Override // c8.c
    public int decodeElementIndex(b8.e eVar) {
        eVar.getClass();
        while (this.h < eVar.e()) {
            int i = this.h;
            this.h = i + 1;
            String strP = p(eVar, i);
            int i6 = this.h - 1;
            this.i = false;
            if (!q().containsKey(strP)) {
                boolean z9 = (this.f4927c.f4762a.f4771a || eVar.i(i6) || !eVar.h(i6).c()) ? false : true;
                this.i = z9;
                if (z9) {
                }
            }
            this.f4929e.getClass();
            return i6;
        }
        return -1;
    }

    @Override // f8.a, c8.e
    public final boolean decodeNotNullMark() {
        return !this.i && super.decodeNotNullMark();
    }

    @Override // f8.a, c8.c
    public void endStructure(b8.e eVar) {
        Set setZ;
        eVar.getClass();
        e8.h hVar = this.f4929e;
        hVar.getClass();
        if (eVar.getKind() instanceof b8.c) {
            return;
        }
        e8.b bVar = this.f4927c;
        m.l(eVar, bVar);
        if (hVar.f4774d) {
            Set setB = o0.b(eVar);
            a3.d dVar = bVar.f4764c;
            dVar.getClass();
            Map map = (Map) ((ConcurrentHashMap) dVar.f63b).get(eVar);
            Object obj = map != null ? map.get(m.f4958a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = q6.v.f8727a;
            }
            setZ = q6.b0.Z(setB, setKeySet);
        } else {
            setZ = o0.b(eVar);
        }
        for (String str : q().f4785a.keySet()) {
            if (!setZ.contains(str) && !kotlin.jvm.internal.l.a(str, this.f4928d)) {
                String string = q().toString();
                str.getClass();
                StringBuilder sbV = a4.x.v("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbV.append((Object) m.k(-1, string));
                throw m.d(-1, sbV.toString());
            }
        }
    }

    @Override // f8.a
    public String n(b8.e eVar, int i) {
        eVar.getClass();
        e8.b bVar = this.f4927c;
        m.l(eVar, bVar);
        String strF = eVar.f(i);
        if (this.f4929e.f4774d && !q().f4785a.keySet().contains(strF)) {
            a3.d dVar = bVar.f4764c;
            androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(8, eVar, bVar);
            dVar.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dVar.f63b;
            Map map = (Map) concurrentHashMap.get(eVar);
            Object obj = null;
            n nVar = m.f4958a;
            Object objInvoke = map != null ? map.get(nVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = cVar.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(eVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(nVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            Iterator it = q().f4785a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // f8.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public e8.t q() {
        return this.f;
    }

    public /* synthetic */ r(e8.b bVar, e8.t tVar, String str, int i) {
        this(bVar, tVar, (i & 4) != 0 ? null : str, (b8.e) null);
    }
}
