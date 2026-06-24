package r7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s7.l f8950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8951b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0 f8952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var, t6.c cVar) {
        super(cVar);
        this.f8952l = f0Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8951b = obj;
        this.f8953m |= Integer.MIN_VALUE;
        return this.f8952l.collect(null, this);
    }
}
