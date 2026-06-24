package f9;

import kotlin.jvm.internal.x;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f5062b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f5063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5065n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar, x xVar2, String str, boolean z9, t6.c cVar) {
        super(2, cVar);
        this.f5062b = xVar;
        this.f5063l = xVar2;
        this.f5064m = str;
        this.f5065n = z9;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new p(this.f5062b, this.f5063l, this.f5064m, this.f5065n, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f5061a;
        if (i == 0) {
            p6.a.e(obj);
            h hVar = q.f5067b;
            d dVar = (d) this.f5062b.f7025a;
            c cVar = (c) this.f5063l.f7025a;
            boolean z9 = !this.f5065n;
            this.f5061a = 1;
            Object objD = hVar.d(dVar, cVar, this.f5064m, z9, this);
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
        }
        return p6.x.f8464a;
    }
}
