package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import d7.p;
import o7.a0;
import o7.c0;
import o7.e1;
import o7.m0;
import p6.x;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final t6.h coroutineContext;
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends v6.i implements p {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(t6.c cVar) {
            super(2, cVar);
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            AnonymousClass1 anonymousClass1 = LifecycleCoroutineScopeImpl.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            a0 a0Var = (a0) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                e1 e1Var = (e1) a0Var.getCoroutineContext().get(o7.x.f8328b);
                if (e1Var != null) {
                    e1Var.c(null);
                }
            }
            return x.f8464a;
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, t6.h hVar) {
        e1 e1Var;
        lifecycle.getClass();
        hVar.getClass();
        this.lifecycle = lifecycle;
        this.coroutineContext = hVar;
        if (getLifecycle$lifecycle_common().getCurrentState() != Lifecycle.State.DESTROYED || (e1Var = (e1) getCoroutineContext().get(o7.x.f8328b)) == null) {
            return;
        }
        e1Var.c(null);
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, o7.a0
    public t6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        lifecycleOwner.getClass();
        event.getClass();
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            e1 e1Var = (e1) getCoroutineContext().get(o7.x.f8328b);
            if (e1Var != null) {
                e1Var.c(null);
            }
        }
    }

    public final void register() {
        v7.e eVar = m0.f8289a;
        c0.s(this, n.f10349a.f8469l, null, new AnonymousClass1(null), 2);
    }
}
