package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9038b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f9039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f9040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f9041n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, t6.c cVar) {
        super(cVar);
        this.f9039l = oVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9037a = obj;
        this.f9038b |= Integer.MIN_VALUE;
        return this.f9039l.collect(null, this);
    }
}
