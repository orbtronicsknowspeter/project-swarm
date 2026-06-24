package x7;

import f8.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o7.c2;
import p6.x;
import t7.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11533l = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11534m = AtomicLongFieldUpdater.newUpdater(l.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11535n = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11536o = AtomicLongFieldUpdater.newUpdater(l.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11537p = AtomicIntegerFieldUpdater.newUpdater(l.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.k f11539b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public l(int i, int i6) {
        this.f11538a = i;
        if (i <= 0) {
            s1.o.o(androidx.lifecycle.l.u(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i6 < 0 || i6 > i) {
            s1.o.o(androidx.lifecycle.l.u(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        o oVar = new o(0L, null, 2);
        this.head$volatile = oVar;
        this.tail$volatile = oVar;
        this._availablePermits$volatile = i - i6;
        this.f11539b = new o7.k(this, 2);
    }

    public final boolean a(c2 c2Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11535n;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f11536o.getAndIncrement(this);
        j jVar = j.f11531a;
        long j = andIncrement / ((long) n.f);
        loop0: while (true) {
            objB = t7.a.b(oVar, j, jVar);
            if (!t7.a.e(objB)) {
                s sVarC = t7.a.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f10356c >= sVarC.f10356c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        o oVar2 = (o) t7.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = oVar2.f11545e;
        int i = (int) (andIncrement % ((long) n.f));
        while (!atomicReferenceArray.compareAndSet(i, null, c2Var)) {
            if (atomicReferenceArray.get(i) != null) {
                w wVar = n.f11541b;
                w wVar2 = n.f11542c;
                while (!atomicReferenceArray.compareAndSet(i, wVar, wVar2)) {
                    if (atomicReferenceArray.get(i) != wVar) {
                        return false;
                    }
                }
                boolean z9 = c2Var instanceof o7.j;
                x xVar = x.f8464a;
                if (z9) {
                    ((o7.j) c2Var).g(xVar, this.f11539b);
                    return true;
                }
                if (c2Var instanceof d) {
                    ((d) c2Var).b(xVar);
                    return true;
                }
                com.google.gson.internal.a.m(c2Var, "unexpected: ");
                return false;
            }
        }
        c2Var.a(oVar2, i);
        return true;
    }

    public final void b() {
        int i;
        Object objB;
        boolean zC;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11537p;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i6 = this.f11538a;
            if (andIncrement >= i6) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i6) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i6));
                s1.o.h(i6, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11533l;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f11534m.getAndIncrement(this);
            long j = andIncrement2 / ((long) n.f);
            k kVar = k.f11532a;
            while (true) {
                objB = t7.a.b(oVar, j, kVar);
                if (t7.a.e(objB)) {
                    break;
                }
                s sVarC = t7.a.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f10356c >= sVarC.f10356c) {
                        break;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            }
            o oVar2 = (o) t7.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = oVar2.f11545e;
            oVar2.b();
            zC = false;
            if (oVar2.f10356c <= j) {
                int i10 = (int) (andIncrement2 % ((long) n.f));
                Object andSet = atomicReferenceArray.getAndSet(i10, n.f11541b);
                if (andSet == null) {
                    int i11 = n.f11540a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (atomicReferenceArray.get(i10) == n.f11542c) {
                            zC = true;
                            break;
                        }
                    }
                    w wVar = n.f11541b;
                    w wVar2 = n.f11543d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i10, wVar, wVar2)) {
                            if (atomicReferenceArray.get(i10) != wVar) {
                                break;
                            }
                        } else {
                            zC = true;
                            break;
                        }
                    }
                    zC = !zC;
                } else if (andSet != n.f11544e) {
                    boolean z9 = andSet instanceof o7.j;
                    x xVar = x.f8464a;
                    if (z9) {
                        o7.j jVar = (o7.j) andSet;
                        w wVarI = jVar.i(xVar, this.f11539b);
                        if (wVarI != null) {
                            jVar.q(wVarI);
                            zC = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof d)) {
                            com.google.gson.internal.a.m(andSet, "unexpected: ");
                            return;
                        }
                        zC = ((d) andSet).c(this, xVar);
                    }
                }
            }
        } while (!zC);
    }
}
