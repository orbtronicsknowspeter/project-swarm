package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends t7.r implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f8329n;

    public x1(long j, t6.c cVar) {
        super(cVar, cVar.getContext());
        this.f8329n = j;
    }

    @Override // o7.m1
    public final String S() {
        return super.S() + "(timeMillis=" + this.f8329n + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0.n(this.f8230l);
        x(new w1("Timed out waiting for " + this.f8329n + " ms", this));
    }
}
