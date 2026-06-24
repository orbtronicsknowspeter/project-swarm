package androidx.lifecycle;

import androidx.annotation.MainThread;
import d7.p;
import o7.a0;
import o7.c0;
import o7.m0;
import o7.o0;
import p6.x;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class EmittedSource implements o0 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends v6.i implements p {
        int label;

        public AnonymousClass1(t6.c cVar) {
            super(2, cVar);
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return EmittedSource.this.new AnonymousClass1(cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass1) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            EmittedSource.this.removeSource();
            return x.f8464a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$disposeNow$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends v6.i implements p {
        int label;

        public AnonymousClass2(t6.c cVar) {
            super(2, cVar);
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return EmittedSource.this.new AnonymousClass2(cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass2) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            EmittedSource.this.removeSource();
            return x.f8464a;
        }
    }

    public EmittedSource(LiveData<?> liveData, MediatorLiveData<?> mediatorLiveData) {
        liveData.getClass();
        mediatorLiveData.getClass();
        this.source = liveData;
        this.mediator = mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // o7.o0
    public void dispose() {
        v7.e eVar = m0.f8289a;
        c0.s(c0.b(n.f10349a.f8469l), null, null, new AnonymousClass1(null), 3);
    }

    public final Object disposeNow(t6.c cVar) {
        v7.e eVar = m0.f8289a;
        Object objC = c0.C(new AnonymousClass2(null), n.f10349a.f8469l, cVar);
        return objC == u6.a.f10763a ? objC : x.f8464a;
    }
}
