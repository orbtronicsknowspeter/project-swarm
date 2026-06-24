package e1;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w3 f4305b;

    public /* synthetic */ u3(w3 w3Var, int i) {
        this.f4304a = i;
        this.f4305b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4304a) {
            case 0:
                this.f4305b.m();
                break;
            case 1:
                w3 w3Var = this.f4305b;
                t1 t1Var = w3Var.f3876a;
                i0 i0Var = w3Var.f4360m;
                if (i0Var == null) {
                    w0 w0Var = t1Var.f4265o;
                    t1.m(w0Var);
                    w0Var.f4340o.b("Failed to send Dma consent settings to service");
                } else {
                    try {
                        i0Var.s(w3Var.w(false));
                        w3Var.t();
                    } catch (RemoteException e10) {
                        w0 w0Var2 = t1Var.f4265o;
                        t1.m(w0Var2);
                        w0Var2.f4340o.c(e10, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                w3 w3Var2 = this.f4305b;
                t1 t1Var2 = w3Var2.f3876a;
                i0 i0Var2 = w3Var2.f4360m;
                if (i0Var2 == null) {
                    w0 w0Var3 = t1Var2.f4265o;
                    t1.m(w0Var3);
                    w0Var3.f4340o.b("Failed to send storage consent settings to service");
                } else {
                    try {
                        i0Var2.m(w3Var2.w(false));
                        w3Var2.t();
                    } catch (RemoteException e11) {
                        w0 w0Var4 = t1Var2.f4265o;
                        t1.m(w0Var4);
                        w0Var4.f4340o.c(e11, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
