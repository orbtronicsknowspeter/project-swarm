package r7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements o7.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f8979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8980b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o7.l f8982m;

    public h0(j0 j0Var, long j, Object obj, o7.l lVar) {
        this.f8979a = j0Var;
        this.f8980b = j;
        this.f8981l = obj;
        this.f8982m = lVar;
    }

    @Override // o7.o0
    public final void dispose() {
        j0 j0Var = this.f8979a;
        synchronized (j0Var) {
            if (this.f8980b < j0Var.l()) {
                return;
            }
            Object[] objArr = j0Var.f8998o;
            objArr.getClass();
            long j = this.f8980b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            k0.d(objArr, j, k0.f9006a);
            j0Var.g();
        }
    }
}
