package r7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q7.s f8959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8960b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f8961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, v6.c cVar2) {
        super(cVar2);
        this.f8961l = cVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8960b = obj;
        this.f8962m |= Integer.MIN_VALUE;
        return this.f8961l.c(null, this);
    }
}
