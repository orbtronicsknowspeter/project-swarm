package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.k f9189b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9190l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r.k kVar, v6.c cVar) {
        super(cVar);
        this.f9189b = kVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f9188a = obj;
        this.f9190l |= Integer.MIN_VALUE;
        Object objD = this.f9189b.d(null, this);
        return objD == u6.a.f10763a ? objD : new p6.k(objD);
    }
}
