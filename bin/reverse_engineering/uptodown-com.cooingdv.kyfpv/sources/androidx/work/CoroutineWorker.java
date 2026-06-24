package androidx.work;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import d7.p;
import kotlin.jvm.internal.l;
import o7.a0;
import o7.c0;
import o7.m0;
import o7.w;
import p6.x;
import t6.h;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final w coroutineContext;
    private final WorkerParameters params;

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class DeprecatedDispatcher extends w {
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();
        private static final w dispatcher = m0.f8289a;

        private DeprecatedDispatcher() {
        }

        @Override // o7.w
        public void dispatch(h hVar, Runnable runnable) {
            hVar.getClass();
            runnable.getClass();
            dispatcher.dispatch(hVar, runnable);
        }

        public final w getDispatcher() {
            return dispatcher;
        }

        @Override // o7.w
        public boolean isDispatchNeeded(h hVar) {
            hVar.getClass();
            return dispatcher.isDispatchNeeded(hVar);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        int label;

        public AnonymousClass1(t6.c cVar) {
            super(2, cVar);
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return CoroutineWorker.this.new AnonymousClass1(cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass1) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    p6.a.e(obj);
                    return obj;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            u6.a aVar = u6.a.f10763a;
            return foregroundInfo == aVar ? aVar : foregroundInfo;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "invokeSuspend")
    public static final class C00851 extends i implements p {
        int label;

        public C00851(t6.c cVar) {
            super(2, cVar);
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return CoroutineWorker.this.new C00851(cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((C00851) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    p6.a.e(obj);
                    return obj;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            u6.a aVar = u6.a.f10763a;
            return objDoWork == aVar ? aVar : objDoWork;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.params = workerParameters;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, t6.c cVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(t6.c cVar);

    public w getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(t6.c cVar) {
        return getForegroundInfo$suspendImpl(this, cVar);
    }

    @Override // androidx.work.ListenableWorker
    public final m1.b getForegroundInfoAsync() {
        return ListenableFutureKt.launchFuture$default(getCoroutineContext().plus(c0.c()), null, new AnonymousClass1(null), 2, null);
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, t6.c cVar) {
        m1.b foregroundAsync = setForegroundAsync(foregroundInfo);
        foregroundAsync.getClass();
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, cVar);
        return objAwait == u6.a.f10763a ? objAwait : x.f8464a;
    }

    public final Object setProgress(Data data, t6.c cVar) {
        m1.b progressAsync = setProgressAsync(data);
        progressAsync.getClass();
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(progressAsync, cVar);
        return objAwait == u6.a.f10763a ? objAwait : x.f8464a;
    }

    @Override // androidx.work.ListenableWorker
    public final m1.b startWork() {
        h coroutineContext = !l.a(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.getWorkerContext();
        coroutineContext.getClass();
        return ListenableFutureKt.launchFuture$default(coroutineContext.plus(c0.c()), null, new C00851(null), 2, null);
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
