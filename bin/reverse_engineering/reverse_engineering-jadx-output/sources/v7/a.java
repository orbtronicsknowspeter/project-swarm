package v7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10858r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f10860b;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f10861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10863n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f10866q;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i) {
        this.f10866q = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f10859a = new l();
        this.f10860b = new x();
        this.f10861l = b.f10870m;
        this.nextParkedWorker = c.f10876t;
        int iNanoTime = (int) System.nanoTime();
        this.f10864o = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = v7.l.f10900d.get(r9);
        r0 = v7.l.f10899c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (v7.l.f10901e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v7.h a(boolean r12) {
        /*
            r11 = this;
            v7.b r0 = r11.f10861l
            v7.c r2 = r11.f10866q
            r7 = 0
            r8 = 1
            v7.l r9 = r11.f10859a
            v7.b r10 = v7.b.f10867a
            if (r0 != r10) goto Le
            goto L84
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = v7.c.f10874r
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = v7.l.f10898b
            java.lang.Object r0 = r12.get(r9)
            v7.h r0 = (v7.h) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f10890b
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = v7.l.f10900d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = v7.l.f10899c
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = v7.l.f10901e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            v7.h r1 = r9.c(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            v7.f r12 = r2.f10882o
            java.lang.Object r12 = r12.d()
            v7.h r12 = (v7.h) r12
            if (r12 != 0) goto L71
            v7.h r12 = r11.i(r8)
        L71:
            return r12
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = v7.c.f10874r
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f10861l = r10
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r2.f10877a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            v7.h r12 = r11.e()
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = v7.l.f10898b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            v7.h r12 = (v7.h) r12
            if (r12 != 0) goto Lac
            v7.h r12 = r9.b()
        Lac:
            if (r12 == 0) goto Laf
            return r12
        Laf:
            if (r8 != 0) goto Lbf
            v7.h r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lb8:
            v7.h r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lbf:
            r12 = 3
            v7.h r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.a.a(boolean):v7.h");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i6 = this.f10864o;
        int i10 = i6 ^ (i6 << 13);
        int i11 = i10 ^ (i10 >> 17);
        int i12 = i11 ^ (i11 << 5);
        this.f10864o = i12;
        int i13 = i - 1;
        return (i13 & i) == 0 ? i12 & i13 : (i12 & Integer.MAX_VALUE) % i;
    }

    public final h e() {
        int iD = d(2);
        c cVar = this.f10866q;
        f fVar = cVar.f10882o;
        f fVar2 = cVar.f10881n;
        if (iD == 0) {
            h hVar = (h) fVar2.d();
            return hVar != null ? hVar : (h) fVar.d();
        }
        h hVar2 = (h) fVar.d();
        return hVar2 != null ? hVar2 : (h) fVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10866q.f10880m);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f10861l;
        boolean z9 = bVar2 == b.f10867a;
        if (z9) {
            c.f10874r.addAndGet(this.f10866q, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f10861l = bVar;
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v7.h i(int r26) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.a.i(int):v7.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.a.run():void");
    }
}
