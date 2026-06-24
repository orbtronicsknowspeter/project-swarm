package androidx.datastore.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.google.android.material.card.MaterialCardViewHelper;
import d7.p;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.v;
import o7.a0;
import o7.c0;
import o7.e1;
import o7.r;
import p6.f;
import p6.m;
import p6.x;
import q6.l;
import q6.t;
import r7.f0;
import r7.h;
import v6.c;
import v6.e;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl<T> implements DataStore<T> {
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;
    private e1 collectorJob;
    private final x7.a collectorMutex;
    private final f coordinator$delegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final h data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final a0 scope;
    private final Storage<T> storage;
    private final f storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public final class InitDataStore extends RunOnce {
        private List<? extends p> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends p> list) {
            list.getClass();
            this.this$0 = dataStoreImpl;
            this.initTasks = l.G0(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object doRun(t6.c r7) throws androidx.datastore.core.CorruptionException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                int r1 = r0.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3b
                if (r1 == r3) goto L33
                if (r1 != r2) goto L2c
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                p6.a.e(r7)
                goto L68
            L2c:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
                r7 = 0
                return r7
            L33:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                p6.a.e(r7)
                goto L7a
            L3b:
                p6.a.e(r7)
                java.util.List<? extends d7.p> r7 = r6.initTasks
                u6.a r1 = u6.a.f10763a
                if (r7 == 0) goto L6b
                r7.getClass()
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L4e
                goto L6b
            L4e:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r3 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r3.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r2
                java.lang.Object r7 = r7.lock(r3, r0)
                if (r7 != r1) goto L67
                goto L78
            L67:
                r0 = r6
            L68:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7c
            L6b:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r3
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L79
            L78:
                return r1
            L79:
                r0 = r6
            L7a:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7c:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                p6.x r7 = p6.x.f8464a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(t6.c):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DataStoreImpl<T> dataStoreImpl, t6.c cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {TypedValues.CycleType.TYPE_PATH_ROTATE}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements d7.l {
        final /* synthetic */ d7.l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d7.l lVar, t6.c cVar) {
            super(1, cVar);
            this.$block = lVar;
        }

        @Override // v6.a
        public final t6.c create(t6.c cVar) {
            return new AnonymousClass3(this.$block, cVar);
        }

        @Override // d7.l
        public final Object invoke(t6.c cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(x.f8464a);
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
            d7.l lVar = this.$block;
            this.label = 1;
            Object objInvoke = lVar.invoke(this);
            u6.a aVar = u6.a.f10763a;
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    public static final class C00331 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00331(DataStoreImpl<T> dataStoreImpl, t6.c cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    public static final class C00341 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00341(DataStoreImpl<T> dataStoreImpl, t6.c cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    public static final class C00351 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00351(DataStoreImpl<T> dataStoreImpl, t6.c cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    public static final class C00361 extends c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00361(DataStoreImpl<T> dataStoreImpl, t6.c cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION}, m = "invokeSuspend")
    public static final class C00373 extends i implements d7.l {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00373(DataStoreImpl<T> dataStoreImpl, t6.c cVar) {
            super(1, cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // v6.a
        public final t6.c create(t6.c cVar) {
            return new C00373(this.this$0, cVar);
        }

        @Override // d7.l
        public final Object invoke(t6.c cVar) {
            return ((C00373) create(cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            if (r5 != r3) goto L22;
         */
        @Override // v6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                int r0 = r4.label
                r1 = 2
                r2 = 1
                u6.a r3 = u6.a.f10763a
                if (r0 == 0) goto L22
                if (r0 == r2) goto L1b
                if (r0 != r1) goto L14
                java.lang.Object r0 = r4.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                p6.a.e(r5)
                goto L44
            L14:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
                r5 = 0
                return r5
            L1b:
                p6.a.e(r5)     // Catch: java.lang.Throwable -> L1f
                goto L30
            L1f:
                r5 = move-exception
                r0 = r5
                goto L33
            L22:
                p6.a.e(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1f
                r4.label = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r5, r2, r4)     // Catch: java.lang.Throwable -> L1f
                if (r5 != r3) goto L30
                goto L43
            L30:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5     // Catch: java.lang.Throwable -> L1f
                goto L50
            L33:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.InterProcessCoordinator r5 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r5)
                r4.L$0 = r0
                r4.label = r1
                java.lang.Object r5 = r5.getVersion(r4)
                if (r5 != r3) goto L44
            L43:
                return r3
            L44:
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
                r1.<init>(r0, r5)
                r5 = r1
            L50:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                p6.i r1 = new p6.i
                r1.<init>(r5, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C00373.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    public static final class C00381 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00381(DataStoreImpl<T> dataStoreImpl, t6.c cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    public static final class C00393 extends i implements d7.l {
        final /* synthetic */ kotlin.jvm.internal.x $newData;
        final /* synthetic */ v $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00393(kotlin.jvm.internal.x xVar, DataStoreImpl<T> dataStoreImpl, v vVar, t6.c cVar) {
            super(1, cVar);
            this.$newData = xVar;
            this.this$0 = dataStoreImpl;
            this.$version = vVar;
        }

        @Override // v6.a
        public final t6.c create(t6.c cVar) {
            return new C00393(this.$newData, this.this$0, this.$version, cVar);
        }

        @Override // d7.l
        public final Object invoke(t6.c cVar) {
            return ((C00393) create(cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        
            if (r6 != r4) goto L28;
         */
        @Override // v6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 3
                r2 = 2
                r3 = 1
                u6.a r4 = u6.a.f10763a
                if (r0 == 0) goto L2e
                if (r0 == r3) goto L26
                if (r0 == r2) goto L1e
                if (r0 != r1) goto L17
                java.lang.Object r0 = r5.L$0
                kotlin.jvm.internal.v r0 = (kotlin.jvm.internal.v) r0
                p6.a.e(r6)
                goto L71
            L17:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
                r6 = 0
                return r6
            L1e:
                java.lang.Object r0 = r5.L$0
                kotlin.jvm.internal.v r0 = (kotlin.jvm.internal.v) r0
                p6.a.e(r6)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                goto L55
            L26:
                java.lang.Object r0 = r5.L$0
                kotlin.jvm.internal.x r0 = (kotlin.jvm.internal.x) r0
                p6.a.e(r6)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                goto L40
            L2e:
                p6.a.e(r6)
                kotlin.jvm.internal.x r0 = r5.$newData     // Catch: androidx.datastore.core.CorruptionException -> L5e
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r5.L$0 = r0     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r5.label = r3     // Catch: androidx.datastore.core.CorruptionException -> L5e
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                if (r6 != r4) goto L40
                goto L70
            L40:
                r0.f7025a = r6     // Catch: androidx.datastore.core.CorruptionException -> L5e
                kotlin.jvm.internal.v r0 = r5.$version     // Catch: androidx.datastore.core.CorruptionException -> L5e
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0     // Catch: androidx.datastore.core.CorruptionException -> L5e
                androidx.datastore.core.InterProcessCoordinator r6 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r6)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r5.L$0 = r0     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r5.label = r2     // Catch: androidx.datastore.core.CorruptionException -> L5e
                java.lang.Object r6 = r6.getVersion(r5)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                if (r6 != r4) goto L55
                goto L70
            L55:
                java.lang.Number r6 = (java.lang.Number) r6     // Catch: androidx.datastore.core.CorruptionException -> L5e
                int r6 = r6.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r0.f7023a = r6     // Catch: androidx.datastore.core.CorruptionException -> L5e
                goto L79
            L5e:
                kotlin.jvm.internal.v r0 = r5.$version
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                kotlin.jvm.internal.x r2 = r5.$newData
                java.lang.Object r2 = r2.f7025a
                r5.L$0 = r0
                r5.label = r1
                java.lang.Object r6 = r6.writeData$datastore_core_release(r2, r3, r5)
                if (r6 != r4) goto L71
            L70:
                return r4
            L71:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r0.f7023a = r6
            L79:
                p6.x r6 = p6.x.f8464a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C00393.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    public static final class C00402 extends i implements p {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00402(DataStoreImpl<T> dataStoreImpl, boolean z9, t6.c cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z9;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return new C00402(this.this$0, this.$requireLock, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((C00402) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            if (r5 == r3) goto L22;
         */
        @Override // v6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                int r0 = r4.label
                r1 = 2
                r2 = 1
                u6.a r3 = u6.a.f10763a
                if (r0 == 0) goto L1d
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                p6.a.e(r5)
                goto L4f
            L10:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
                r5 = 0
                return r5
            L17:
                p6.a.e(r5)     // Catch: java.lang.Throwable -> L1b
                goto L42
            L1b:
                r5 = move-exception
                goto L52
            L1d:
                p6.a.e(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                boolean r5 = r5 instanceof androidx.datastore.core.Final
                androidx.datastore.core.DataStoreImpl<T> r0 = r4.this$0
                if (r5 == 0) goto L39
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                return r5
            L39:
                r4.label = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r0, r4)     // Catch: java.lang.Throwable -> L1b
                if (r5 != r3) goto L42
                goto L4e
            L42:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                boolean r0 = r4.$requireLock
                r4.label = r1
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r0, r4)
                if (r5 != r3) goto L4f
            L4e:
                return r3
            L4f:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                return r5
            L52:
                androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C00402.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    public static final class C00412 extends i implements d7.l {
        final /* synthetic */ t6.h $callerContext;
        final /* synthetic */ p $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00412(DataStoreImpl<T> dataStoreImpl, t6.h hVar, p pVar, t6.c cVar) {
            super(1, cVar);
            this.this$0 = dataStoreImpl;
            this.$callerContext = hVar;
            this.$transform = pVar;
        }

        @Override // v6.a
        public final t6.c create(t6.c cVar) {
            return new C00412(this.this$0, this.$callerContext, this.$transform, cVar);
        }

        @Override // d7.l
        public final Object invoke(t6.c cVar) {
            return ((C00412) create(cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
        @Override // v6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 3
                r2 = 2
                r3 = 1
                u6.a r4 = u6.a.f10763a
                if (r0 == 0) goto L28
                if (r0 == r3) goto L24
                if (r0 == r2) goto L1c
                if (r0 != r1) goto L15
                java.lang.Object r0 = r8.L$0
                p6.a.e(r9)
                return r0
            L15:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r9)
                r9 = 0
                return r9
            L1c:
                java.lang.Object r0 = r8.L$0
                androidx.datastore.core.Data r0 = (androidx.datastore.core.Data) r0
                p6.a.e(r9)
                goto L4e
            L24:
                p6.a.e(r9)
                goto L36
            L28:
                p6.a.e(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                r8.label = r3
                java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r3, r8)
                if (r9 != r4) goto L36
                goto L67
            L36:
                r0 = r9
                androidx.datastore.core.Data r0 = (androidx.datastore.core.Data) r0
                t6.h r9 = r8.$callerContext
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
                d7.p r6 = r8.$transform
                r7 = 0
                r5.<init>(r6, r0, r7)
                r8.L$0 = r0
                r8.label = r2
                java.lang.Object r9 = o7.c0.C(r5, r9, r8)
                if (r9 != r4) goto L4e
                goto L67
            L4e:
                r0.checkHashCode()
                java.lang.Object r0 = r0.getValue()
                boolean r0 = kotlin.jvm.internal.l.a(r0, r9)
                if (r0 != 0) goto L68
                androidx.datastore.core.DataStoreImpl<T> r0 = r8.this$0
                r8.L$0 = r9
                r8.label = r1
                java.lang.Object r0 = r0.writeData$datastore_core_release(r9, r3, r8)
                if (r0 != r4) goto L68
            L67:
                return r4
            L68:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C00412.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class C00422 extends i implements p {
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00422(DataStoreImpl<T> dataStoreImpl, p pVar, t6.c cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$transform = pVar;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            C00422 c00422 = new C00422(this.this$0, this.$transform, cVar);
            c00422.L$0 = obj;
            return c00422;
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((C00422) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
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
            a0 a0Var = (a0) this.L$0;
            r rVarA = c0.a();
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, rVarA, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), a0Var.getCoroutineContext()));
            this.label = 1;
            Object objW = rVarA.w(this);
            u6.a aVar = u6.a.f10763a;
            return objW == aVar ? aVar : objW;
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends p> list, CorruptionHandler<T> corruptionHandler, a0 a0Var) {
        storage.getClass();
        list.getClass();
        corruptionHandler.getClass();
        a0Var.getClass();
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = a0Var;
        this.data = new f0(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = x7.h.a();
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, list);
        this.storageConnectionDelegate = new m(new DataStoreImpl$storageConnectionDelegate$1(this));
        this.coordinator$delegate = new m(new DataStoreImpl$coordinator$2(this));
        this.writeActor = new SimpleActor<>(a0Var, new DataStoreImpl$writeActor$1(this), DataStoreImpl$writeActor$2.INSTANCE, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decrementCollector(t6.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.DataStoreImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r1 = r0.L$1
            x7.a r1 = (x7.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            p6.a.e(r5)
            goto L4a
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            r5 = 0
            return r5
        L35:
            p6.a.e(r5)
            x7.a r1 = r4.collectorMutex
            r0.L$0 = r4
            r0.L$1 = r1
            r0.label = r2
            java.lang.Object r5 = r1.lock(r3, r0)
            u6.a r0 = u6.a.f10763a
            if (r5 != r0) goto L49
            return r0
        L49:
            r0 = r4
        L4a:
            int r5 = r0.collectorCounter     // Catch: java.lang.Throwable -> L5a
            int r5 = r5 + (-1)
            r0.collectorCounter = r5     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L5e
            o7.e1 r5 = r0.collectorJob     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L5c
            r5.c(r3)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r5 = move-exception
            goto L64
        L5c:
            r0.collectorJob = r3     // Catch: java.lang.Throwable -> L5a
        L5e:
            r1.unlock(r3)
            p6.x r5 = p6.x.f8464a
            return r5
        L64:
            r1.unlock(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.decrementCollector(t6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z9, d7.l lVar, t6.c cVar) {
        return z9 ? lVar.invoke(cVar) : getCoordinator().lock(new AnonymousClass3(lVar, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r9 != r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, t6.c r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, t6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementCollector(t6.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C00341
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C00341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r1 = r0.L$1
            x7.a r1 = (x7.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            p6.a.e(r6)
            goto L4a
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
            r6 = 0
            return r6
        L35:
            p6.a.e(r6)
            x7.a r1 = r5.collectorMutex
            r0.L$0 = r5
            r0.L$1 = r1
            r0.label = r2
            java.lang.Object r6 = r1.lock(r3, r0)
            u6.a r0 = u6.a.f10763a
            if (r6 != r0) goto L49
            return r0
        L49:
            r0 = r5
        L4a:
            int r6 = r0.collectorCounter     // Catch: java.lang.Throwable -> L60
            int r6 = r6 + r2
            r0.collectorCounter = r6     // Catch: java.lang.Throwable -> L60
            if (r6 != r2) goto L62
            o7.a0 r6 = r0.scope     // Catch: java.lang.Throwable -> L60
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r2 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L60
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L60
            r4 = 3
            o7.s1 r6 = o7.c0.s(r6, r3, r3, r2, r4)     // Catch: java.lang.Throwable -> L60
            r0.collectorJob = r6     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r6 = move-exception
            goto L68
        L62:
            r1.unlock(r3)
            p6.x r6 = p6.x.f8464a
            return r6
        L68:
            r1.unlock(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.incrementCollector(t6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r3.runIfNeeded(r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(t6.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl.C00351
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl.C00351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            u6.a r4 = u6.a.f10763a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L32
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            p6.a.e(r7)     // Catch: java.lang.Throwable -> L30
            goto L69
        L30:
            r7 = move-exception
            goto L71
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
            r7 = 0
            return r7
        L39:
            java.lang.Object r1 = r0.L$0
            androidx.datastore.core.DataStoreImpl r1 = (androidx.datastore.core.DataStoreImpl) r1
            p6.a.e(r7)
            goto L54
        L41:
            p6.a.e(r7)
            androidx.datastore.core.InterProcessCoordinator r7 = r6.getCoordinator()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.getVersion(r0)
            if (r7 != r4) goto L53
            goto L68
        L53:
            r1 = r6
        L54:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r3 = r1.readAndInit     // Catch: java.lang.Throwable -> L6c
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L6c
            r0.I$0 = r7     // Catch: java.lang.Throwable -> L6c
            r0.label = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r3.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6c
            if (r7 != r4) goto L69
        L68:
            return r4
        L69:
            p6.x r7 = p6.x.f8464a
            return r7
        L6c:
            r0 = move-exception
            r5 = r1
            r1 = r7
            r7 = r0
            r0 = r5
        L71:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r7, r1)
            r0.tryUpdate(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(t6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r11 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if (r11 == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, t6.c r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, t6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(t6.c cVar) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r10, t6.c r11) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, t6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z9, t6.c cVar) {
        return c0.C(new C00402(this, z9, null), this.scope.getCoroutineContext(), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(p pVar, t6.h hVar, t6.c cVar) {
        return getCoordinator().lock(new C00412(this, hVar, pVar, null), cVar);
    }

    @Override // androidx.datastore.core.DataStore
    public h getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(p pVar, t6.c cVar) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) cVar.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return c0.C(new C00422(this, pVar, null), new UpdatingDataContextElement(updatingDataContextElement, this), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeData$datastore_core_release(T r10, boolean r11, t6.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r10 = r0.L$0
            kotlin.jvm.internal.v r10 = (kotlin.jvm.internal.v) r10
            p6.a.e(r12)
            goto L53
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r10)
            r10 = 0
            return r10
        L30:
            p6.a.e(r12)
            kotlin.jvm.internal.v r4 = new kotlin.jvm.internal.v
            r4.<init>()
            androidx.datastore.core.StorageConnection r12 = r9.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r3 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r10 = r12.writeScope(r3, r0)
            u6.a r11 = u6.a.f10763a
            if (r10 != r11) goto L52
            return r11
        L52:
            r10 = r4
        L53:
            int r10 = r10.f7023a
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core_release(java.lang.Object, boolean, t6.c):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements p {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(DataStoreImpl<T> dataStoreImpl, int i, t6.c cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$cachedVersion, cVar);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        public final Object invoke(boolean z9, t6.c cVar) {
            return ((AnonymousClass4) create(Boolean.valueOf(z9), cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v7 */
        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int iIntValue;
            State readException;
            boolean z9;
            ?? r02;
            ?? r03;
            boolean z10 = this.label;
            u6.a aVar = u6.a.f10763a;
            try {
            } catch (Throwable th2) {
                if (z10 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th2;
                    this.Z$0 = z10;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != aVar) {
                        th = th2;
                        obj = version;
                        r03 = z10;
                    }
                    return aVar;
                }
                th = th2;
                iIntValue = this.$cachedVersion;
                r02 = z10;
            }
            if (z10 == 0) {
                p6.a.e(obj);
                boolean z11 = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z11;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(z11, this);
                z10 = z11;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (z10 != 1) {
                    if (z10 != 2) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z12 = this.Z$0;
                    th = (Throwable) this.L$0;
                    p6.a.e(obj);
                    r03 = z12;
                    iIntValue = ((Number) obj).intValue();
                    r02 = r03;
                    readException = new ReadException(th, iIntValue);
                    z9 = r02;
                    return new p6.i(readException, Boolean.valueOf(z9));
                }
                boolean z13 = this.Z$0;
                p6.a.e(obj);
                z10 = z13;
            }
            readException = (State) obj;
            z9 = z10;
            return new p6.i(readException, Boolean.valueOf(z9));
        }

        @Override // d7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (t6.c) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DataStoreImpl<T> dataStoreImpl, int i, t6.c cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$preLockVersion, cVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public final Object invoke(boolean z9, t6.c cVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z9), cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        @Override // v6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 2
                r2 = 1
                u6.a r3 = u6.a.f10763a
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L19
                if (r0 != r1) goto L12
                java.lang.Object r0 = r5.L$0
                p6.a.e(r6)
                goto L47
            L12:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
                r6 = 0
                return r6
            L19:
                boolean r0 = r5.Z$0
                p6.a.e(r6)
                goto L31
            L1f:
                p6.a.e(r6)
                boolean r0 = r5.Z$0
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                r5.Z$0 = r0
                r5.label = r2
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)
                if (r6 != r3) goto L31
                goto L43
            L31:
                if (r0 == 0) goto L4e
                androidx.datastore.core.DataStoreImpl<T> r0 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r0 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r0)
                r5.L$0 = r6
                r5.label = r1
                java.lang.Object r0 = r0.getVersion(r5)
                if (r0 != r3) goto L44
            L43:
                return r3
            L44:
                r4 = r0
                r0 = r6
                r6 = r4
            L47:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L53
            L4e:
                int r0 = r5.$preLockVersion
                r4 = r0
                r0 = r6
                r6 = r4
            L53:
                androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
                if (r0 == 0) goto L5c
                int r2 = r0.hashCode()
                goto L5d
            L5c:
                r2 = 0
            L5d:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // d7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (t6.c) obj2);
        }
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, a0 a0Var, int i, g gVar) {
        this(storage, (i & 2) != 0 ? t.f8725a : list, (i & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i & 8) != 0 ? c0.b(Actual_jvmKt.ioDispatcher().plus(c0.d())) : a0Var);
    }
}
