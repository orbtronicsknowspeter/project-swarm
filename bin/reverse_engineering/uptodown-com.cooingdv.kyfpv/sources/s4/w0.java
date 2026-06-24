package s4;

import e1.v4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v4 f9314b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9315l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(v4 v4Var, v6.c cVar) {
        super(cVar);
        this.f9314b = v4Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f9313a = obj;
        this.f9315l |= Integer.MIN_VALUE;
        Object objD = this.f9314b.d(this);
        return objD == u6.a.f10763a ? objD : new p6.k(objD);
    }
}
