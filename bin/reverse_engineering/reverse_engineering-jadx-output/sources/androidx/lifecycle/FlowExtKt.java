package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import d7.p;
import o7.a0;
import p6.x;
import q7.r;
import q7.s;
import r7.k0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends v6.i implements p {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ r7.h $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
        @v6.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
        public static final class C00071 extends v6.i implements p {
            final /* synthetic */ s $$this$callbackFlow;
            final /* synthetic */ r7.h $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(r7.h hVar, s sVar, t6.c cVar) {
                super(2, cVar);
                this.$this_flowWithLifecycle = hVar;
                this.$$this$callbackFlow = sVar;
            }

            @Override // v6.a
            public final t6.c create(Object obj, t6.c cVar) {
                return new C00071(this.$this_flowWithLifecycle, this.$$this$callbackFlow, cVar);
            }

            @Override // d7.p
            public final Object invoke(a0 a0Var, t6.c cVar) {
                return ((C00071) create(a0Var, cVar)).invokeSuspend(x.f8463a);
            }

            @Override // v6.a
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    p6.a.e(obj);
                    r7.h hVar = this.$this_flowWithLifecycle;
                    final s sVar = this.$$this$callbackFlow;
                    r7.i iVar = new r7.i() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // r7.i
                        public final Object emit(T t9, t6.c cVar) {
                            Object objE = ((r) sVar).f8779m.e(t9, cVar);
                            return objE == u6.a.f10762a ? objE : x.f8463a;
                        }
                    };
                    this.label = 1;
                    Object objCollect = hVar.collect(iVar, this);
                    u6.a aVar = u6.a.f10762a;
                    if (objCollect == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, r7.h hVar, t6.c cVar) {
            super(2, cVar);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = hVar;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // d7.p
        public final Object invoke(s sVar, t6.c cVar) {
            return ((AnonymousClass1) create(sVar, cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            s sVar;
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                sVar = (s) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C00071 c00071 = new C00071(this.$this_flowWithLifecycle, sVar, null);
                this.L$0 = sVar;
                this.label = 1;
                Object objRepeatOnLifecycle = RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c00071, this);
                u6.a aVar = u6.a.f10762a;
                if (objRepeatOnLifecycle == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sVar = (s) this.L$0;
                p6.a.e(obj);
            }
            ((r) sVar).m(null);
            return x.f8463a;
        }
    }

    public static final <T> r7.h flowWithLifecycle(r7.h hVar, Lifecycle lifecycle, Lifecycle.State state) {
        hVar.getClass();
        lifecycle.getClass();
        state.getClass();
        return k0.e(new AnonymousClass1(lifecycle, state, hVar, null));
    }

    public static /* synthetic */ r7.h flowWithLifecycle$default(r7.h hVar, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(hVar, lifecycle, state);
    }
}
