package c4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j1 implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1750a;

    public /* synthetic */ j1(int i) {
        this.f1750a = i;
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        t6.b bVar;
        switch (this.f1750a) {
            case 0:
                return Integer.valueOf(kotlin.jvm.internal.l.d(((x4.e) obj2).f11134w, ((x4.e) obj).f11134w));
            case 1:
                return Integer.valueOf(((x4.l2) obj).f11279b - ((x4.l2) obj2).f11279b);
            case 2:
                x4.e eVar = (x4.e) obj;
                x4.e eVar2 = (x4.e) obj2;
                eVar.getClass();
                eVar2.getClass();
                return Integer.valueOf(eVar.f11128p.compareTo(eVar2.f11128p));
            case 3:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                return Integer.valueOf(str.compareToIgnoreCase(str2));
            case 4:
                x4.e eVar3 = (x4.e) obj;
                x4.e eVar4 = (x4.e) obj2;
                eVar3.getClass();
                eVar4.getClass();
                return Integer.valueOf(kotlin.jvm.internal.l.d(eVar4.f11135x, eVar3.f11135x));
            case 5:
                x4.e eVar5 = (x4.e) obj;
                x4.e eVar6 = (x4.e) obj2;
                eVar5.getClass();
                eVar6.getClass();
                return Integer.valueOf(kotlin.jvm.internal.l.d(eVar6.f11135x, eVar5.f11135x));
            case 6:
                x4.e eVar7 = (x4.e) obj;
                x4.e eVar8 = (x4.e) obj2;
                eVar7.getClass();
                eVar8.getClass();
                return Integer.valueOf(kotlin.jvm.internal.l.d(eVar8.f11134w, eVar7.f11134w));
            case 7:
                ((l4.n) obj).getClass();
                ((l4.n) obj2).getClass();
                return Integer.valueOf(Boolean.compare(!r4.f7122b, !r5.f7122b));
            case 8:
                ((l4.n) obj).getClass();
                ((l4.n) obj2).getClass();
                return Integer.valueOf(Boolean.compare(!r4.f7122b, !r5.f7122b));
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 10:
                return ((t6.h) obj).plus((t6.f) obj2);
            case 11:
                return ((t6.h) obj).plus((t6.f) obj2);
            case 12:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 13:
                String str3 = (String) obj;
                t6.f fVar = (t6.f) obj2;
                str3.getClass();
                fVar.getClass();
                if (str3.length() == 0) {
                    return fVar.toString();
                }
                return str3 + ", " + fVar;
            case 14:
                t6.h hVar = (t6.h) obj;
                t6.f fVar2 = (t6.f) obj2;
                hVar.getClass();
                fVar2.getClass();
                t6.h hVarMinusKey = hVar.minusKey(fVar2.getKey());
                t6.i iVar = t6.i.f10315a;
                if (hVarMinusKey == iVar) {
                    return fVar2;
                }
                t6.d dVar = t6.d.f10314a;
                t6.e eVar9 = (t6.e) hVarMinusKey.get(dVar);
                if (eVar9 == null) {
                    bVar = new t6.b(fVar2, hVarMinusKey);
                } else {
                    t6.h hVarMinusKey2 = hVarMinusKey.minusKey(dVar);
                    if (hVarMinusKey2 == iVar) {
                        return new t6.b(eVar9, fVar2);
                    }
                    bVar = new t6.b(eVar9, new t6.b(fVar2, hVarMinusKey2));
                }
                return bVar;
            case 15:
                t6.f fVar3 = (t6.f) obj2;
                if (!(fVar3 instanceof t7.v)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar3 : Integer.valueOf(iIntValue + 1);
            case 16:
                t7.v vVar = (t7.v) obj;
                t6.f fVar4 = (t6.f) obj2;
                if (vVar != null) {
                    return vVar;
                }
                if (fVar4 instanceof t7.v) {
                    return (t7.v) fVar4;
                }
                return null;
            case 17:
                t7.y yVar = (t7.y) obj;
                t6.f fVar5 = (t6.f) obj2;
                if (fVar5 instanceof t7.v) {
                    t7.v vVar2 = (t7.v) fVar5;
                    t6.h hVar2 = yVar.f10365a;
                    ThreadLocal threadLocal = vVar2.f10360b;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(vVar2.f10359a);
                    Object[] objArr = yVar.f10366b;
                    int i = yVar.f10368d;
                    objArr[i] = obj3;
                    t7.v[] vVarArr = yVar.f10367c;
                    yVar.f10368d = i + 1;
                    vVarArr[i] = vVar2;
                }
                return yVar;
            default:
                return Integer.valueOf(((x4.l2) obj).f11279b - ((x4.l2) obj2).f11279b);
        }
    }
}
