package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9019b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f9020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f9021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f9022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s7.l f9023o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t6.c cVar) {
        super(cVar);
        this.f9020l = oVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9018a = obj;
        this.f9019b |= Integer.MIN_VALUE;
        return this.f9020l.collect(null, this);
    }
}
