package o7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends x0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f8330a;

    public y0(Executor executor) {
        this.f8330a = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f8330a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o7.w
    public final void dispatch(t6.h hVar, Runnable runnable) {
        try {
            this.f8330a.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            e1 e1Var = (e1) hVar.get(x.f8328b);
            if (e1Var != null) {
                e1Var.c(cancellationException);
            }
            v7.e eVar = m0.f8289a;
            v7.d.f10885a.dispatch(hVar, runnable);
        }
    }

    @Override // o7.h0
    public final o0 e(long j, x1 x1Var, t6.h hVar) {
        Executor executor = this.f8330a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(x1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                e1 e1Var = (e1) hVar.get(x.f8328b);
                if (e1Var != null) {
                    e1Var.c(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new n0(scheduledFutureSchedule) : d0.f8251q.e(j, x1Var, hVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f8330a == this.f8330a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8330a);
    }

    @Override // o7.h0
    public final void i(long j, l lVar) {
        Executor executor = this.f8330a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            m4.a aVar = new m4.a(this, lVar, 2, false);
            t6.h hVar = lVar.f8282n;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(aVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                e1 e1Var = (e1) hVar.get(x.f8328b);
                if (e1Var != null) {
                    e1Var.c(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            lVar.v(new h(scheduledFutureSchedule, 0));
        } else {
            d0.f8251q.i(j, lVar);
        }
    }

    @Override // o7.w
    public final String toString() {
        return this.f8330a.toString();
    }

    @Override // o7.x0
    public final Executor y() {
        return this.f8330a;
    }
}
