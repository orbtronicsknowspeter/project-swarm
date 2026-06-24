package r7;

import c4.ya;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class d implements s7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.h f8964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8965b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q7.a f8966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f8968n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, t6.h hVar2, int i, q7.a aVar, int i6) {
        this((Object) hVar, (i6 & 2) != 0 ? t6.i.f10315a : hVar2, (i6 & 4) != 0 ? -3 : i, (i6 & 8) != 0 ? q7.a.f8730a : aVar, 1);
        this.f8967m = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // s7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r7.h a(t6.h r5, int r6, q7.a r7) {
        /*
            r4 = this;
            t6.h r0 = r4.f8964a
            t6.h r5 = r5.plus(r0)
            q7.a r1 = q7.a.f8730a
            q7.a r2 = r4.f8966l
            int r3 = r4.f8965b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.l.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            r7.d r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.d.a(t6.h, int, q7.a):r7.h");
    }

    public final Object b(i iVar, t6.c cVar) {
        Object objI = o7.c0.i(new b6.g(iVar, this, null, 23), cVar);
        return objI == u6.a.f10763a ? objI : p6.x.f8464a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [d7.p, v6.i] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable, java.lang.Object] */
    public Object c(q7.s sVar, t6.c cVar) {
        switch (this.f8967m) {
            case 0:
                Object objInvoke = ((v6.i) this.f8968n).invoke(sVar, cVar);
                return objInvoke == u6.a.f10763a ? objInvoke : p6.x.f8464a;
            case 1:
                Object objCollect = ((h) this.f8968n).collect(new s7.o(sVar), cVar);
                p6.x xVar = p6.x.f8464a;
                u6.a aVar = u6.a.f10763a;
                if (objCollect != aVar) {
                    objCollect = xVar;
                }
                return objCollect == aVar ? objCollect : xVar;
            default:
                s7.o oVar = new s7.o(sVar);
                Iterator it = this.f8968n.iterator();
                while (it.hasNext()) {
                    o7.c0.s(sVar, null, null, new ya((h) it.next(), oVar, (t6.c) null, 28), 3);
                }
                return p6.x.f8464a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    @Override // r7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(r7.i r7, t6.c r8) {
        /*
            r6 = this;
            int r0 = r6.f8967m
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r7 = r6.b(r7, r8)
            return r7
        La:
            int r0 = r6.f8965b
            r1 = -3
            u6.a r2 = u6.a.f10763a
            p6.x r3 = p6.x.f8464a
            if (r0 != r1) goto L84
            t6.h r0 = r8.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            c4.j1 r4 = new c4.j1
            r5 = 9
            r4.<init>(r5)
            t6.h r5 = r6.f8964a
            java.lang.Object r1 = r5.fold(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L33
            t6.h r1 = r0.plus(r5)
            goto L38
        L33:
            r1 = 0
            t6.h r1 = o7.c0.l(r0, r5, r1)
        L38:
            boolean r4 = kotlin.jvm.internal.l.a(r1, r0)
            if (r4 == 0) goto L4e
            java.lang.Object r0 = r6.f8968n
            r7.h r0 = (r7.h) r0
            java.lang.Object r7 = r0.collect(r7, r8)
            if (r7 != r2) goto L49
            goto L4a
        L49:
            r7 = r3
        L4a:
            if (r7 != r2) goto L8b
        L4c:
            r3 = r7
            goto L8b
        L4e:
            t6.d r4 = t6.d.f10314a
            t6.f r5 = r1.get(r4)
            t6.f r0 = r0.get(r4)
            boolean r0 = kotlin.jvm.internal.l.a(r5, r0)
            if (r0 == 0) goto L84
            t6.h r0 = r8.getContext()
            boolean r4 = r7 instanceof s7.o
            if (r4 != 0) goto L71
            boolean r4 = r7 instanceof s7.k
            if (r4 == 0) goto L6b
            goto L71
        L6b:
            c4.dd r4 = new c4.dd
            r4.<init>(r7, r0)
            r7 = r4
        L71:
            c4.ya r0 = new c4.ya
            r4 = 0
            r5 = 27
            r0.<init>(r6, r4, r5)
            java.lang.Object r4 = t7.a.k(r1)
            java.lang.Object r7 = s7.c.b(r1, r7, r4, r0, r8)
            if (r7 != r2) goto L8b
            goto L4c
        L84:
            java.lang.Object r7 = r6.b(r7, r8)
            if (r7 != r2) goto L8b
            goto L4c
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.d.collect(r7.i, t6.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [d7.p, v6.i] */
    public d d(t6.h hVar, int i, q7.a aVar) {
        switch (this.f8967m) {
            case 0:
                return new d((v6.i) this.f8968n, hVar, i, aVar);
            case 1:
                return new d(this.f8968n, hVar, i, aVar, 1);
            default:
                return new d(this.f8968n, hVar, i, aVar, 2);
        }
    }

    public final String e() {
        ArrayList arrayList = new ArrayList(4);
        t6.i iVar = t6.i.f10315a;
        t6.h hVar = this.f8964a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i = this.f8965b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        q7.a aVar = q7.a.f8730a;
        q7.a aVar2 = this.f8966l;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return a4.x.m(sb, q6.l.x0(arrayList, ", ", null, null, null, 62), ']');
    }

    public String toString() {
        switch (this.f8967m) {
            case 0:
                return "block[" + ((v6.i) this.f8968n) + "] -> " + e();
            case 1:
                return ((h) this.f8968n) + " -> " + e();
            default:
                return e();
        }
    }

    public d(t6.h hVar, int i, q7.a aVar) {
        this.f8964a = hVar;
        this.f8965b = i;
        this.f8966l = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, t6.h hVar, int i, q7.a aVar, int i6) {
        this(hVar, i, aVar);
        this.f8967m = i6;
        this.f8968n = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(d7.p pVar, t6.h hVar, int i, q7.a aVar) {
        this(hVar, i, aVar);
        this.f8967m = 0;
        this.f8968n = (v6.i) pVar;
    }
}
