package t1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f9528o = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f9530b = new ArrayDeque();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9531l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9532m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m4.a f9533n = new m4.a(this);

    public i(Executor executor) {
        y.g(executor);
        this.f9529a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.g(runnable);
        synchronized (this.f9530b) {
            int i = this.f9531l;
            if (i != 4 && i != 3) {
                long j = this.f9532m;
                q0.b bVar = new q0.b(runnable, 2);
                this.f9530b.add(bVar);
                this.f9531l = 2;
                try {
                    this.f9529a.execute(this.f9533n);
                    if (this.f9531l != 2) {
                        return;
                    }
                    synchronized (this.f9530b) {
                        try {
                            if (this.f9532m == j && this.f9531l == 2) {
                                this.f9531l = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f9530b) {
                        try {
                            int i6 = this.f9531l;
                            boolean z9 = true;
                            if ((i6 != 1 && i6 != 2) || !this.f9530b.removeLastOccurrence(bVar)) {
                                z9 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z9) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f9530b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f9529a + "}";
    }
}
