package a4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f93b;

    public /* synthetic */ g(q0 q0Var, int i) {
        this.f92a = i;
        this.f93b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f92a) {
            case 0:
                throw new IllegalStateException("Transformation " + this.f93b.b() + " returned input Bitmap but recycled it.");
            default:
                throw new IllegalStateException("Transformation " + this.f93b.b() + " mutated input Bitmap but failed to recycle the original.");
        }
    }
}
