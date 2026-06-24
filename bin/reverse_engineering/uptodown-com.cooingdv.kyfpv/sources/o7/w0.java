package o7;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 extends r0 implements h0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8323n = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8324o = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8325p = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // o7.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long B() {
        /*
            r10 = this;
            f8.w r0 = o7.c0.f8246c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o7.w0.f8323n
            boolean r2 = r10.C()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.E()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof t7.m
            if (r6 == 0) goto L3e
            r6 = r2
            t7.m r6 = (t7.m) r6
            java.lang.Object r7 = r6.d()
            f8.w r8 = t7.m.g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            t7.m r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            q6.i r2 = r10.f8305l
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof t7.m
            if (r2 == 0) goto L8d
            t7.m r1 = (t7.m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = t7.m.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o7.w0.f8324o
            java.lang.Object r0 = r0.get(r10)
            o7.v0 r0 = (o7.v0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            o7.u0[] r1 = r0.f10364a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f8317a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.w0.B():long");
    }

    public void D(Runnable runnable) {
        E();
        if (!F(runnable)) {
            d0.f8251q.D(runnable);
            return;
        }
        Thread threadG = G();
        if (Thread.currentThread() != threadG) {
            LockSupport.unpark(threadG);
        }
    }

    public final void E() {
        u0 u0VarC;
        v0 v0Var = (v0) f8324o.get(this);
        if (v0Var == null || t7.x.f10363b.get(v0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (v0Var) {
                try {
                    u0[] u0VarArr = v0Var.f10364a;
                    u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                    if (u0Var != null) {
                        u0VarC = ((jNanoTime - u0Var.f8317a) > 0L ? 1 : ((jNanoTime - u0Var.f8317a) == 0L ? 0 : -1)) >= 0 ? F(u0Var) : false ? v0Var.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (u0VarC != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o7.w0.f8323n
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = o7.w0.f8325p
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof t7.m
            if (r4 == 0) goto L47
            r4 = r1
            t7.m r4 = (t7.m) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            t7.m r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            f8.w r4 = o7.c0.f8246c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            t7.m r3 = new t7.m
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.w0.F(java.lang.Runnable):boolean");
    }

    public abstract Thread G();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H() {
        /*
            r7 = this;
            q6.i r0 = r7.f8305l
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o7.w0.f8324o
            java.lang.Object r0 = r0.get(r7)
            o7.v0 r0 = (o7.v0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = t7.x.f10363b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o7.w0.f8323n
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof t7.m
            if (r3 == 0) goto L4f
            t7.m r0 = (t7.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = t7.m.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            f8.w r3 = o7.c0.f8246c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.w0.H():boolean");
    }

    public void I(long j, u0 u0Var) {
        d0.f8251q.J(j, u0Var);
    }

    public final void J(long j, u0 u0Var) {
        int iC;
        Thread threadG;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8324o;
        if (f8325p.get(this) != 0) {
            iC = 1;
        } else {
            v0 v0Var = (v0) atomicReferenceFieldUpdater.get(this);
            if (v0Var == null) {
                v0 v0Var2 = new v0();
                v0Var2.f8321c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, v0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                v0Var = (v0) obj;
            }
            iC = u0Var.c(j, v0Var, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                I(j, u0Var);
                return;
            } else {
                if (iC == 2) {
                    return;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("unexpected result");
                return;
            }
        }
        v0 v0Var3 = (v0) atomicReferenceFieldUpdater.get(this);
        if (v0Var3 != null) {
            synchronized (v0Var3) {
                u0[] u0VarArr = v0Var3.f10364a;
                u0Var = u0VarArr != null ? u0VarArr[0] : null;
            }
        }
        if (u0Var != u0Var || Thread.currentThread() == (threadG = G())) {
            return;
        }
        LockSupport.unpark(threadG);
    }

    @Override // o7.w
    public final void dispatch(t6.h hVar, Runnable runnable) {
        D(runnable);
    }

    public o0 e(long j, x1 x1Var, t6.h hVar) {
        return e0.f8258a.e(j, x1Var, hVar);
    }

    @Override // o7.h0
    public final void i(long j, l lVar) {
        long j6 = j > 0 ? j >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j : 0L;
        if (j6 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            s0 s0Var = new s0(this, j6 + jNanoTime, lVar);
            J(jNanoTime, s0Var);
            lVar.v(new h(s0Var, 2));
        }
    }

    @Override // o7.r0
    public void shutdown() {
        u0 u0VarC;
        v1.f8322a.set(null);
        f8325p.set(this, 1);
        f8.w wVar = c0.f8246c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8323n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof t7.m)) {
                    if (obj != wVar) {
                        t7.m mVar = new t7.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((t7.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, wVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (B() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            v0 v0Var = (v0) f8324o.get(this);
            if (v0Var == null) {
                return;
            }
            synchronized (v0Var) {
                u0VarC = t7.x.f10363b.get(v0Var) > 0 ? v0Var.c(0) : null;
            }
            if (u0VarC == null) {
                return;
            } else {
                I(jNanoTime, u0VarC);
            }
        }
    }
}
