package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.room.RoomLambdaTrackingLiveData;
import d7.p;
import j$.time.Duration;
import o7.a0;
import o7.c0;
import o7.m0;
import o7.p1;
import p6.x;
import q7.r;
import q7.s;
import r7.k0;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class FlowLiveDataConversions {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends v6.i implements p {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
        @v6.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C00091 extends v6.i implements p {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(LiveData<T> liveData, Observer<T> observer, t6.c cVar) {
                super(2, cVar);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // v6.a
            public final t6.c create(Object obj, t6.c cVar) {
                return new C00091(this.$this_asFlow, this.$observer, cVar);
            }

            @Override // d7.p
            public final Object invoke(a0 a0Var, t6.c cVar) {
                return ((C00091) create(a0Var, cVar)).invokeSuspend(x.f8464a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // v6.a
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return x.f8464a;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
        @v6.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass2 extends v6.i implements p {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, t6.c cVar) {
                super(2, cVar);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // v6.a
            public final t6.c create(Object obj, t6.c cVar) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, cVar);
            }

            @Override // d7.p
            public final Object invoke(a0 a0Var, t6.c cVar) {
                return ((AnonymousClass2) create(a0Var, cVar)).invokeSuspend(x.f8464a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // v6.a
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return x.f8464a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<T> liveData, t6.c cVar) {
            super(2, cVar);
            this.$this_asFlow = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(s sVar, Object obj) {
            ((r) sVar).p(obj);
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // d7.p
        public final Object invoke(s sVar, t6.c cVar) {
            return ((AnonymousClass1) create(sVar, cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.Observer, int] */
        @Override // v6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            ?? r02 = this.label;
            u6.a aVar = u6.a.f10763a;
            try {
            } catch (Throwable th) {
                v7.e eVar = m0.f8289a;
                t6.h hVarPlus = n.f10349a.f8469l.plus(p1.f8299a);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r02, null);
                this.L$0 = th;
                this.label = 3;
                if (c0.C(anonymousClass2, hVarPlus, this) != aVar) {
                    throw th;
                }
            }
            if (r02 == 0) {
                p6.a.e(obj);
                final s sVar = (s) this.L$0;
                observer = new Observer() { // from class: androidx.lifecycle.e
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        FlowLiveDataConversions.AnonymousClass1.invokeSuspend$lambda$0(sVar, obj2);
                    }
                };
                v7.e eVar2 = m0.f8289a;
                p7.c cVar = n.f10349a.f8469l;
                C00091 c00091 = new C00091(this.$this_asFlow, observer, null);
                this.L$0 = observer;
                this.label = 1;
                if (c0.C(c00091, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (r02 != 1) {
                    if (r02 == 2) {
                        p6.a.e(obj);
                        throw new a1.b();
                    }
                    if (r02 != 3) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = (Throwable) this.L$0;
                    p6.a.e(obj);
                    throw th2;
                }
                observer = (Observer) this.L$0;
                p6.a.e(obj);
            }
            this.L$0 = observer;
            this.label = 2;
            c0.g(this);
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend", v = 1)
    public static final class C00531 extends v6.i implements p {
        final /* synthetic */ r7.h $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00531(r7.h hVar, t6.c cVar) {
            super(2, cVar);
            this.$this_asLiveData = hVar;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            C00531 c00531 = new C00531(this.$this_asLiveData, cVar);
            c00531.L$0 = obj;
            return c00531;
        }

        @Override // d7.p
        public final Object invoke(LiveDataScope<T> liveDataScope, t6.c cVar) {
            return ((C00531) create(liveDataScope, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                r7.h hVar = this.$this_asLiveData;
                r7.i iVar = new r7.i() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // r7.i
                    public final Object emit(T t9, t6.c cVar) {
                        Object objEmit = liveDataScope.emit(t9, cVar);
                        return objEmit == u6.a.f10763a ? objEmit : x.f8464a;
                    }
                };
                this.label = 1;
                Object objCollect = hVar.collect(iVar, this);
                u6.a aVar = u6.a.f10763a;
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
            return x.f8464a;
        }
    }

    public static final <T> r7.h asFlow(LiveData<T> liveData) {
        liveData.getClass();
        return k0.g(k0.e(new AnonymousClass1(liveData, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(r7.h hVar, t6.h hVar2, long j) {
        hVar.getClass();
        hVar2.getClass();
        RoomLambdaTrackingLiveData roomLambdaTrackingLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(hVar2, j, new C00531(hVar, null));
        if (hVar instanceof r7.m0) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                roomLambdaTrackingLiveData.setValue(((r7.m0) hVar).getValue());
                return roomLambdaTrackingLiveData;
            }
            roomLambdaTrackingLiveData.postValue(((r7.m0) hVar).getValue());
        }
        return roomLambdaTrackingLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(r7.h hVar, t6.h hVar2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar2 = t6.i.f10315a;
        }
        if ((i & 2) != 0) {
            j = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        }
        return asLiveData(hVar, hVar2, j);
    }

    public static /* synthetic */ LiveData asLiveData$default(r7.h hVar, Duration duration, t6.h hVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            hVar2 = t6.i.f10315a;
        }
        return asLiveData(hVar, duration, hVar2);
    }

    public static final <T> LiveData<T> asLiveData(r7.h hVar, t6.h hVar2) {
        hVar.getClass();
        hVar2.getClass();
        return asLiveData$default(hVar, hVar2, 0L, 2, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(r7.h hVar) {
        hVar.getClass();
        return asLiveData$default(hVar, (t6.h) null, 0L, 3, (Object) null);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(r7.h hVar, Duration duration, t6.h hVar2) {
        hVar.getClass();
        duration.getClass();
        hVar2.getClass();
        return asLiveData(hVar, hVar2, Api26Impl.INSTANCE.toMillis(duration));
    }
}
