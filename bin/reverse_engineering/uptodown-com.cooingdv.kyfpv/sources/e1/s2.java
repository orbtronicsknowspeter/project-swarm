package e1;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4247b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b3 f4248l;

    public s2(b3 b3Var, long j, int i) {
        this.f4246a = i;
        switch (i) {
            case 1:
                this.f4247b = j;
                Objects.requireNonNull(b3Var);
                this.f4248l = b3Var;
                break;
            default:
                this.f4247b = j;
                Objects.requireNonNull(b3Var);
                this.f4248l = b3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4246a) {
            case 0:
                t1 t1Var = this.f4248l.f3876a;
                g1 g1Var = t1Var.f4264n;
                t1.k(g1Var);
                e1 e1Var = g1Var.f3990t;
                long j = this.f4247b;
                e1Var.b(j);
                w0 w0Var = t1Var.f4265o;
                t1.m(w0Var);
                w0Var.v.c(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                b3 b3Var = this.f4248l;
                b3Var.g();
                b3Var.h();
                t1 t1Var2 = b3Var.f3876a;
                w0 w0Var2 = t1Var2.f4265o;
                t1.m(w0Var2);
                w0Var2.v.b("Resetting analytics data (FE)");
                f4 f4Var = t1Var2.f4267q;
                t1.l(f4Var);
                f4Var.g();
                e4 e4Var = f4Var.f3976o;
                e4Var.f3912c.c();
                e4Var.f3913d.f3876a.f4270t.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                e4Var.f3910a = jElapsedRealtime;
                e4Var.f3911b = jElapsedRealtime;
                t1Var2.r().l();
                boolean z9 = !t1Var2.d();
                g1 g1Var2 = t1Var2.f4264n;
                t1.k(g1Var2);
                g1Var2.f3985o.b(this.f4247b);
                t1 t1Var3 = g1Var2.f3876a;
                g1 g1Var3 = t1Var3.f4264n;
                t1.k(g1Var3);
                if (!TextUtils.isEmpty(g1Var3.E.n())) {
                    g1Var2.E.o(null);
                }
                g1Var2.f3994y.b(0L);
                g1Var2.f3995z.b(0L);
                if (!t1Var3.f4263m.t()) {
                    g1Var2.p(z9);
                }
                g1Var2.F.o(null);
                g1Var2.G.b(0L);
                g1Var2.H.K(null);
                w3 w3VarP = t1Var2.p();
                w3VarP.g();
                w3VarP.h();
                c5 c5VarW = w3VarP.w(false);
                w3VarP.s();
                w3VarP.f3876a.o().k();
                w3VarP.u(new r3(w3VarP, c5VarW, 0));
                t1.l(f4Var);
                f4Var.f3975n.G();
                b3Var.B = z9;
                t1Var2.p().k(new AtomicReference());
                break;
        }
    }
}
