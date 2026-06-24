package e1;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f4285b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v3 f4286l;

    public /* synthetic */ t3(v3 v3Var, i0 i0Var, int i) {
        this.f4284a = i;
        this.f4285b = i0Var;
        this.f4286l = v3Var;
    }

    private final void a() {
        v3 v3Var = this.f4286l;
        synchronized (v3Var) {
            try {
                v3Var.f4329a = false;
                w3 w3Var = v3Var.f4331l;
                if (!w3Var.x()) {
                    w0 w0Var = w3Var.f3876a.f4265o;
                    t1.m(w0Var);
                    w0Var.f4347w.b("Connected to service");
                    i0 i0Var = this.f4285b;
                    w3Var.g();
                    w3Var.f4360m = i0Var;
                    w3Var.t();
                    w3Var.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4284a) {
            case 0:
                a();
                return;
            default:
                v3 v3Var = this.f4286l;
                synchronized (v3Var) {
                    try {
                        v3Var.f4329a = false;
                        w3 w3Var = v3Var.f4331l;
                        if (!w3Var.x()) {
                            w0 w0Var = w3Var.f3876a.f4265o;
                            t1.m(w0Var);
                            w0Var.v.b("Connected to remote service");
                            i0 i0Var = this.f4285b;
                            w3Var.g();
                            w3Var.f4360m = i0Var;
                            w3Var.t();
                            w3Var.v();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                w3 w3Var2 = this.f4286l.f4331l;
                ScheduledExecutorService scheduledExecutorService = w3Var2.f4363p;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    w3Var2.f4363p = null;
                    return;
                }
                return;
        }
    }
}
