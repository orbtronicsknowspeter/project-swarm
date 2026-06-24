package t6;

import a4.x;
import c4.j1;
import d7.p;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f10312b;

    public b(f fVar, h hVar) {
        hVar.getClass();
        fVar.getClass();
        this.f10311a = hVar;
        this.f10312b = fVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i = 2;
            b bVar2 = bVar;
            int i6 = 2;
            while (true) {
                h hVar = bVar2.f10311a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i6++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f10311a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i++;
            }
            if (i6 == i) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f10312b;
                    if (!l.a(bVar.get(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f10311a;
                    if (!(hVar3 instanceof b)) {
                        hVar3.getClass();
                        f fVar2 = (f) hVar3;
                        zA = l.a(bVar.get(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t6.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f10311a.fold(obj, pVar), this.f10312b);
    }

    @Override // t6.h
    public final f get(g gVar) {
        gVar.getClass();
        b bVar = this;
        while (true) {
            f fVar = bVar.f10312b.get(gVar);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f10311a;
            if (!(hVar instanceof b)) {
                return hVar.get(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final int hashCode() {
        return this.f10312b.hashCode() + this.f10311a.hashCode();
    }

    @Override // t6.h
    public final h minusKey(g gVar) {
        gVar.getClass();
        f fVar = this.f10312b;
        f fVar2 = fVar.get(gVar);
        h hVar = this.f10311a;
        if (fVar2 != null) {
            return hVar;
        }
        h hVarMinusKey = hVar.minusKey(gVar);
        return hVarMinusKey == hVar ? this : hVarMinusKey == i.f10314a ? fVar : new b(fVar, hVarMinusKey);
    }

    @Override // t6.h
    public final h plus(h hVar) {
        hVar.getClass();
        return hVar == i.f10314a ? this : (h) hVar.fold(this, new j1(14));
    }

    public final String toString() {
        return x.m(new StringBuilder("["), (String) fold("", new j1(13)), ']');
    }
}
