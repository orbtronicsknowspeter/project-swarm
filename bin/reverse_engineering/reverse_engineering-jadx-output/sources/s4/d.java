package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9185b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9186l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, v6.c cVar) {
        super(cVar);
        this.f9185b = eVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f9184a = obj;
        this.f9186l |= Integer.MIN_VALUE;
        Object objA = this.f9185b.a(this);
        return objA == u6.a.f10762a ? objA : new p6.k(objA);
    }
}
