package n4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7950b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f7951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7952m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, v6.c cVar) {
        super(cVar);
        this.f7951l = hVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f7950b = obj;
        this.f7952m |= Integer.MIN_VALUE;
        return h.b(this.f7951l, 0, this);
    }
}
