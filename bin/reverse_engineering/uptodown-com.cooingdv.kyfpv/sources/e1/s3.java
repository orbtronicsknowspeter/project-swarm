package e1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s3 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4249e;
    public final /* synthetic */ w3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(w3 w3Var, t1 t1Var, int i) {
        super(t1Var);
        this.f4249e = i;
        this.f = w3Var;
    }

    @Override // e1.n
    public final void a() {
        switch (this.f4249e) {
            case 0:
                w3 w3Var = this.f;
                w3Var.g();
                if (w3Var.x()) {
                    w0 w0Var = w3Var.f3876a.f4265o;
                    t1.m(w0Var);
                    w0Var.f4347w.b("Inactivity, disconnecting from the service");
                    w3Var.o();
                    break;
                }
                break;
            default:
                w0 w0Var2 = this.f.f3876a.f4265o;
                t1.m(w0Var2);
                w0Var2.f4343r.b("Tasks have been queued for a long time");
                break;
        }
    }
}
