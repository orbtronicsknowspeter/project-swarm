package androidx.work.impl;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
final class ToContinuation<T> implements Runnable {
    private final o7.j continuation;
    private final m1.b futureToObserve;

    public ToContinuation(m1.b bVar, o7.j jVar) {
        bVar.getClass();
        jVar.getClass();
        this.futureToObserve = bVar;
        this.continuation = jVar;
    }

    public final o7.j getContinuation() {
        return this.continuation;
    }

    public final m1.b getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsCancelled = this.futureToObserve.isCancelled();
        o7.j jVar = this.continuation;
        if (zIsCancelled) {
            jVar.o(null);
            return;
        }
        try {
            jVar.resumeWith(WorkerWrapperKt.getUninterruptibly(this.futureToObserve));
        } catch (ExecutionException e10) {
            this.continuation.resumeWith(p6.a.b(WorkerWrapperKt.nonNullCause(e10)));
        }
    }
}
