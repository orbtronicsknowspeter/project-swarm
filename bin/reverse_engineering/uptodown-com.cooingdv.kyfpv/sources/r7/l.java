package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9010b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f9011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f9012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f9013n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t6.c cVar) {
        super(cVar);
        this.f9011l = mVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9009a = obj;
        this.f9010b |= Integer.MIN_VALUE;
        return this.f9011l.collect(null, this);
    }
}
