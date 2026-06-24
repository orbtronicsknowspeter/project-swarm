package u4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10427b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f10428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x4.g f10429m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, x4.g gVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f10426a = i;
        this.f10428l = dVar;
        this.f10429m = gVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10426a) {
            case 0:
                return new b(this.f10428l, this.f10429m, cVar, 0);
            default:
                return new b(this.f10428l, this.f10429m, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10426a) {
        }
        return ((b) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0672 A[PHI: r5
      0x0672: PHI (r5v4 int) = (r5v3 int), (r5v5 int), (r5v6 int) binds: [B:61:0x017a, B:63:0x0185, B:65:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
