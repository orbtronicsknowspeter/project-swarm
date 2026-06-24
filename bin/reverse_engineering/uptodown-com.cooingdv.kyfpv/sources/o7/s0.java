package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends u0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f8306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0 f8307m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(w0 w0Var, long j, l lVar) {
        super(j);
        this.f8307m = w0Var;
        this.f8306l = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8306l.C(this.f8307m);
    }

    @Override // o7.u0
    public final String toString() {
        return super.toString() + this.f8306l;
    }
}
