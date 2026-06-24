package androidx.lifecycle;

import androidx.annotation.MainThread;
import d7.p;
import o7.a0;
import o7.c0;
import o7.e1;
import o7.m0;
import p6.x;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class BlockRunner<T> {
    private final p block;
    private e1 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final d7.a onDone;
    private e1 runningJob;
    private final a0 scope;
    private final long timeoutInMs;

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$cancel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {182}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends v6.i implements p {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BlockRunner<T> blockRunner, t6.c cVar) {
            super(2, cVar);
            this.this$0 = blockRunner;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass1) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                long j = ((BlockRunner) this.this$0).timeoutInMs;
                this.label = 1;
                Object objJ = c0.j(j, this);
                u6.a aVar = u6.a.f10763a;
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                e1 e1Var = ((BlockRunner) this.this$0).runningJob;
                if (e1Var != null) {
                    e1Var.c(null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return x.f8464a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$maybeRun$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {170}, m = "invokeSuspend", v = 1)
    public static final class C00521 extends v6.i implements p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00521(BlockRunner<T> blockRunner, t6.c cVar) {
            super(2, cVar);
            this.this$0 = blockRunner;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            C00521 c00521 = new C00521(this.this$0, cVar);
            c00521.L$0 = obj;
            return c00521;
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((C00521) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((a0) this.L$0).getCoroutineContext());
                p pVar = ((BlockRunner) this.this$0).block;
                this.label = 1;
                Object objInvoke = pVar.invoke(liveDataScopeImpl, this);
                u6.a aVar = u6.a.f10763a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return x.f8464a;
        }
    }

    public BlockRunner(CoroutineLiveData<T> coroutineLiveData, p pVar, long j, a0 a0Var, d7.a aVar) {
        coroutineLiveData.getClass();
        pVar.getClass();
        a0Var.getClass();
        aVar.getClass();
        this.liveData = coroutineLiveData;
        this.block = pVar;
        this.timeoutInMs = j;
        this.scope = a0Var;
        this.onDone = aVar;
    }

    @MainThread
    public final void cancel() {
        if (this.cancellationJob != null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Cancel call cannot happen without a maybeRun");
            return;
        }
        a0 a0Var = this.scope;
        v7.e eVar = m0.f8289a;
        this.cancellationJob = c0.s(a0Var, n.f10349a.f8469l, null, new AnonymousClass1(this, null), 2);
    }

    @MainThread
    public final void maybeRun() {
        e1 e1Var = this.cancellationJob;
        if (e1Var != null) {
            e1Var.c(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = c0.s(this.scope, null, null, new C00521(this, null), 3);
    }
}
