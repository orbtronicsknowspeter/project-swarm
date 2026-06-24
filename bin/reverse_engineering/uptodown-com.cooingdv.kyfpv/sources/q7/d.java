package q7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8741b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8742l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, v6.c cVar) {
        super(cVar);
        this.f8741b = eVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8740a = obj;
        this.f8742l |= Integer.MIN_VALUE;
        Object objD = this.f8741b.D(null, 0, 0L, this);
        return objD == u6.a.f10763a ? objD : new l(objD);
    }
}
