package t1;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9515b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Runnable f9516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9519o;

    public /* synthetic */ d(f fVar, Runnable runnable, long j, long j6, TimeUnit timeUnit, int i) {
        this.f9514a = i;
        this.f9515b = fVar;
        this.f9516l = runnable;
        this.f9517m = j;
        this.f9518n = j6;
        this.f9519o = timeUnit;
    }

    @Override // t1.g
    public final ScheduledFuture a(g5.g gVar) {
        switch (this.f9514a) {
            case 0:
                f fVar = this.f9515b;
                return fVar.f9525b.scheduleAtFixedRate(new e(fVar, this.f9516l, gVar, 0), this.f9517m, this.f9518n, this.f9519o);
            default:
                f fVar2 = this.f9515b;
                return fVar2.f9525b.scheduleWithFixedDelay(new e(fVar2, this.f9516l, gVar, 2), this.f9517m, this.f9518n, this.f9519o);
        }
    }
}
