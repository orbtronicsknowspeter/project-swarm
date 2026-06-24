package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m8.q f9292b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m8.q qVar, v6.c cVar) {
        super(cVar);
        this.f9292b = qVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f9291a = obj;
        this.f9293l |= Integer.MIN_VALUE;
        Object objK = this.f9292b.k(0, this);
        return objK == u6.a.f10762a ? objK : new p6.k(objK);
    }
}
