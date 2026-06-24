package x7;

import d7.q;
import f8.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o7.c2;
import p6.x;
import t7.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements o7.j, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.l f11520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11521b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f11522l;

    public c(g gVar, o7.l lVar, Object obj) {
        this.f11522l = gVar;
        this.f11520a = lVar;
        this.f11521b = obj;
    }

    @Override // o7.c2
    public final void a(s sVar, int i) {
        this.f11520a.a(sVar, i);
    }

    @Override // o7.j
    public final void g(Object obj, q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f11528q;
        Object obj2 = this.f11521b;
        g gVar = this.f11522l;
        atomicReferenceFieldUpdater.set(gVar, obj2);
        this.f11520a.A(new androidx.work.impl.model.a(11, gVar, this), x.f8464a);
    }

    @Override // t6.c
    public final t6.h getContext() {
        return this.f11520a.f8282n;
    }

    @Override // o7.j
    public final w i(Object obj, q qVar) {
        g gVar = this.f11522l;
        b bVar = new b(gVar, this, 1);
        w wVarE = this.f11520a.E((x) obj, bVar);
        if (wVarE != null) {
            g.f11528q.set(gVar, this.f11521b);
        }
        return wVarE;
    }

    @Override // o7.j
    public final boolean o(Throwable th) {
        return this.f11520a.o(th);
    }

    @Override // o7.j
    public final void q(Object obj) {
        this.f11520a.q(obj);
    }

    @Override // t6.c
    public final void resumeWith(Object obj) {
        this.f11520a.resumeWith(obj);
    }
}
