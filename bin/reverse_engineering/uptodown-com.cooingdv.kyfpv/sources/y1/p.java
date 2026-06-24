package y1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11657b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f11658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f11659m;

    public /* synthetic */ p(q qVar, long j, String str, int i) {
        this.f11656a = i;
        this.f11657b = qVar;
        this.f11658l = j;
        this.f11659m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11656a) {
            case 0:
                q qVar = this.f11657b;
                qVar.f11669o.f11910b.a(new p(qVar, this.f11658l, this.f11659m, 1));
                break;
            default:
                l lVar = this.f11657b.g;
                s sVar = lVar.f11645n;
                if (sVar == null || !sVar.f11679e.get()) {
                    ((a2.d) lVar.i.f19b).e(this.f11658l, this.f11659m);
                }
                break;
        }
    }
}
