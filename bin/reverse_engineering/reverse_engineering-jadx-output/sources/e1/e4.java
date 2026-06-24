package e1;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f3911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f4 f3912d;

    public e4(f4 f4Var) {
        this.f3912d = f4Var;
        t1 t1Var = f4Var.f3875a;
        this.f3911c = new d4(this, t1Var, 0);
        t1Var.f4269t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f3909a = jElapsedRealtime;
        this.f3910b = jElapsedRealtime;
    }

    public final boolean a(boolean z9, boolean z10, long j) {
        f4 f4Var = this.f3912d;
        f4Var.g();
        f4Var.h();
        t1 t1Var = f4Var.f3875a;
        boolean zD = t1Var.d();
        w0 w0Var = t1Var.f4264o;
        if (zD) {
            g1 g1Var = t1Var.f4263n;
            t1.k(g1Var);
            e1 e1Var = g1Var.f3993y;
            t1Var.f4269t.getClass();
            e1Var.b(System.currentTimeMillis());
        }
        long j6 = j - this.f3909a;
        if (!z9 && j6 < 1000) {
            t1.m(w0Var);
            w0Var.f4346w.c(Long.valueOf(j6), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j6 = j - this.f3910b;
            this.f3910b = j;
        }
        t1.m(w0Var);
        w0Var.f4346w.c(Long.valueOf(j6), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j6);
        boolean z11 = !t1Var.f4262m.u();
        m3 m3Var = t1Var.f4270u;
        t1.l(m3Var);
        a5.Y(m3Var.m(z11), bundle, true);
        if (!z10) {
            b3 b3Var = t1Var.v;
            t1.l(b3Var);
            b3Var.n("auto", "_e", bundle);
        }
        this.f3909a = j;
        d4 d4Var = this.f3911c;
        d4Var.c();
        d4Var.b(((Long) f0.f3951r0.a(null)).longValue());
        return true;
    }
}
