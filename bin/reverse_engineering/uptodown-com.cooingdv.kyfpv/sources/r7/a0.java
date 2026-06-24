package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8955b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c4.a0 f8956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f8958n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c4.a0 a0Var, t6.c cVar) {
        super(cVar);
        this.f8956l = a0Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8954a = obj;
        this.f8955b |= Integer.MIN_VALUE;
        return this.f8956l.emit(null, this);
    }
}
