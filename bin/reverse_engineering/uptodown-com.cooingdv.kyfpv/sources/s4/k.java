package s4;

import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.s f9226b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p2 f9227l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(y2.s sVar, p2 p2Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f9225a = i;
        this.f9226b = sVar;
        this.f9227l = p2Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9225a) {
            case 0:
                return new k(this.f9226b, this.f9227l, cVar, 0);
            case 1:
                return new k(this.f9226b, this.f9227l, cVar, 1);
            default:
                return new k(this.f9226b, this.f9227l, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9225a) {
            case 0:
                k kVar = (k) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                kVar.invokeSuspend(xVar);
                return xVar;
            case 1:
                k kVar2 = (k) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                kVar2.invokeSuspend(xVar2);
                return xVar2;
            default:
                k kVar3 = (k) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8464a;
                kVar3.invokeSuspend(xVar3);
                return xVar3;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9225a) {
            case 0:
                p6.a.e(obj);
                u4.y0 y0Var = (u4.y0) this.f9226b.f11757l;
                y0Var.getClass();
                y0Var.f10665a.f10674n = this.f9227l;
                break;
            case 1:
                p6.a.e(obj);
                u4.y0 y0Var2 = (u4.y0) this.f9226b.f11757l;
                y0Var2.getClass();
                y0Var2.f10665a.f10675o = this.f9227l;
                break;
            default:
                p6.a.e(obj);
                y2.s sVar = this.f9226b;
                if (((x4.j) sVar.f11758m).f11225a != 523) {
                    u4.y0 y0Var3 = (u4.y0) sVar.f11757l;
                    y0Var3.getClass();
                    p2 p2Var = this.f9227l;
                    p2Var.getClass();
                    e4.h hVar = y0Var3.f10665a.f10671b;
                    if (hVar != null) {
                        hVar.b(p2Var);
                    }
                }
                break;
        }
        return p6.x.f8464a;
    }
}
