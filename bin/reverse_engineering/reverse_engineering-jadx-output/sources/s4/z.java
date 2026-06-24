package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b5.m f9327b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9328l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b5.m mVar, v6.c cVar) {
        super(cVar);
        this.f9327b = mVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f9326a = obj;
        this.f9328l |= Integer.MIN_VALUE;
        Object objL = b5.m.l(this.f9327b, null, this);
        return objL == u6.a.f10762a ? objL : new p6.k(objL);
    }
}
