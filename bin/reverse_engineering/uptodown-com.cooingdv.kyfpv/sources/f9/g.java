package f9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f5022b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, v6.c cVar) {
        super(cVar);
        this.f5022b = hVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f5021a = obj;
        this.f5023l |= Integer.MIN_VALUE;
        return this.f5022b.d(null, null, null, false, this);
    }
}
