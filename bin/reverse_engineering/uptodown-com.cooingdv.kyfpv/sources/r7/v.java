package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c4.a0 f9067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9068b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c4.a0 f9070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f9071n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c4.a0 a0Var, t6.c cVar) {
        super(cVar);
        this.f9070m = a0Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9068b = obj;
        this.f9069l |= Integer.MIN_VALUE;
        return this.f9070m.emit(null, this);
    }
}
