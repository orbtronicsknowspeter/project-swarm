package e1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4015b;

    public h0(t1 t1Var) {
        super(t1Var);
        this.f3876a.J++;
    }

    public final void h() {
        if (this.f4015b) {
            return;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Not initialized");
    }

    public final void i() {
        if (this.f4015b) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Can't initialize twice");
        } else {
            if (j()) {
                return;
            }
            this.f3876a.L.incrementAndGet();
            this.f4015b = true;
        }
    }

    public abstract boolean j();
}
