package u4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(f0 f0Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f10614a = i;
        this.f10615b = f0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10614a) {
            case 0:
                return new u(this.f10615b, cVar, 0);
            case 1:
                return new u(this.f10615b, cVar, 1);
            case 2:
                return new u(this.f10615b, cVar, 2);
            case 3:
                return new u(this.f10615b, cVar, 3);
            default:
                return new u(this.f10615b, cVar, 4);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10614a) {
            case 0:
                u uVar = (u) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                uVar.invokeSuspend(xVar);
                return xVar;
            case 1:
                u uVar2 = (u) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                uVar2.invokeSuspend(xVar2);
                return xVar2;
            case 2:
                u uVar3 = (u) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8464a;
                uVar3.invokeSuspend(xVar3);
                return xVar3;
            case 3:
                u uVar4 = (u) create(a0Var, cVar);
                p6.x xVar4 = p6.x.f8464a;
                uVar4.invokeSuspend(xVar4);
                return xVar4;
            default:
                u uVar5 = (u) create(a0Var, cVar);
                p6.x xVar5 = p6.x.f8464a;
                uVar5.invokeSuspend(xVar5);
                return xVar5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01b8  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
