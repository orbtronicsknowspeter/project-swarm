package r7;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9064b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f9065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c4.a0 f9066m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar, t6.c cVar) {
        super(cVar);
        this.f9065l = oVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9063a = obj;
        this.f9064b |= Integer.MIN_VALUE;
        return this.f9065l.collect(null, this);
    }
}
