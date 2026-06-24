package x7;

import f8.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.a0;
import o7.c0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends l implements a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11528q = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public g(boolean z9) {
        super(1, z9 ? 1 : 0);
        this.owner$volatile = z9 ? null : h.f11529a;
        new o7.k(this, 1);
    }

    @Override // x7.a
    public final w7.a getOnLock() {
        a0.b(3, e.f11526a);
        a0.b(3, f.f11527a);
        return new q1.a(13);
    }

    @Override // x7.a
    public final boolean holdsLock(Object obj) {
        char c9;
        while (true) {
            if (!isLocked()) {
                c9 = 0;
                break;
            }
            Object obj2 = f11528q.get(this);
            if (obj2 != h.f11529a) {
                c9 = obj2 == obj ? (char) 1 : (char) 2;
            }
        }
        return c9 == 1;
    }

    @Override // x7.a
    public final boolean isLocked() {
        return Math.max(l.f11537p.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r6 = x7.g.f11528q;
        r2 = r0.f11522l;
        r6.set(r2, r0.f11521b);
        r0.f11520a.A(new androidx.work.impl.model.a(11, r2, r0), r1);
     */
    @Override // x7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lock(java.lang.Object r6, t6.c r7) {
        /*
            r5 = this;
            boolean r0 = r5.tryLock(r6)
            p6.x r1 = p6.x.f8464a
            if (r0 == 0) goto L9
            goto L4b
        L9:
            t6.c r7 = d0.b.I(r7)
            o7.l r7 = o7.c0.p(r7)
            x7.c r0 = new x7.c     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L4c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = x7.l.f11537p     // Catch: java.lang.Throwable -> L4c
            int r6 = r6.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L4c
            int r2 = r5.f11538a     // Catch: java.lang.Throwable -> L4c
            if (r6 > r2) goto L16
            if (r6 <= 0) goto L38
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = x7.g.f11528q     // Catch: java.lang.Throwable -> L4c
            x7.g r2 = r0.f11522l     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r0.f11521b     // Catch: java.lang.Throwable -> L4c
            r6.set(r2, r3)     // Catch: java.lang.Throwable -> L4c
            o7.l r6 = r0.f11520a     // Catch: java.lang.Throwable -> L4c
            androidx.work.impl.model.a r3 = new androidx.work.impl.model.a     // Catch: java.lang.Throwable -> L4c
            r4 = 11
            r3.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L4c
            r6.A(r3, r1)     // Catch: java.lang.Throwable -> L4c
            goto L3e
        L38:
            boolean r6 = r5.a(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L16
        L3e:
            java.lang.Object r6 = r7.r()
            u6.a r7 = u6.a.f10763a
            if (r6 != r7) goto L47
            goto L48
        L47:
            r6 = r1
        L48:
            if (r6 != r7) goto L4b
            return r6
        L4b:
            return r1
        L4c:
            r6 = move-exception
            r7.z()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.g.lock(java.lang.Object, t6.c):java.lang.Object");
    }

    public final String toString() {
        return "Mutex@" + c0.o(this) + "[isLocked=" + isLocked() + ",owner=" + f11528q.get(this) + ']';
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return false;
     */
    @Override // x7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryLock(java.lang.Object r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = x7.l.f11537p
            int r1 = r0.get(r6)
            int r2 = r6.f11538a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r6)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r6, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = x7.g.f11528q
            r3 = 1
            if (r1 > 0) goto L43
            r4 = 0
            if (r7 != 0) goto L20
            goto L3b
        L20:
            boolean r0 = r6.isLocked()
            r1 = 2
            if (r0 != 0) goto L29
            r0 = r4
            goto L36
        L29:
            java.lang.Object r0 = r2.get(r6)
            f8.w r5 = x7.h.f11529a
            if (r0 == r5) goto L20
            if (r0 != r7) goto L35
            r0 = r3
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 == r3) goto L3c
            if (r0 == r1) goto L3b
            goto L0
        L3b:
            return r4
        L3c:
            java.lang.String r0 = "This mutex is already locked by the specified owner: "
            com.google.gson.internal.a.m(r7, r0)
            r7 = 0
            return r7
        L43:
            int r4 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r6, r1, r4)
            if (r0 == 0) goto L0
            r2.set(r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.g.tryLock(java.lang.Object):boolean");
    }

    @Override // x7.a
    public final void unlock(Object obj) {
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11528q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            w wVar = h.f11529a;
            if (obj2 != wVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, wVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("This mutex is not locked");
    }
}
