package androidx.concurrent.futures;

import java.util.concurrent.ExecutionException;
import m1.b;
import o7.j;
import p6.a;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
final class ToContinuation<T> implements Runnable {
    private final j continuation;
    private final b futureToObserve;

    public ToContinuation(b bVar, j jVar) {
        bVar.getClass();
        jVar.getClass();
        this.futureToObserve = bVar;
        this.continuation = jVar;
    }

    public final j getContinuation() {
        return this.continuation;
    }

    public final b getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsCancelled = this.futureToObserve.isCancelled();
        j jVar = this.continuation;
        if (zIsCancelled) {
            jVar.o(null);
            return;
        }
        try {
            jVar.resumeWith(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve));
        } catch (ExecutionException e10) {
            this.continuation.resumeWith(a.b(ListenableFutureKt.nonNullCause(e10)));
        }
    }
}
