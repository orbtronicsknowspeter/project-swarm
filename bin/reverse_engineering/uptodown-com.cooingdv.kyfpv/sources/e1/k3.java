package e1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j3 f4079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f4080b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f4081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f4082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m3 f4083n;

    public k3(m3 m3Var, j3 j3Var, j3 j3Var2, long j, boolean z9) {
        this.f4079a = j3Var;
        this.f4080b = j3Var2;
        this.f4081l = j;
        this.f4082m = z9;
        this.f4083n = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4083n.q(this.f4079a, this.f4080b, this.f4081l, this.f4082m, null);
    }
}
