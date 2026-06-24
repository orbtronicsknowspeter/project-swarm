package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9051b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f9052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f9053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f9054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f9055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9056p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar, t6.c cVar) {
        super(cVar);
        this.f9052l = oVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9050a = obj;
        this.f9051b |= Integer.MIN_VALUE;
        return this.f9052l.collect(null, this);
    }
}
