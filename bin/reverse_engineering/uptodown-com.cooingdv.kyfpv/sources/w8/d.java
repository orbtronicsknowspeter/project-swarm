package w8;

import a4.r0;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class d extends i0 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f10951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static d f10952l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10953e;
    public d f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        i = conditionNewCondition;
        j = 60000L;
        f10951k = 60000000000L;
    }

    public final void h() {
        d dVar;
        long j6 = this.f10966c;
        boolean z9 = this.f10964a;
        if (j6 != 0 || z9) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f10953e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f10953e = true;
                if (f10952l == null) {
                    f10952l = new d();
                    r0 r0Var = new r0("Okio Watchdog");
                    r0Var.setDaemon(true);
                    r0Var.start();
                }
                long jNanoTime = System.nanoTime();
                if (j6 != 0 && z9) {
                    this.g = Math.min(j6, c() - jNanoTime) + jNanoTime;
                } else if (j6 != 0) {
                    this.g = j6 + jNanoTime;
                } else {
                    if (!z9) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j10 = this.g - jNanoTime;
                d dVar2 = f10952l;
                dVar2.getClass();
                while (true) {
                    dVar = dVar2.f;
                    if (dVar == null || j10 < dVar.g - jNanoTime) {
                        break;
                    } else {
                        dVar2 = dVar;
                    }
                }
                this.f = dVar;
                dVar2.f = this;
                if (dVar2 == f10952l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.f10953e) {
                return false;
            }
            this.f10953e = false;
            d dVar = f10952l;
            while (dVar != null) {
                d dVar2 = dVar.f;
                if (dVar2 == this) {
                    dVar.f = this.f;
                    this.f = null;
                    return false;
                }
                dVar = dVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
