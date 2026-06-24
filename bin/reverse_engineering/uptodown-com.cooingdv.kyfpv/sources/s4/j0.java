package s4;

import e1.v4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v4 f9223b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9224l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v4 v4Var, v6.c cVar) {
        super(cVar);
        this.f9223b = v4Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f9222a = obj;
        this.f9224l |= Integer.MIN_VALUE;
        Object objC = this.f9223b.c(0, 0, this);
        return objC == u6.a.f10763a ? objC : new p6.k(objC);
    }
}
