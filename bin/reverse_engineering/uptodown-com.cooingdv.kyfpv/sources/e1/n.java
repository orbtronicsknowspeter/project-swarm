package e1;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a4.c0 f4138d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f4139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1.a f4140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f4141c;

    public n(f2 f2Var) {
        k0.y.g(f2Var);
        this.f4139a = f2Var;
        this.f4140b = new m1.a(this, f2Var, 3, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            f2 f2Var = this.f4139a;
            f2Var.f().getClass();
            this.f4141c = System.currentTimeMillis();
            if (d().postDelayed(this.f4140b, j)) {
                return;
            }
            f2Var.a().f4340o.c(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f4141c = 0L;
        d().removeCallbacks(this.f4140b);
    }

    public final Handler d() {
        a4.c0 c0Var;
        if (f4138d != null) {
            return f4138d;
        }
        synchronized (n.class) {
            try {
                if (f4138d == null) {
                    f4138d = new a4.c0(this.f4139a.e().getMainLooper(), 3);
                }
                c0Var = f4138d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }
}
