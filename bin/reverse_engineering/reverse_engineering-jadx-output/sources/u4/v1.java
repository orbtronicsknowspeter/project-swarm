package u4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10644b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z1 f10646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x4.g f10647n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(z1 z1Var, x4.g gVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f10643a = i;
        this.f10646m = z1Var;
        this.f10647n = gVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10643a) {
            case 0:
                return new v1(this.f10646m, this.f10647n, cVar, 0);
            case 1:
                return new v1(this.f10646m, this.f10647n, cVar, 1);
            default:
                return new v1(this.f10646m, this.f10647n, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10643a) {
        }
        return ((v1) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119 A[PHI: r0
      0x0119: PHI (r0v11 java.lang.Object) = (r0v10 java.lang.Object), (r0v10 java.lang.Object), (r0v13 java.lang.Object) binds: [B:46:0x00fc, B:48:0x0115, B:37:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d A[PHI: r0
      0x016d: PHI (r0v15 java.lang.Object) = (r0v14 java.lang.Object), (r0v14 java.lang.Object), (r0v17 java.lang.Object) binds: [B:63:0x0150, B:65:0x016a, B:33:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
