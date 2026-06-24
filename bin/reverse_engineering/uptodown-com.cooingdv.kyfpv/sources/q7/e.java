package q7;

import a4.x;
import androidx.core.location.LocationRequestCompat;
import f8.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.a0;
import o7.c0;
import o7.c2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class e implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8743b = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8744l = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8745m = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8746n = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8747o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8748p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8749q = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8750r = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8751s = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8752a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i) {
        this.f8752a = i;
        if (i < 0) {
            s1.o.o(x.g(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        m mVar = g.f8754a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : LocationRequestCompat.PASSIVE_INTERVAL : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f8745m.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (z()) {
            mVar2 = g.f8754a;
            mVar2.getClass();
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f8767s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object C(q7.e r13, v6.c r14) {
        /*
            boolean r0 = r14 instanceof q7.c
            if (r0 == 0) goto L14
            r0 = r14
            q7.c r0 = (q7.c) r0
            int r1 = r0.f8739l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8739l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            q7.c r0 = new q7.c
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f8737a
            int r0 = r6.f8739l
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            p6.a.e(r14)
            q7.l r14 = (q7.l) r14
            java.lang.Object r13 = r14.f8773a
            return r13
        L2b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r13)
            r13 = 0
            return r13
        L32:
            p6.a.e(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = q7.e.f8748p
            java.lang.Object r14 = r14.get(r13)
            q7.m r14 = (q7.m) r14
        L3d:
            boolean r0 = r13.w()
            if (r0 == 0) goto L4d
            java.lang.Throwable r13 = r13.q()
            q7.j r14 = new q7.j
            r14.<init>(r13)
            return r14
        L4d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = q7.e.f8744l
            long r4 = r0.getAndIncrement(r13)
            int r0 = q7.g.f8755b
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.f10356c
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6a
            q7.m r0 = r13.o(r7, r14)
            if (r0 != 0) goto L68
            goto L3d
        L68:
            r2 = r0
            goto L6b
        L6a:
            r2 = r14
        L6b:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.H(r8, r9, r10, r12)
            f8.w r14 = q7.g.f8761m
            if (r13 == r14) goto L9f
            f8.w r14 = q7.g.f8763o
            if (r13 != r14) goto L8a
            long r13 = r7.t()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L87
            r2.b()
        L87:
            r14 = r2
            r13 = r7
            goto L3d
        L8a:
            f8.w r14 = q7.g.f8762n
            if (r13 != r14) goto L9b
            r6.f8739l = r1
            r1 = r7
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            u6.a r14 = u6.a.f10763a
            if (r13 != r14) goto L9a
            return r14
        L9a:
            return r13
        L9b:
            r2.b()
            return r13
        L9f:
            java.lang.String r13 = "unexpected"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r13)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.C(q7.e, v6.c):java.lang.Object");
    }

    public static boolean G(Object obj) {
        if (obj instanceof o7.j) {
            return g.a((o7.j) obj, p6.x.f8464a, null);
        }
        if (obj instanceof x7.d) {
            com.google.gson.internal.a.o();
            return false;
        }
        com.google.gson.internal.a.m(obj, "Unexpected waiter: ");
        return false;
    }

    public static final m b(e eVar, long j, m mVar) {
        Object objB;
        e eVar2;
        m mVar2 = g.f8754a;
        f fVar = f.f8753a;
        loop0: while (true) {
            objB = t7.a.b(mVar, j, fVar);
            if (!t7.a.e(objB)) {
                t7.s sVarC = t7.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8747o;
                    t7.s sVar = (t7.s) atomicReferenceFieldUpdater.get(eVar);
                    if (sVar.f10356c >= sVarC.f10356c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != sVar) {
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
        boolean zE = t7.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8744l;
        if (zE) {
            eVar.x();
            if (mVar.f10356c * ((long) g.f8755b) < atomicLongFieldUpdater.get(eVar)) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) t7.a.c(objB);
            long j6 = mVar3.f10356c;
            if (j6 <= j) {
                return mVar3;
            }
            long j10 = ((long) g.f8755b) * j6;
            while (true) {
                long j11 = f8743b.get(eVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (f8743b.compareAndSet(eVar2, j11, (((long) ((int) (j11 >> 60))) << 60) + j12)) {
                    break;
                }
                eVar = eVar2;
            }
            if (j6 * ((long) g.f8755b) < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.b();
            }
        }
        return null;
    }

    public static final void d(e eVar, Object obj, o7.l lVar) {
        lVar.resumeWith(new p6.j(eVar.s()));
    }

    public static final int f(e eVar, m mVar, int i, Object obj, long j, Object obj2, boolean z9) {
        mVar.n(i, obj);
        if (z9) {
            return eVar.I(mVar, i, obj, j, obj2, z9);
        }
        Object objL = mVar.l(i);
        if (objL == null) {
            if (eVar.g(j)) {
                if (mVar.k(i, null, g.f8757d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof c2) {
            mVar.n(i, null);
            if (eVar.F(objL, obj)) {
                mVar.o(i, g.i);
                return 0;
            }
            w wVar = g.f8759k;
            if (mVar.f.getAndSet((i * 2) + 1, wVar) == wVar) {
                return 5;
            }
            mVar.m(i, true);
            return 5;
        }
        return eVar.I(mVar, i, obj, j, obj2, z9);
    }

    public static void u(e eVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8746n;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r5, q7.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f10356c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            t7.b r0 = r7.c()
            q7.m r0 = (q7.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            t7.b r5 = r7.c()
            q7.m r5 = (q7.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = q7.e.f8749q
            java.lang.Object r6 = r5.get(r4)
            t7.s r6 = (t7.s) r6
            long r0 = r6.f10356c
            long r2 = r7.f10356c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.A(long, q7.m):void");
    }

    public final Object B(Object obj, t6.c cVar) {
        o7.l lVar = new o7.l(1, d0.b.I(cVar));
        lVar.s();
        lVar.resumeWith(new p6.j(s()));
        Object objR = lVar.r();
        return objR == u6.a.f10763a ? objR : p6.x.f8464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(q7.m r14, int r15, long r16, v6.c r18) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.D(q7.m, int, long, v6.c):java.lang.Object");
    }

    public final void E(c2 c2Var, boolean z9) {
        if (c2Var instanceof o7.j) {
            ((t6.c) c2Var).resumeWith(new p6.j(z9 ? r() : s()));
            return;
        }
        if (c2Var instanceof t) {
            ((t) c2Var).f8781a.resumeWith(new l(new j(q())));
            return;
        }
        if (!(c2Var instanceof b)) {
            if (c2Var instanceof x7.d) {
                ((x7.d) c2Var).c(this, g.f8760l);
                return;
            } else {
                com.google.gson.internal.a.m(c2Var, "Unexpected waiter: ");
                return;
            }
        }
        b bVar = (b) c2Var;
        o7.l lVar = bVar.f8735b;
        lVar.getClass();
        bVar.f8735b = null;
        bVar.f8734a = g.f8760l;
        Throwable thQ = bVar.f8736l.q();
        if (thQ == null) {
            lVar.resumeWith(Boolean.FALSE);
        } else {
            lVar.resumeWith(new p6.j(thQ));
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof x7.d) {
            return ((x7.d) obj).c(this, obj2);
        }
        if (obj instanceof t) {
            return g.a(((t) obj).f8781a, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof o7.j) {
                return g.a((o7.j) obj, obj2, null);
            }
            com.google.gson.internal.a.m(obj, "Unexpected receiver type: ");
            return false;
        }
        b bVar = (b) obj;
        o7.l lVar = bVar.f8735b;
        lVar.getClass();
        bVar.f8735b = null;
        bVar.f8734a = obj2;
        return g.a(lVar, Boolean.TRUE, null);
    }

    public final Object H(m mVar, int i, long j, Object obj) {
        Object objL = mVar.l(i);
        AtomicReferenceArray atomicReferenceArray = mVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8743b;
        if (objL == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f8762n;
                }
                if (mVar.k(i, objL, obj)) {
                    n();
                    return g.f8761m;
                }
            }
        } else if (objL == g.f8757d && mVar.k(i, objL, g.i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i * 2);
            mVar.n(i, null);
            return obj2;
        }
        while (true) {
            Object objL2 = mVar.l(i);
            if (objL2 == null || objL2 == g.f8758e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.k(i, objL2, g.h)) {
                        n();
                        return g.f8763o;
                    }
                } else {
                    if (obj == null) {
                        return g.f8762n;
                    }
                    if (mVar.k(i, objL2, obj)) {
                        n();
                        return g.f8761m;
                    }
                }
            } else if (objL2 != g.f8757d) {
                w wVar = g.j;
                if (objL2 == wVar) {
                    return g.f8763o;
                }
                if (objL2 == g.h) {
                    return g.f8763o;
                }
                if (objL2 == g.f8760l) {
                    n();
                    return g.f8763o;
                }
                if (objL2 != g.g && mVar.k(i, objL2, g.f)) {
                    boolean z9 = objL2 instanceof v;
                    if (z9) {
                        objL2 = ((v) objL2).f8782a;
                    }
                    if (G(objL2)) {
                        mVar.o(i, g.i);
                        n();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        mVar.n(i, null);
                        return obj3;
                    }
                    mVar.o(i, wVar);
                    mVar.i();
                    if (z9) {
                        n();
                    }
                    return g.f8763o;
                }
            } else if (mVar.k(i, objL2, g.i)) {
                n();
                Object obj4 = atomicReferenceArray.get(i * 2);
                mVar.n(i, null);
                return obj4;
            }
        }
    }

    public final int I(m mVar, int i, Object obj, long j, Object obj2, boolean z9) {
        while (true) {
            Object objL = mVar.l(i);
            if (objL == null) {
                if (!g(j) || z9) {
                    if (z9) {
                        if (mVar.k(i, null, g.j)) {
                            mVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.k(i, null, g.f8757d)) {
                    break;
                }
            } else {
                if (objL != g.f8758e) {
                    w wVar = g.f8759k;
                    if (objL == wVar) {
                        mVar.n(i, null);
                        return 5;
                    }
                    if (objL == g.h) {
                        mVar.n(i, null);
                        return 5;
                    }
                    if (objL == g.f8760l) {
                        mVar.n(i, null);
                        x();
                        return 4;
                    }
                    mVar.n(i, null);
                    if (objL instanceof v) {
                        objL = ((v) objL).f8782a;
                    }
                    if (F(objL, obj)) {
                        mVar.o(i, g.i);
                        return 0;
                    }
                    if (mVar.f.getAndSet((i * 2) + 1, wVar) != wVar) {
                        mVar.m(i, true);
                    }
                    return 5;
                }
                if (mVar.k(i, objL, g.f8757d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f8745m;
            if (atomicLongFieldUpdater.get(eVar) > j) {
                break;
            } else {
                eVar = this;
            }
        }
        int i = g.f8756c;
        int i6 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8746n;
            if (i6 < i) {
                long j6 = atomicLongFieldUpdater.get(eVar);
                if (j6 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j6 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i6++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(eVar);
                    long j12 = atomicLongFieldUpdater2.get(eVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z9 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (z9) {
                        eVar = this;
                    } else {
                        eVar = this;
                        atomicLongFieldUpdater2.compareAndSet(eVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // q7.i
    public final Object a() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8744l;
        long j = atomicLongFieldUpdater.get(this);
        long j6 = f8743b.get(this);
        if (v(j6, true)) {
            return new j(q());
        }
        long j10 = j6 & 1152921504606846975L;
        k kVar = l.f8772b;
        if (j >= j10) {
            return kVar;
        }
        Object obj = g.f8759k;
        m mVar2 = (m) f8748p.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = g.f8755b;
            long j12 = andIncrement / j11;
            int i = (int) (andIncrement % j11);
            if (mVar2.f10356c != j12) {
                m mVarO = o(j12, mVar2);
                if (mVarO == null) {
                    continue;
                } else {
                    mVar = mVarO;
                }
            } else {
                mVar = mVar2;
            }
            Object objH = H(mVar, i, andIncrement, obj);
            m mVar3 = mVar;
            if (objH == g.f8761m) {
                c2 c2Var = obj instanceof c2 ? (c2) obj : null;
                if (c2Var != null) {
                    c2Var.a(mVar3, i);
                }
                J(andIncrement);
                mVar3.i();
                return kVar;
            }
            if (objH != g.f8763o) {
                if (objH != g.f8762n) {
                    mVar3.b();
                    return objH;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("unexpected");
                return null;
            }
            if (andIncrement < t()) {
                mVar3.b();
            }
            mVar2 = mVar3;
        }
        return new j(q());
    }

    @Override // q7.i
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // q7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.Object r23, t6.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.e(java.lang.Object, t6.c):java.lang.Object");
    }

    public final boolean g(long j) {
        return j < f8745m.get(this) || j < f8744l.get(this) + ((long) this.f8752a);
    }

    public final boolean h(boolean z9, Throwable th) {
        e eVar;
        boolean z10;
        long j;
        long j6;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8743b;
        if (!z9) {
            eVar = this;
            break;
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            if (((int) (j12 >> 60)) != 0) {
                eVar = this;
                break;
            }
            m mVar = g.f8754a;
            eVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j12, (j12 & 1152921504606846975L) + (((long) 1) << 60)));
        w wVar = g.f8767s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8750r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, wVar, th)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != wVar) {
                z10 = false;
                break;
            }
        }
        if (z9) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j11, (((long) 3) << 60) + (j11 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j6 = j & 1152921504606846975L;
                    j10 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j6 = j & 1152921504606846975L;
                    j10 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j, (j10 << 60) + j6));
        }
        x();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8751s;
                obj = atomicReferenceFieldUpdater2.get(this);
                w wVar2 = obj == null ? g.f8765q : g.f8766r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, wVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                a0.b(1, obj);
                ((d7.l) obj).invoke(q());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (q7.m) ((t7.b) t7.b.f10322b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q7.m i(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.i(long):q7.m");
    }

    @Override // q7.i
    public final b iterator() {
        return new b(this);
    }

    public final void j(long j) {
        m mVar = (m) f8748p.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8744l;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f8752a) + j6, f8745m.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, 1 + j6)) {
                long j10 = g.f8755b;
                long j11 = j6 / j10;
                int i = (int) (j6 % j10);
                if (mVar.f10356c != j11) {
                    m mVarO = o(j11, mVar);
                    if (mVarO != null) {
                        mVar = mVarO;
                    }
                }
                m mVar2 = mVar;
                if (H(mVar2, i, j6, null) != g.f8763o || j6 < t()) {
                    mVar2.b();
                }
                mVar = mVar2;
            }
        }
    }

    @Override // q7.i
    public final Object k(s7.g gVar) {
        return C(this, gVar);
    }

    @Override // q7.i
    public final Object l(t6.c cVar) throws Throwable {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8748p;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8744l;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = g.f8755b;
            long j6 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (mVar3.f10356c != j6) {
                m mVarO = o(j6, mVar3);
                if (mVarO == null) {
                    continue;
                } else {
                    mVar = mVarO;
                }
            } else {
                mVar = mVar3;
            }
            Object objH = H(mVar, i, andIncrement, null);
            w wVar = g.f8761m;
            if (objH == wVar) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("unexpected");
                return null;
            }
            w wVar2 = g.f8763o;
            if (objH == wVar2) {
                if (andIncrement < t()) {
                    mVar.b();
                }
                mVar3 = mVar;
            } else {
                if (objH != g.f8762n) {
                    mVar.b();
                    return objH;
                }
                o7.l lVarP = c0.p(d0.b.I(cVar));
                e eVar = this;
                try {
                    Object objH2 = eVar.H(mVar, i, andIncrement, lVarP);
                    if (objH2 == wVar) {
                        lVarP.a(mVar, i);
                    } else {
                        if (objH2 == wVar2) {
                            if (andIncrement < t()) {
                                mVar.b();
                            }
                            m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    lVarP.resumeWith(new p6.j(r()));
                                    break;
                                }
                                o7.l lVar = lVarP;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j10 = g.f8755b;
                                    long j11 = andIncrement2 / j10;
                                    int i6 = (int) (andIncrement2 % j10);
                                    if (mVar4.f10356c != j11) {
                                        try {
                                            m mVarO2 = o(j11, mVar4);
                                            if (mVarO2 == null) {
                                                lVarP = lVar;
                                            } else {
                                                mVar2 = mVarO2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            lVarP = lVar;
                                            lVarP.z();
                                            throw th;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    objH2 = eVar.H(mVar2, i6, andIncrement2, lVar);
                                    m mVar5 = mVar2;
                                    lVarP = lVar;
                                    if (objH2 == g.f8761m) {
                                        lVarP.a(mVar5, i6);
                                        break;
                                    }
                                    if (objH2 == g.f8763o) {
                                        if (andIncrement2 < t()) {
                                            mVar5.b();
                                        }
                                        eVar = this;
                                        mVar4 = mVar5;
                                    } else {
                                        if (objH2 == g.f8762n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.b();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    lVarP = lVar;
                                    th = th;
                                    lVarP.z();
                                    throw th;
                                }
                            }
                        } else {
                            mVar.b();
                        }
                        lVarP.g(objH2, null);
                    }
                    return lVarP.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thR = r();
        int i10 = t7.t.f10357a;
        throw thR;
    }

    @Override // q7.u
    public final boolean m(Throwable th) {
        return h(false, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
    
        u(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.n():void");
    }

    public final m o(long j, m mVar) {
        Object objB;
        long j6;
        m mVar2 = g.f8754a;
        f fVar = f.f8753a;
        loop0: while (true) {
            objB = t7.a.b(mVar, j, fVar);
            if (!t7.a.e(objB)) {
                t7.s sVarC = t7.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8748p;
                    t7.s sVar = (t7.s) atomicReferenceFieldUpdater.get(this);
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
        if (t7.a.e(objB)) {
            x();
            if (mVar.f10356c * ((long) g.f8755b) < t()) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) t7.a.c(objB);
            long j10 = mVar3.f10356c;
            if (!z() && j <= f8745m.get(this) / ((long) g.f8755b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8749q;
                    t7.s sVar2 = (t7.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f10356c >= j10 || !mVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (mVar3.f()) {
                                mVar3.e();
                            }
                        }
                    }
                    if (sVar2.f()) {
                        sVar2.e();
                    }
                }
            }
            if (j10 <= j) {
                return mVar3;
            }
            long j11 = j10 * ((long) g.f8755b);
            do {
                j6 = f8744l.get(this);
                if (j6 >= j11) {
                    break;
                }
            } while (!f8744l.compareAndSet(this, j6, j11));
            if (j10 * ((long) g.f8755b) < t()) {
                mVar3.b();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd A[SYNTHETIC] */
    @Override // q7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = q7.e.f8743b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.v(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.g(r1)
            r1 = r1 ^ r10
        L1b:
            q7.k r13 = q7.l.f8772b
            if (r1 == 0) goto L20
            return r13
        L20:
            f8.w r6 = q7.g.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = q7.e.f8747o
            java.lang.Object r1 = r1.get(r15)
            q7.m r1 = (q7.m) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.v(r2, r9)
            int r14 = q7.g.f8755b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f10356c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            q7.m r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.s()
            q7.j r2 = new q7.j
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = f(r0, r1, r2, r3, r4, r6, r7)
            p6.x r3 = p6.x.f8464a
            if (r9 == 0) goto Lbd
            r10 = 1
            if (r9 == r10) goto Lbc
            r3 = 2
            if (r9 == r3) goto L9b
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.b()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = q7.e.f8744l
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.b()
        L8a:
            java.lang.Throwable r1 = r15.s()
            q7.j r2 = new q7.j
            r2.<init>(r1)
            return r2
        L94:
            java.lang.String r1 = "unexpected"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r1)
            r1 = 0
            return r1
        L9b:
            if (r7 == 0) goto Laa
            r1.i()
            java.lang.Throwable r1 = r15.s()
            q7.j r2 = new q7.j
            r2.<init>(r1)
            return r2
        Laa:
            boolean r3 = r6 instanceof o7.c2
            if (r3 == 0) goto Lb1
            o7.c2 r6 = (o7.c2) r6
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb8
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb8:
            r1.i()
            return r13
        Lbc:
            return r3
        Lbd:
            r1.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.p(java.lang.Object):java.lang.Object");
    }

    public final Throwable q() {
        return (Throwable) f8750r.get(this);
    }

    public final Throwable r() {
        Throwable thQ = q();
        return thQ == null ? new n("Channel was closed") : thQ;
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new j1.b("Channel was closed") : thQ;
    }

    public final long t() {
        return f8743b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b9, code lost:
    
        r16 = r7;
        r3 = (q7.m) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c2, code lost:
    
        if (r3 != null) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (q7.m) ((t7.b) t7.b.f10322b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.v(long, boolean):boolean");
    }

    public final boolean w() {
        return v(f8743b.get(this), true);
    }

    public final boolean x() {
        return v(f8743b.get(this), false);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j = f8745m.get(this);
        return j == 0 || j == LocationRequestCompat.PASSIVE_INTERVAL;
    }
}
