package c4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3.y0 f1582b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1583l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(c3.y0 y0Var, t6.c cVar) {
        super(cVar);
        this.f1582b = y0Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f1581a = obj;
        this.f1583l |= Integer.MIN_VALUE;
        return this.f1582b.a(null, this);
    }
}
