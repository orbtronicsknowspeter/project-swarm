package e1;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f4092b;

    public l3(m3 m3Var, int i) {
        this.f4091a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(m3Var);
                this.f4092b = m3Var;
                break;
            default:
                Objects.requireNonNull(m3Var);
                this.f4092b = m3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4091a) {
            case 0:
                m3 m3Var = this.f4092b;
                m3Var.f4123n = m3Var.f4128s;
                break;
            default:
                this.f4092b.f4128s = null;
                break;
        }
    }
}
