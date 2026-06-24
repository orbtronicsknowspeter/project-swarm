package f8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4966c;

    public q(int i) {
        this.f4964a = i;
        switch (i) {
            case 3:
                this.f4966c = new int[10];
                break;
            case 4:
                this.f4965b = 0;
                this.f4966c = new StringBuilder();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(f8.q r9, p6.b r10, v6.a r11) {
        /*
            java.lang.Object r0 = r9.f4966c
            f8.a0 r0 = (f8.a0) r0
            boolean r1 = r11 instanceof f8.v
            if (r1 == 0) goto L17
            r1 = r11
            f8.v r1 = (f8.v) r1
            int r2 = r1.f4979p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f4979p = r2
            goto L1c
        L17:
            f8.v r1 = new f8.v
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.f4977n
            int r2 = r1.f4979p
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5d
            if (r2 != r8) goto L56
            java.lang.String r9 = r1.f4976m
            java.util.LinkedHashMap r10 = r1.f4975l
            f8.q r0 = r1.f4974b
            p6.b r2 = r1.f4973a
            p6.a.e(r11)
            e8.k r11 = (e8.k) r11
            r10.put(r9, r11)
            java.lang.Object r9 = r0.f4966c
            f8.a0 r9 = (f8.a0) r9
            byte r9 = r9.i()
            if (r9 == r7) goto L51
            if (r9 != r6) goto L47
            goto L96
        L47:
            java.lang.Object r9 = r0.f4966c
            f8.a0 r9 = (f8.a0) r9
            java.lang.String r10 = "Expected end of the object or comma"
            f8.a0.p(r9, r10, r3, r4, r5)
            throw r4
        L51:
            r11 = r9
            r9 = r0
            r0 = r10
            r10 = r2
            goto L6f
        L56:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r9)
            r9 = 0
            return r9
        L5d:
            p6.a.e(r11)
            byte r11 = r0.j(r5)
            byte r2 = r0.t()
            if (r2 == r7) goto Lae
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L6f:
            java.lang.Object r2 = r9.f4966c
            f8.a0 r2 = (f8.a0) r2
            boolean r3 = r2.d()
            if (r3 == 0) goto L93
            java.lang.String r11 = r2.m()
            r3 = 5
            r2.j(r3)
            r1.f4973a = r10
            r1.f4974b = r9
            r1.f4975l = r0
            r1.f4976m = r11
            r1.f4979p = r8
            r10.getClass()
            r10.f8435b = r1
            u6.a r9 = u6.a.f10763a
            return r9
        L93:
            r10 = r0
            r0 = r9
            r9 = r11
        L96:
            java.lang.Object r11 = r0.f4966c
            f8.a0 r11 = (f8.a0) r11
            if (r9 != r5) goto La0
            r11.j(r6)
            goto La2
        La0:
            if (r9 == r7) goto La8
        La2:
            e8.t r9 = new e8.t
            r9.<init>(r10)
            return r9
        La8:
            java.lang.String r9 = "object"
            f8.m.j(r11, r9)
            throw r4
        Lae:
            java.lang.String r9 = "Unexpected leading comma"
            f8.a0.p(r0, r9, r3, r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.q.a(f8.q, p6.b, v6.a):java.lang.Object");
    }

    public void b(int i, int i6) {
        int i10 = i6 + i;
        char[] cArr = (char[]) this.f4966c;
        if (cArr.length <= i10) {
            int i11 = i * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            this.f4966c = Arrays.copyOf(cArr, i10);
        }
    }

    public int c() {
        if ((this.f4965b & 128) != 0) {
            return ((int[]) this.f4966c)[7];
        }
        return 65535;
    }

    public e8.k d() {
        e8.k tVar;
        Object obj;
        a0 a0Var = (a0) this.f4966c;
        byte bT = a0Var.t();
        if (bT == 1) {
            return f(true);
        }
        if (bT == 0) {
            return f(false);
        }
        if (bT != 6) {
            if (bT == 8) {
                return e();
            }
            a0.p(a0Var, "Cannot read Json element because of unexpected ".concat(m.p(bT)), 0, null, 6);
            throw null;
        }
        int i = this.f4965b + 1;
        this.f4965b = i;
        if (i == 200) {
            u uVar = new u(this, null);
            p6.b bVar = new p6.b();
            bVar.f8434a = uVar;
            bVar.f8435b = bVar;
            u6.a aVar = p6.a.f8433a;
            bVar.f8436l = aVar;
            while (true) {
                obj = bVar.f8436l;
                t6.c cVar = bVar.f8435b;
                if (cVar == null) {
                    break;
                }
                if (kotlin.jvm.internal.l.a(aVar, obj)) {
                    try {
                        u uVar2 = bVar.f8434a;
                        kotlin.jvm.internal.a0.b(3, uVar2);
                        u uVar3 = new u(uVar2.f4972l, cVar);
                        uVar3.f4971b = bVar;
                        Object objInvokeSuspend = uVar3.invokeSuspend(p6.x.f8464a);
                        if (objInvokeSuspend != u6.a.f10763a) {
                            cVar.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        cVar.resumeWith(new p6.j(th));
                    }
                } else {
                    bVar.f8436l = aVar;
                    cVar.resumeWith(obj);
                }
            }
            p6.a.e(obj);
            tVar = (e8.k) obj;
        } else {
            byte bJ = a0Var.j((byte) 6);
            if (a0Var.t() == 4) {
                a0.p(a0Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!a0Var.d()) {
                    break;
                }
                String strM = a0Var.m();
                a0Var.j((byte) 5);
                linkedHashMap.put(strM, d());
                bJ = a0Var.i();
                if (bJ != 4) {
                    if (bJ != 7) {
                        a0.p(a0Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bJ == 6) {
                a0Var.j((byte) 7);
            } else if (bJ == 4) {
                m.j(a0Var, "object");
                throw null;
            }
            tVar = new e8.t(linkedHashMap);
        }
        this.f4965b--;
        return tVar;
    }

    public e8.d e() {
        a0 a0Var = (a0) this.f4966c;
        byte bI = a0Var.i();
        if (a0Var.t() == 4) {
            a0.p(a0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (a0Var.d()) {
            arrayList.add(d());
            bI = a0Var.i();
            if (bI != 4) {
                boolean z9 = bI == 9;
                int i = a0Var.f4931b;
                if (!z9) {
                    a0.p(a0Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bI == 8) {
            a0Var.j((byte) 9);
        } else if (bI == 4) {
            m.j(a0Var, "array");
            throw null;
        }
        return new e8.d(arrayList);
    }

    public e8.x f(boolean z9) {
        a0 a0Var = (a0) this.f4966c;
        String strN = !z9 ? a0Var.n() : a0Var.m();
        return (z9 || !kotlin.jvm.internal.l.a(strN, "null")) ? new e8.n(strN, z9) : e8.q.INSTANCE;
    }

    public void g() {
        c cVar = c.f4939c;
        char[] cArr = (char[]) this.f4966c;
        cVar.getClass();
        cArr.getClass();
        synchronized (cVar) {
            int i = cVar.f4941b;
            if (cArr.length + i < b.f4936a) {
                cVar.f4941b = i + cArr.length;
                cVar.f4940a.addLast(cArr);
            }
        }
    }

    public void h(int i, int i6) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f4966c;
            if (i >= iArr.length) {
                return;
            }
            this.f4965b = (1 << i) | this.f4965b;
            iArr[i] = i6;
        }
    }

    public void i(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        b(this.f4965b, length);
        str.getChars(0, str.length(), (char[]) this.f4966c, this.f4965b);
        this.f4965b += length;
    }

    public String toString() {
        switch (this.f4964a) {
            case 0:
                return new String((char[]) this.f4966c, 0, this.f4965b);
            default:
                return super.toString();
        }
    }

    public q(h0.b bVar, int i) {
        this.f4964a = 2;
        k0.y.g(bVar);
        this.f4966c = bVar;
        this.f4965b = i;
    }

    public q(e8.h hVar, a0 a0Var) {
        this.f4964a = 1;
        hVar.getClass();
        this.f4966c = a0Var;
    }
}
