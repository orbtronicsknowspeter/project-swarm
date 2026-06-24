package j9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f6780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6781b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f6782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6783m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, v6.c cVar) {
        super(cVar);
        this.f6782l = nVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6781b = obj;
        this.f6783m |= Integer.MIN_VALUE;
        return this.f6782l.a(this);
    }
}
