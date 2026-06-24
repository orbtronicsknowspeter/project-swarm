package r7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class j0 extends s7.b implements b0, h, s7.i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f8997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9001s;

    public j0(int i, int i6) {
        this.f8995m = i;
        this.f8996n = i6;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|51|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|53|25|26))(1:29)|55|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0075, B:35:0x007f, B:39:0x0092, B:42:0x0099, B:43:0x009d, B:44:0x009e, B:22:0x0047), top: B:51:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [r7.i] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [s7.b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [r7.j0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [r7.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [s7.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [r7.l0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [r7.l0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ac -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(r7.j0 r8, r7.i r9, t6.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof r7.i0
            if (r0 == 0) goto L13
            r0 = r10
            r7.i0 r0 = (r7.i0) r0
            int r1 = r0.f8988p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8988p = r1
            goto L18
        L13:
            r7.i0 r0 = new r7.i0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f8986n
            int r1 = r0.f8988p
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            o7.e1 r8 = r0.f8985m
            r7.l0 r9 = r0.f8984l
            r7.i r1 = r0.f8983b
            r7.j0 r4 = r0.f8982a
            p6.a.e(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r8)
            return
        L3f:
            o7.e1 r8 = r0.f8985m
            r7.l0 r9 = r0.f8984l
            r7.i r1 = r0.f8983b
            r7.j0 r4 = r0.f8982a
            p6.a.e(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            r7.l0 r9 = r0.f8984l
            r7.i r8 = r0.f8983b
            r7.j0 r1 = r0.f8982a
            p6.a.e(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            p6.a.e(r10)
            s7.d r10 = r8.b()
            r7.l0 r10 = (r7.l0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            t6.h r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            o7.x r4 = o7.x.f8327b     // Catch: java.lang.Throwable -> Laf
            t6.f r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Laf
            o7.e1 r1 = (o7.e1) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.q(r9)     // Catch: java.lang.Throwable -> L36
            f8.w r5 = r7.k0.f9005a     // Catch: java.lang.Throwable -> L36
            u6.a r6 = u6.a.f10762a
            if (r10 != r5) goto L90
            r0.f8982a = r4     // Catch: java.lang.Throwable -> L36
            r0.f8983b = r1     // Catch: java.lang.Throwable -> L36
            r0.f8984l = r9     // Catch: java.lang.Throwable -> L36
            r0.f8985m = r8     // Catch: java.lang.Throwable -> L36
            r0.f8988p = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.f(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.j()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.f8982a = r4     // Catch: java.lang.Throwable -> L36
            r0.f8983b = r1     // Catch: java.lang.Throwable -> L36
            r0.f8984l = r9     // Catch: java.lang.Throwable -> L36
            r0.f8985m = r8     // Catch: java.lang.Throwable -> L36
            r0.f8988p = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.j0.h(r7.j0, r7.i, t6.c):void");
    }

    @Override // s7.i
    public final h a(t6.h hVar, int i, q7.a aVar) {
        return k0.m(this, hVar, i, aVar);
    }

    @Override // s7.b
    public final s7.d c() {
        l0 l0Var = new l0();
        l0Var.f9013a = -1L;
        return l0Var;
    }

    @Override // r7.h
    public final Object collect(i iVar, t6.c cVar) {
        h(this, iVar, cVar);
        return u6.a.f10762a;
    }

    @Override // s7.b
    public final s7.d[] d() {
        return new l0[2];
    }

    @Override // r7.b0, r7.i
    public final Object emit(Object obj, t6.c cVar) throws Throwable {
        Throwable th;
        t6.c[] cVarArrK;
        h0 h0Var;
        if (n(obj)) {
            return p6.x.f8463a;
        }
        o7.l lVar = new o7.l(1, d0.b.I(cVar));
        lVar.s();
        t6.c[] cVarArrK2 = s7.c.f9348a;
        synchronized (this) {
            try {
                if (o(obj)) {
                    try {
                        lVar.resumeWith(p6.x.f8463a);
                        cVarArrK = k(cVarArrK2);
                        h0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        h0 h0Var2 = new h0(this, l() + ((long) (this.f9000r + this.f9001s)), obj, lVar);
                        j(h0Var2);
                        this.f9001s++;
                        if (this.f8996n == 0) {
                            cVarArrK2 = k(cVarArrK2);
                        }
                        cVarArrK = cVarArrK2;
                        h0Var = h0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (h0Var != null) {
                    lVar.v(new o7.h(h0Var, 2));
                }
                for (t6.c cVar2 : cVarArrK) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(p6.x.f8463a);
                    }
                }
                Object objR = lVar.r();
                u6.a aVar = u6.a.f10762a;
                if (objR != aVar) {
                    objR = p6.x.f8463a;
                }
                return objR == aVar ? objR : p6.x.f8463a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object f(l0 l0Var, i0 i0Var) {
        o7.l lVar = new o7.l(1, d0.b.I(i0Var));
        lVar.s();
        synchronized (this) {
            try {
                if (p(l0Var) < 0) {
                    l0Var.f9014b = lVar;
                } else {
                    lVar.resumeWith(p6.x.f8463a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objR = lVar.r();
        return objR == u6.a.f10762a ? objR : p6.x.f8463a;
    }

    public final void g() {
        if (this.f8996n != 0 || this.f9001s > 1) {
            Object[] objArr = this.f8997o;
            objArr.getClass();
            while (this.f9001s > 0) {
                long jL = l();
                int i = this.f9000r;
                int i6 = this.f9001s;
                if (objArr[((int) ((jL + ((long) (i + i6))) - 1)) & (objArr.length - 1)] != k0.f9005a) {
                    return;
                }
                this.f9001s = i6 - 1;
                k0.d(objArr, l() + ((long) (this.f9000r + this.f9001s)), null);
            }
        }
    }

    public final void i() {
        s7.d[] dVarArr;
        Object[] objArr = this.f8997o;
        objArr.getClass();
        k0.d(objArr, l(), null);
        this.f9000r--;
        long jL = l() + 1;
        if (this.f8998p < jL) {
            this.f8998p = jL;
        }
        if (this.f8999q < jL) {
            if (this.f9346b != 0 && (dVarArr = this.f9345a) != null) {
                for (s7.d dVar : dVarArr) {
                    if (dVar != null) {
                        l0 l0Var = (l0) dVar;
                        long j = l0Var.f9013a;
                        if (j >= 0 && j < jL) {
                            l0Var.f9013a = jL;
                        }
                    }
                }
            }
            this.f8999q = jL;
        }
    }

    public final void j(Object obj) {
        int i = this.f9000r + this.f9001s;
        Object[] objArrM = this.f8997o;
        if (objArrM == null) {
            objArrM = m(null, 0, 2);
        } else if (i >= objArrM.length) {
            objArrM = m(objArrM, i, objArrM.length * 2);
        }
        k0.d(objArrM, l() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [t6.c[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final t6.c[] k(t6.c[] cVarArr) {
        s7.d[] dVarArr;
        l0 l0Var;
        o7.l lVar;
        int length = cVarArr.length;
        if (this.f9346b != 0 && (dVarArr = this.f9345a) != null) {
            int length2 = dVarArr.length;
            int i = 0;
            cVarArr = cVarArr;
            while (i < length2) {
                s7.d dVar = dVarArr[i];
                if (dVar != null && (lVar = (l0Var = (l0) dVar).f9014b) != null && p(l0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        cVarArr = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                    }
                    ((t6.c[]) cVarArr)[length] = lVar;
                    l0Var.f9014b = null;
                    length++;
                }
                i++;
                cVarArr = cVarArr;
            }
        }
        return (t6.c[]) cVarArr;
    }

    public final long l() {
        return Math.min(this.f8999q, this.f8998p);
    }

    public final Object[] m(Object[] objArr, int i, int i6) {
        if (i6 <= 0) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i6];
        this.f8997o = objArr2;
        if (objArr != null) {
            long jL = l();
            for (int i10 = 0; i10 < i; i10++) {
                long j = ((long) i10) + jL;
                k0.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean n(Object obj) {
        int i;
        boolean z9;
        t6.c[] cVarArrK = s7.c.f9348a;
        synchronized (this) {
            if (o(obj)) {
                cVarArrK = k(cVarArrK);
                z9 = true;
            } else {
                z9 = false;
            }
        }
        for (t6.c cVar : cVarArrK) {
            if (cVar != null) {
                cVar.resumeWith(p6.x.f8463a);
            }
        }
        return z9;
    }

    public final boolean o(Object obj) {
        int i = this.f9346b;
        int i6 = this.f8995m;
        if (i != 0) {
            int i10 = this.f9000r;
            int i11 = this.f8996n;
            if (i10 >= i11 && this.f8999q <= this.f8998p) {
                return false;
            }
            j(obj);
            int i12 = this.f9000r + 1;
            this.f9000r = i12;
            if (i12 > i11) {
                i();
            }
            long jL = l() + ((long) this.f9000r);
            long j = this.f8998p;
            if (((int) (jL - j)) > i6) {
                r(1 + j, this.f8999q, l() + ((long) this.f9000r), l() + ((long) this.f9000r) + ((long) this.f9001s));
            }
        } else if (i6 != 0) {
            j(obj);
            int i13 = this.f9000r + 1;
            this.f9000r = i13;
            if (i13 > i6) {
                i();
            }
            this.f8999q = l() + ((long) this.f9000r);
            return true;
        }
        return true;
    }

    public final long p(l0 l0Var) {
        long j = l0Var.f9013a;
        if (j < l() + ((long) this.f9000r)) {
            return j;
        }
        if (this.f8996n <= 0 && j <= l() && this.f9001s != 0) {
            return j;
        }
        return -1L;
    }

    public final Object q(l0 l0Var) {
        Object obj;
        t6.c[] cVarArrS = s7.c.f9348a;
        synchronized (this) {
            try {
                long jP = p(l0Var);
                if (jP < 0) {
                    obj = k0.f9005a;
                } else {
                    long j = l0Var.f9013a;
                    Object[] objArr = this.f8997o;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jP) & (objArr.length - 1)];
                    if (obj2 instanceof h0) {
                        obj2 = ((h0) obj2).f8980l;
                    }
                    l0Var.f9013a = jP + 1;
                    Object obj3 = obj2;
                    cVarArrS = s(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (t6.c cVar : cVarArrS) {
            if (cVar != null) {
                cVar.resumeWith(p6.x.f8463a);
            }
        }
        return obj;
    }

    public final void r(long j, long j6, long j10, long j11) {
        long jMin = Math.min(j6, j);
        for (long jL = l(); jL < jMin; jL++) {
            Object[] objArr = this.f8997o;
            objArr.getClass();
            k0.d(objArr, jL, null);
        }
        this.f8998p = j;
        this.f8999q = j6;
        this.f9000r = (int) (j10 - jMin);
        this.f9001s = (int) (j11 - j10);
    }

    public final t6.c[] s(long j) {
        long j6;
        long j10;
        long j11;
        t6.c[] cVarArr;
        t6.c[] cVarArr2;
        s7.d[] dVarArr;
        f8.w wVar = k0.f9005a;
        t6.c[] cVarArr3 = s7.c.f9348a;
        if (j <= this.f8999q) {
            long jL = l();
            long j12 = ((long) this.f9000r) + jL;
            int i = this.f8996n;
            if (i == 0 && this.f9001s > 0) {
                j12++;
            }
            int i6 = 0;
            if (this.f9346b != 0 && (dVarArr = this.f9345a) != null) {
                for (s7.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((l0) dVar).f9013a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f8999q) {
                long jL2 = l() + ((long) this.f9000r);
                int i10 = this.f9346b;
                int iMin = this.f9001s;
                if (i10 > 0) {
                    j6 = 1;
                    iMin = Math.min(iMin, i - ((int) (jL2 - j12)));
                } else {
                    j6 = 1;
                }
                long j14 = ((long) this.f9001s) + jL2;
                if (iMin > 0) {
                    Object[] objArr = this.f8997o;
                    objArr.getClass();
                    j10 = jL;
                    t6.c[] cVarArr4 = new t6.c[iMin];
                    long j15 = jL2;
                    while (true) {
                        if (jL2 >= j14) {
                            cVarArr2 = cVarArr4;
                            j11 = j12;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[((int) jL2) & (objArr.length - 1)];
                        if (obj != wVar) {
                            obj.getClass();
                            h0 h0Var = (h0) obj;
                            j11 = j12;
                            int i11 = i6 + 1;
                            cVarArr2[i6] = h0Var.f8981m;
                            k0.d(objArr, jL2, wVar);
                            k0.d(objArr, j15, h0Var.f8980l);
                            j15 += j6;
                            if (i11 >= iMin) {
                                break;
                            }
                            i6 = i11;
                        } else {
                            j11 = j12;
                        }
                        jL2 += j6;
                        cVarArr4 = cVarArr2;
                        j12 = j11;
                    }
                    jL2 = j15;
                    cVarArr = cVarArr2;
                } else {
                    j10 = jL;
                    j11 = j12;
                    cVarArr = cVarArr3;
                }
                int i12 = (int) (jL2 - j10);
                long j16 = this.f9346b == 0 ? jL2 : j11;
                long jMax = Math.max(this.f8998p, jL2 - ((long) Math.min(this.f8995m, i12)));
                if (i == 0 && jMax < j14) {
                    Object[] objArr2 = this.f8997o;
                    objArr2.getClass();
                    if (kotlin.jvm.internal.l.a(objArr2[((int) jMax) & (objArr2.length - 1)], wVar)) {
                        jL2 += j6;
                        jMax += j6;
                    }
                }
                r(jMax, j16, jL2, j14);
                g();
                return cVarArr.length == 0 ? cVarArr : k(cVarArr);
            }
        }
        return cVarArr3;
    }
}
