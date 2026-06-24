package e1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f4355b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f4356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f4357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b3 f4358n;

    public /* synthetic */ w2(b3 b3Var, j2 j2Var, long j, boolean z9, int i) {
        this.f4354a = i;
        this.f4355b = j2Var;
        this.f4356l = j;
        this.f4357m = z9;
        this.f4358n = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4354a) {
            case 0:
                b3 b3Var = this.f4358n;
                j2 j2Var = this.f4355b;
                b3Var.k(j2Var);
                b3Var.w(j2Var, this.f4356l, this.f4357m);
                break;
            default:
                b3 b3Var2 = this.f4358n;
                j2 j2Var2 = this.f4355b;
                b3Var2.k(j2Var2);
                b3Var2.w(j2Var2, this.f4356l, this.f4357m);
                break;
        }
    }
}
