package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b5.m f9175b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9176l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b5.m mVar, v6.c cVar) {
        super(cVar);
        this.f9175b = mVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f9174a = obj;
        this.f9176l |= Integer.MIN_VALUE;
        Object objT = b5.m.t(this.f9175b, null, this);
        return objT == u6.a.f10763a ? objT : new p6.k(objT);
    }
}
