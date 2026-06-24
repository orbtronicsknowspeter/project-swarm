package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import d7.p;
import j$.time.Duration;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.x;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    /* JADX INFO: renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends v6.i implements p {
        final /* synthetic */ LiveData<T> $source;
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, t6.c cVar) {
            super(2, cVar);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x invokeSuspend$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return x.f8463a;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return new AnonymousClass2(this.$this_addDisposableSource, this.$source, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass2) create(a0Var, cVar)).invokeSuspend(x.f8463a);
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
            MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new c(mediatorLiveData, 0)));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, t6.c cVar) {
        v7.e eVar = m0.f8288a;
        return c0.C(new AnonymousClass2(mediatorLiveData, liveData, null), n.f10348a.f8468l, cVar);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration duration, t6.h hVar, p pVar) {
        duration.getClass();
        hVar.getClass();
        pVar.getClass();
        return new CoroutineLiveData(hVar, Api26Impl.INSTANCE.toMillis(duration), pVar);
    }

    public static /* synthetic */ LiveData liveData$default(t6.h hVar, long j, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = t6.i.f10314a;
        }
        if ((i & 2) != 0) {
            j = DEFAULT_TIMEOUT;
        }
        return liveData(hVar, j, pVar);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, t6.h hVar, p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            hVar = t6.i.f10314a;
        }
        return liveData(duration, hVar, pVar);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration duration, p pVar) {
        duration.getClass();
        pVar.getClass();
        return liveData$default(duration, (t6.h) null, pVar, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(t6.h hVar, p pVar) {
        hVar.getClass();
        pVar.getClass();
        return liveData$default(hVar, 0L, pVar, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(t6.h hVar, long j, p pVar) {
        hVar.getClass();
        pVar.getClass();
        return new CoroutineLiveData(hVar, j, pVar);
    }

    public static final <T> LiveData<T> liveData(p pVar) {
        pVar.getClass();
        return liveData$default((t6.h) null, 0L, pVar, 3, (Object) null);
    }
}
