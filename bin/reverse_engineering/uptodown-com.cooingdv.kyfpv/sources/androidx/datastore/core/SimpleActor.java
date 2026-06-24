package androidx.datastore.core;

import com.google.android.gms.internal.measurement.i5;
import d7.l;
import d7.p;
import j1.b;
import kotlin.jvm.internal.m;
import o7.a0;
import o7.c0;
import o7.e1;
import p6.x;
import q7.i;
import q7.j;
import q7.k;
import t6.c;
import v6.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor<T> {
    private final p consumeMessage;
    private final i messageQueue;
    private final AtomicInt remainingMessages;
    private final a0 scope;

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends v6.i implements p {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SimpleActor<T> simpleActor, c cVar) {
            super(2, cVar);
            this.this$0 = simpleActor;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass2(this.this$0, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, c cVar) {
            return ((AnonymousClass2) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r0.invoke(r6, r5) != r3) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[PHI: r0 r6
          0x0052: PHI (r0v1 d7.p) = (r0v2 d7.p), (r0v4 d7.p) binds: [B:14:0x004f, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x0052: PHI (r6v6 java.lang.Object) = (r6v14 java.lang.Object), (r6v0 java.lang.Object) binds: [B:14:0x004f, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:19:0x005e). Please report as a decompilation issue!!! */
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
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                p6.a.e(r6)
                goto L5e
            L10:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
            L15:
                r6 = 0
                return r6
            L17:
                java.lang.Object r0 = r5.L$0
                d7.p r0 = (d7.p) r0
                p6.a.e(r6)
                goto L52
            L1f:
                p6.a.e(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L6d
            L2e:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                o7.a0 r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
                t6.h r6 = r6.getCoroutineContext()
                o7.c0.k(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                d7.p r0 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                q7.i r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
                r5.L$0 = r0
                r5.label = r2
                java.lang.Object r6 = r6.l(r5)
                if (r6 != r3) goto L52
                goto L5d
            L52:
                r4 = 0
                r5.L$0 = r4
                r5.label = r1
                java.lang.Object r6 = r0.invoke(r6, r5)
                if (r6 != r3) goto L5e
            L5d:
                return r3
            L5e:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L2e
                p6.x r6 = p6.x.f8464a
                return r6
            L6d:
                java.lang.String r6 = "Check failed."
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SimpleActor(a0 a0Var, l lVar, p pVar, p pVar2) {
        a0Var.getClass();
        lVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        this.scope = a0Var;
        this.consumeMessage = pVar2;
        this.messageQueue = i5.a(Integer.MAX_VALUE, null, 6);
        this.remainingMessages = new AtomicInt(0);
        e1 e1Var = (e1) a0Var.getCoroutineContext().get(o7.x.f8328b);
        if (e1Var != null) {
            e1Var.h(new AnonymousClass1(lVar, this, pVar));
        }
    }

    public final void offer(T t9) {
        Object objP = this.messageQueue.p(t9);
        if (objP instanceof j) {
            Throwable th = ((j) objP).f8771a;
            if (th != null) {
                throw th;
            }
            throw new b("Channel was closed normally");
        }
        if (objP instanceof k) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Check failed.");
        } else if (this.remainingMessages.getAndIncrement() == 0) {
            c0.s(this.scope, null, null, new AnonymousClass2(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass1 extends m implements l {
        final /* synthetic */ l $onComplete;
        final /* synthetic */ p $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, SimpleActor<T> simpleActor, p pVar) {
            super(1);
            this.$onComplete = lVar;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = pVar;
        }

        public final void invoke(Throwable th) {
            x xVar;
            this.$onComplete.invoke(th);
            ((SimpleActor) this.this$0).messageQueue.m(th);
            do {
                Object objA = ((SimpleActor) this.this$0).messageQueue.a();
                xVar = null;
                if (objA instanceof k) {
                    objA = null;
                }
                if (objA != null) {
                    this.$onUndeliveredElement.invoke(objA, th);
                    xVar = x.f8464a;
                }
            } while (xVar != null);
        }

        @Override // d7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x.f8464a;
        }
    }
}
