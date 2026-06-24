package s7;

import c4.d4;
import c4.j1;
import d7.q;
import o7.c0;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends v6.c implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.i f9371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6.h f9372b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t6.h f9374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t6.c f9375n;

    public l(r7.i iVar, t6.h hVar) {
        super(j.f9369a, t6.i.f10315a);
        this.f9371a = iVar;
        this.f9372b = hVar;
        this.f9373l = ((Number) hVar.fold(0, new j1(12))).intValue();
    }

    public final Object a(t6.c cVar, Object obj) {
        t6.h context = cVar.getContext();
        c0.k(context);
        t6.h hVar = this.f9374m;
        if (hVar != context) {
            if (hVar instanceof h) {
                throw new IllegalStateException(l7.n.d0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((h) hVar).f9368b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new d4(this, 4))).intValue() != this.f9373l) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f9372b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f9374m = context;
        }
        this.f9375n = cVar;
        q qVar = n.f9377a;
        r7.i iVar = this.f9371a;
        iVar.getClass();
        Object objInvoke = qVar.invoke(iVar, obj, this);
        if (!kotlin.jvm.internal.l.a(objInvoke, u6.a.f10763a)) {
            this.f9375n = null;
        }
        return objInvoke;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        try {
            Object objA = a(cVar, obj);
            return objA == u6.a.f10763a ? objA : x.f8464a;
        } catch (Throwable th) {
            this.f9374m = new h(th, cVar.getContext());
            throw th;
        }
    }

    @Override // v6.a, v6.d
    public final v6.d getCallerFrame() {
        t6.c cVar = this.f9375n;
        if (cVar instanceof v6.d) {
            return (v6.d) cVar;
        }
        return null;
    }

    @Override // v6.c, t6.c
    public final t6.h getContext() {
        t6.h hVar = this.f9374m;
        return hVar == null ? t6.i.f10315a : hVar;
    }

    @Override // v6.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = p6.k.a(obj);
        if (thA != null) {
            this.f9374m = new h(thA, getContext());
        }
        t6.c cVar = this.f9375n;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return u6.a.f10763a;
    }
}
