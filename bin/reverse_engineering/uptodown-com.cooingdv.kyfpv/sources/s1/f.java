package s1;

import android.util.Log;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.google.firebase.components.ComponentRegistrar;
import e1.c0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements b, k2.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f9122q = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9124b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f9125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f9126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f9127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReference f9128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c0 f9129p;

    public f(ArrayList arrayList, ArrayList arrayList2, c0 c0Var) {
        t1.j jVar = t1.j.f9534a;
        this.f9123a = new HashMap();
        this.f9124b = new HashMap();
        this.f9125l = new HashMap();
        this.f9126m = new HashSet();
        this.f9128o = new AtomicReference();
        k kVar = new k();
        this.f9127n = kVar;
        this.f9129p = c0Var;
        ArrayList arrayList3 = new ArrayList();
        int i = 2;
        int i6 = 0;
        arrayList3.add(a.c(kVar, k.class, p2.c.class, p2.b.class));
        arrayList3.add(a.c(this, k2.a.class, new Class[0]));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((s2.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f9129p.s(componentRegistrar));
                        it.remove();
                    }
                } catch (l e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f9115b.toArray();
                int length = array.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Object obj3 = array[i12];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f9126m.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f9126m.add(obj3.toString());
                        }
                        i12++;
                    }
                }
            }
            if (this.f9123a.isEmpty()) {
                z3.l(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f9123a.keySet());
                arrayList6.addAll(arrayList3);
                z3.l(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                a aVar2 = (a) obj4;
                this.f9123a.put(aVar2, new m(new n1.b(i, this, aVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        int size4 = arrayList5.size();
        while (i6 < size4) {
            Object obj5 = arrayList5.get(i6);
            i6++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f9128o.get();
        if (bool != null) {
            g(this.f9123a, bool.booleanValue());
        }
    }

    @Override // s1.b
    public final Object a(Class cls) {
        return e(r.a(cls));
    }

    @Override // s1.b
    public final synchronized s2.b b(r rVar) {
        i5.i(rVar, "Null interface requested.");
        return (s2.b) this.f9124b.get(rVar);
    }

    @Override // s1.b
    public final s2.b c(Class cls) {
        return b(r.a(cls));
    }

    @Override // s1.b
    public final Set d(r rVar) {
        s2.b bVar;
        synchronized (this) {
            bVar = (n) this.f9125l.get(rVar);
            if (bVar == null) {
                bVar = f9122q;
            }
        }
        return (Set) bVar.get();
    }

    @Override // s1.b
    public final Object e(r rVar) {
        s2.b bVarB = b(rVar);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    @Override // s1.b
    public final p f(r rVar) {
        s2.b bVarB = b(rVar);
        return bVarB == null ? new p(p.f9147c, p.f9148d) : bVarB instanceof p ? (p) bVarB : new p(null, bVarB);
    }

    public final void g(HashMap map, boolean z9) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            s2.b bVar = (s2.b) entry.getValue();
            int i = aVar.f9117d;
            if (i == 1 || (i == 2 && z9)) {
                bVar.get();
            }
        }
        k kVar = this.f9127n;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f9139b;
                if (arrayDeque != null) {
                    kVar.f9139b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                com.google.gson.internal.a.o();
            }
        }
    }

    public final void h() {
        HashMap map = this.f9124b;
        HashMap map2 = this.f9125l;
        for (a aVar : this.f9123a.keySet()) {
            for (i iVar : aVar.f9116c) {
                boolean z9 = iVar.f9136b == 2;
                r rVar = iVar.f9135a;
                if (z9 && !map2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.f9145b = null;
                    nVar.f9144a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f9144a.addAll(set);
                    map2.put(rVar, nVar);
                } else if (map.containsKey(rVar)) {
                    continue;
                } else {
                    int i = iVar.f9136b;
                    if (i == 1) {
                        throw new j("Unsatisfied dependency for component " + aVar + ": " + rVar);
                    }
                    if (i != 2) {
                        map.put(rVar, new p(p.f9147c, p.f9148d));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar = (a) obj;
            if (aVar.f9118e == 0) {
                s2.b bVar = (s2.b) this.f9123a.get(aVar);
                for (r rVar : aVar.f9115b) {
                    HashMap map = this.f9124b;
                    if (map.containsKey(rVar)) {
                        arrayList2.add(new androidx.browser.trusted.c(20, (p) ((s2.b) map.get(rVar)), bVar));
                    } else {
                        map.put(rVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap map = this.f9125l;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f9123a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f9118e != 0) {
                s2.b bVar = (s2.b) entry.getValue();
                for (r rVar : aVar.f9115b) {
                    if (!map2.containsKey(rVar)) {
                        map2.put(rVar, new HashSet());
                    }
                    ((Set) map2.get(rVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                n nVar = (n) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new androidx.browser.trusted.c(21, nVar, (s2.b) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f9145b = null;
                nVar2.f9144a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f9144a.addAll(set);
                map.put(rVar2, nVar2);
            }
        }
        return arrayList;
    }
}
