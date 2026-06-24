package t1;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9516b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Runnable f9517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9520o;

    public /* synthetic */ d(f fVar, Runnable runnable, long j, long j6, TimeUnit timeUnit, int i) {
        this.f9515a = i;
        this.f9516b = fVar;
        this.f9517l = runnable;
        this.f9518m = j;
        this.f9519n = j6;
        this.f9520o = timeUnit;
    }

    @Override // t1.g
    public final ScheduledFuture a(g5.g gVar) {
        switch (this.f9515a) {
            case 0:
                f fVar = this.f9516b;
                return fVar.f9526b.scheduleAtFixedRate(new e(fVar, this.f9517l, gVar, 0), this.f9518m, this.f9519n, this.f9520o);
            default:
                f fVar2 = this.f9516b;
                return fVar2.f9526b.scheduleWithFixedDelay(new e(fVar2, this.f9517l, gVar, 2), this.f9518m, this.f9519n, this.f9520o);
        }
    }
}
