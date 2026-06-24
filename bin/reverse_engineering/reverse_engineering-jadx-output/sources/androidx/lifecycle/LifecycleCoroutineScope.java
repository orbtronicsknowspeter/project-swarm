package androidx.lifecycle;

import androidx.appcompat.app.AppCompatDelegate;
import d7.p;
import o7.a0;
import o7.c0;
import o7.e1;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements a0 {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", l = {68}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends v6.i implements p {
        final /* synthetic */ p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, t6.c cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return LifecycleCoroutineScope.this.new AnonymousClass1(this.$block, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass1) create(a0Var, cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                p pVar = this.$block;
                this.label = 1;
                Object objWhenCreated = PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, pVar, this);
                u6.a aVar = u6.a.f10762a;
                if (objWhenCreated == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            return x.f8463a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", v = 1)
    public static final class C00541 extends v6.i implements p {
        final /* synthetic */ p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00541(p pVar, t6.c cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return LifecycleCoroutineScope.this.new C00541(this.$block, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((C00541) create(a0Var, cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                p pVar = this.$block;
                this.label = 1;
                Object objWhenResumed = PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, pVar, this);
                u6.a aVar = u6.a.f10762a;
                if (objWhenResumed == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            return x.f8463a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", l = {88}, m = "invokeSuspend", v = 1)
    public static final class C00551 extends v6.i implements p {
        final /* synthetic */ p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00551(p pVar, t6.c cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return LifecycleCoroutineScope.this.new C00551(this.$block, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((C00551) create(a0Var, cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                p pVar = this.$block;
                this.label = 1;
                Object objWhenStarted = PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, pVar, this);
                u6.a aVar = u6.a.f10762a;
                if (objWhenStarted == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            return x.f8463a;
        }
    }

    @Override // o7.a0
    public abstract /* synthetic */ t6.h getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final e1 launchWhenCreated(p pVar) {
        pVar.getClass();
        return c0.s(this, null, null, new AnonymousClass1(pVar, null), 3);
    }

    public final e1 launchWhenResumed(p pVar) {
        pVar.getClass();
        return c0.s(this, null, null, new C00541(pVar, null), 3);
    }

    public final e1 launchWhenStarted(p pVar) {
        pVar.getClass();
        return c0.s(this, null, null, new C00551(pVar, null), 3);
    }
}
