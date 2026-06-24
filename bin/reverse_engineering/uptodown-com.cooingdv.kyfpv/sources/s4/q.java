package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f9264b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.j f9265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j5.v f9266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j5.g f9267n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, x4.j jVar, j5.v vVar, j5.g gVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f9263a = i;
        this.f9264b = sVar;
        this.f9265l = jVar;
        this.f9266m = vVar;
        this.f9267n = gVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9263a) {
            case 0:
                return new q(this.f9264b, this.f9265l, this.f9266m, this.f9267n, cVar, 0);
            default:
                return new q(this.f9264b, this.f9265l, this.f9266m, this.f9267n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9263a) {
        }
        return ((q) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9263a) {
            case 0:
                p6.a.e(obj);
                return s.a(this.f9264b, this.f9265l, this.f9266m, this.f9267n);
            default:
                p6.a.e(obj);
                return s.a(this.f9264b, this.f9265l, this.f9266m, this.f9267n);
        }
    }
}
