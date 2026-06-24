package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 extends w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f8302m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8304b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q6.i f8305l;

    public final void A(boolean z9) {
        this.f8303a = (z9 ? 4294967296L : 1L) + this.f8303a;
        if (z9) {
            return;
        }
        this.f8304b = true;
    }

    public abstract long B();

    public final boolean C() {
        q6.i iVar = this.f8305l;
        if (iVar == null) {
            return false;
        }
        k0 k0Var = (k0) (iVar.isEmpty() ? null : iVar.removeFirst());
        if (k0Var == null) {
            return false;
        }
        k0Var.run();
        return true;
    }

    @Override // o7.w
    public final w limitedParallelism(int i, String str) {
        t7.a.a(i);
        return str != null ? new t7.o(this, str) : this;
    }

    public abstract void shutdown();

    public final void y(boolean z9) {
        long j = this.f8303a - (z9 ? 4294967296L : 1L);
        this.f8303a = j;
        if (j <= 0 && this.f8304b) {
            shutdown();
        }
    }

    public final void z(k0 k0Var) {
        q6.i iVar = this.f8305l;
        if (iVar == null) {
            iVar = new q6.i();
            this.f8305l = iVar;
        }
        iVar.addLast(k0Var);
    }
}
