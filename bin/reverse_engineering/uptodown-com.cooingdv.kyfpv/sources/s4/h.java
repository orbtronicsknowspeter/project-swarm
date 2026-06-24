package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9208b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.s f9209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j5.v f9210m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j5.v vVar, y2.s sVar, t6.c cVar) {
        super(2, cVar);
        this.f9207a = 6;
        this.f9210m = vVar;
        this.f9209l = sVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9207a) {
            case 0:
                return new h(this.f9209l, this.f9210m, cVar, 0);
            case 1:
                return new h(this.f9209l, this.f9210m, cVar, 1);
            case 2:
                return new h(this.f9209l, this.f9210m, cVar, 2);
            case 3:
                return new h(this.f9209l, this.f9210m, cVar, 3);
            case 4:
                return new h(this.f9209l, this.f9210m, cVar, 4);
            case 5:
                return new h(this.f9209l, cVar);
            case 6:
                return new h(this.f9210m, this.f9209l, cVar);
            case 7:
                return new h(this.f9209l, this.f9210m, cVar, 7);
            default:
                return new h(this.f9209l, this.f9210m, cVar, 8);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9207a) {
        }
        return ((h) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x031f, code lost:
    
        if (r1 == r12) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e4  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(y2.s sVar, j5.v vVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f9207a = i;
        this.f9209l = sVar;
        this.f9210m = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y2.s sVar, t6.c cVar) {
        super(2, cVar);
        this.f9207a = 5;
        this.f9209l = sVar;
    }
}
