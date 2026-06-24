package a4;

import android.util.Log;
import com.uptodown.activities.AppDetailActivity;
import e1.c1;
import e1.u4;
import e1.v4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f90b;

    public f(j0.k kVar, f8.q qVar) {
        this.f89a = 18;
        this.f90b = qVar;
    }

    private final void a() {
        i1.a aVar = (i1.a) this.f90b;
        synchronized (aVar.f5626a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.f5628c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        j1.m mVar = (j1.m) this.f90b;
        synchronized (mVar.f6557l) {
            try {
                j1.c cVar = (j1.c) mVar.f6558m;
                if (cVar != null) {
                    cVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        while (true) {
            long jA = ((m8.m) this.f90b).a(System.nanoTime());
            if (jA == -1) {
                return;
            }
            if (jA > 0) {
                long j = jA / 1000000;
                long j6 = jA - (1000000 * j);
                synchronized (((m8.m) this.f90b)) {
                    try {
                        ((m8.m) this.f90b).wait(j, (int) j6);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0324  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.run():void");
    }

    public /* synthetic */ f(Object obj, int i) {
        this.f89a = i;
        this.f90b = obj;
    }

    public f(c1 c1Var, boolean z9) {
        this.f89a = 4;
        this.f90b = c1Var;
    }

    public f(u4 u4Var, v4 v4Var) {
        this.f89a = 8;
        this.f90b = u4Var;
    }

    public f(AppDetailActivity appDetailActivity, String str, int i) {
        this.f89a = 2;
        this.f90b = appDetailActivity;
    }
}
