package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9052b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f9053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f9054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f9055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f9056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9057p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar, t6.c cVar) {
        super(cVar);
        this.f9053l = oVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9051a = obj;
        this.f9052b |= Integer.MIN_VALUE;
        return this.f9053l.collect(null, this);
    }
}
