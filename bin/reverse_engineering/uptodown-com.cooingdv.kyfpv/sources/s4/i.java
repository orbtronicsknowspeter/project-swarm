package s4;

import com.uptodown.R;
import java.util.ArrayList;
import u4.z0;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.s f9215b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(y2.s sVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f9214a = i;
        this.f9215b = sVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9214a) {
            case 0:
                return new i(this.f9215b, cVar, 0);
            default:
                return new i(this.f9215b, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9214a) {
            case 0:
                i iVar = (i) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                iVar.invokeSuspend(xVar);
                return xVar;
            default:
                i iVar2 = (i) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                iVar2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i = this.f9214a;
        p6.x xVar = p6.x.f8464a;
        y2.s sVar = this.f9215b;
        switch (i) {
            case 0:
                p6.a.e(obj);
                z0 z0Var = ((u4.y0) sVar.f11757l).f10665a;
                e4.h hVar = z0Var.f10671b;
                if (hVar == null || (arrayList4 = hVar.f4545e) == null || arrayList4.isEmpty()) {
                    z0Var.f10671b = new e4.h(z0Var.f10677q, z0Var.f10678r, z0Var.f10679s, z0Var.getClass().getSimpleName());
                }
                if (z0Var.f10673m.isEmpty() || z0Var.f10672l.isEmpty()) {
                    z0Var.h().setVisibility(8);
                    z0Var.i().setVisibility(0);
                    z0Var.g().setVisibility(0);
                } else {
                    String strB = z0Var.b();
                    if (strB == null || strB.length() == 0) {
                        z0Var.l(z0Var.getString(R.string.apps));
                    }
                    e4.h hVar2 = z0Var.f10671b;
                    if (hVar2 != null) {
                        ArrayList arrayList5 = z0Var.f10673m;
                        ArrayList arrayList6 = z0Var.f10672l;
                        p2 p2Var = z0Var.f10674n;
                        p2 p2Var2 = z0Var.f10675o;
                        String strB2 = z0Var.b();
                        strB2.getClass();
                        arrayList5.getClass();
                        arrayList6.getClass();
                        hVar2.f4545e = new ArrayList();
                        if (!arrayList5.isEmpty()) {
                            e4.f fVar = new e4.f();
                            fVar.f4527c = strB2;
                            fVar.f4525a = arrayList5;
                            fVar.f4526b = arrayList6;
                            e4.g gVar = new e4.g();
                            gVar.f4533a = fVar;
                            gVar.f4534b = 0;
                            hVar2.f4545e.add(gVar);
                        }
                        if (p2Var != null && (arrayList3 = p2Var.f11331b) != null && (!arrayList3.isEmpty())) {
                            hVar2.b(p2Var);
                        }
                        if (arrayList6.isEmpty() || ((x4.j) arrayList6.get(0)).f11230o != 523) {
                            if (p2Var2 != null && (arrayList = p2Var2.f11331b) != null && (!arrayList.isEmpty())) {
                                hVar2.b(p2Var2);
                            }
                        } else if (p2Var2 != null && (arrayList2 = p2Var2.f11331b) != null && (!arrayList2.isEmpty())) {
                            hVar2.b(p2Var2);
                        }
                    }
                    z0Var.h().setAdapter(z0Var.f10671b);
                    z0Var.h().setVisibility(0);
                    z0Var.i().setVisibility(8);
                }
                z0Var.d().setVisibility(8);
                break;
            default:
                p6.a.e(obj);
                u4.y0 y0Var = (u4.y0) sVar.f11757l;
                ArrayList arrayList7 = (ArrayList) sVar.f11759n;
                y0Var.getClass();
                arrayList7.getClass();
                y0Var.f10665a.f10672l = arrayList7;
                break;
        }
        return xVar;
    }
}
