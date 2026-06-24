package c4;

import com.uptodown.activities.VirusTotalReport;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class nd extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f1925b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ VirusTotalReport f1929o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(od odVar, boolean z9, long j, long j6, VirusTotalReport virusTotalReport, t6.c cVar) {
        super(2, cVar);
        this.f1925b = odVar;
        this.f1926l = z9;
        this.f1927m = j;
        this.f1928n = j6;
        this.f1929o = virusTotalReport;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new nd(this.f1925b, this.f1926l, this.f1927m, this.f1928n, this.f1929o, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((nd) create((o7.a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD;
        r7.o0 o0Var = this.f1925b.f1967a;
        int i = this.f1924a;
        if (i == 0) {
            p6.a.e(obj);
            o0Var.getClass();
            o0Var.g(null, j5.p.f6706a);
            b5.m mVar = new b5.m(this.f1929o, String.valueOf(!this.f1926l ? this.f1927m : this.f1928n), (Object) null, 22);
            this.f1924a = 1;
            objD = mVar.D(this);
            u6.a aVar = u6.a.f10763a;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objD = ((p6.k) obj).f8445a;
        }
        if (!(objD instanceof p6.j)) {
            j5.r rVar = new j5.r((x4.f2) objD);
            o0Var.getClass();
            o0Var.g(null, rVar);
        }
        if (p6.k.a(objD) != null) {
            j5.r rVar2 = new j5.r(null);
            o0Var.getClass();
            o0Var.g(null, rVar2);
        }
        return p6.x.f8464a;
    }
}
