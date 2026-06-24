package s8;

import com.google.android.gms.internal.measurement.z3;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import m8.b0;
import m8.c0;
import m8.d0;
import w8.e0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements q8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f9400e;
    public static final List f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8.d f9401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.e f9402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f9403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f9404d;

    static {
        w8.k kVar = w8.k.f10970m;
        w8.k kVarM = z3.m("connection");
        w8.k kVarM2 = z3.m("host");
        w8.k kVarM3 = z3.m("keep-alive");
        w8.k kVarM4 = z3.m("proxy-connection");
        w8.k kVarM5 = z3.m("transfer-encoding");
        w8.k kVarM6 = z3.m("te");
        w8.k kVarM7 = z3.m("encoding");
        w8.k kVarM8 = z3.m("upgrade");
        f9400e = n8.c.l(kVarM, kVarM2, kVarM3, kVarM4, kVarM6, kVarM5, kVarM7, kVarM8, b.f, b.g, b.h, b.i);
        f = n8.c.l(kVarM, kVarM2, kVarM3, kVarM4, kVarM6, kVarM5, kVarM7, kVarM8);
    }

    public g(q8.d dVar, p8.e eVar, q qVar) {
        this.f9401a = dVar;
        this.f9402b = eVar;
        this.f9403c = qVar;
    }

    @Override // q8.a
    public final void a(m8.a0 a0Var) {
        int i;
        w wVar;
        if (this.f9404d != null) {
            return;
        }
        a0Var.getClass();
        m8.s sVar = a0Var.f7675c;
        ArrayList arrayList = new ArrayList(sVar.d() + 4);
        arrayList.add(new b(b.f, a0Var.f7674b));
        w8.k kVar = b.g;
        m8.u uVar = a0Var.f7673a;
        String str = uVar.i;
        int iIndexOf = str.indexOf(47, uVar.f7792a.length() + 3);
        String strSubstring = str.substring(iIndexOf, n8.c.g(iIndexOf, str.length(), str, "?#"));
        String strE = uVar.e();
        if (strE != null) {
            strSubstring = strSubstring + '?' + strE;
        }
        arrayList.add(new b(kVar, strSubstring));
        String strA = a0Var.f7675c.a("Host");
        if (strA != null) {
            arrayList.add(new b(b.i, strA));
        }
        arrayList.add(new b(b.h, uVar.f7792a));
        int iD = sVar.d();
        for (int i6 = 0; i6 < iD; i6++) {
            String lowerCase = sVar.b(i6).toLowerCase(Locale.US);
            w8.k kVar2 = w8.k.f10970m;
            w8.k kVarM = z3.m(lowerCase);
            if (!f9400e.contains(kVarM)) {
                arrayList.add(new b(kVarM, sVar.e(i6)));
            }
        }
        q qVar = this.f9403c;
        boolean z9 = !false;
        synchronized (qVar.A) {
            synchronized (qVar) {
                try {
                    if (qVar.f9432o > 1073741823) {
                        qVar.h(5);
                    }
                    if (qVar.f9433p) {
                        throw new a();
                    }
                    i = qVar.f9432o;
                    qVar.f9432o = i + 2;
                    wVar = new w(i, qVar, z9, false, arrayList);
                    if (wVar.g()) {
                        qVar.f9429l.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qVar.A.n(arrayList, i, z9);
        }
        qVar.A.flush();
        this.f9404d = wVar;
        wVar.i.g(this.f9401a.j);
        this.f9404d.j.g(this.f9401a.f8791k);
    }

    @Override // q8.a
    public final void b() {
        this.f9404d.e().close();
    }

    @Override // q8.a
    public final b0 c(boolean z9) throws ProtocolException {
        ArrayList arrayList;
        w wVar = this.f9404d;
        synchronized (wVar) {
            if (!wVar.f()) {
                throw new IllegalStateException("servers cannot read response headers");
            }
            wVar.i.h();
            while (wVar.f9469e == null && wVar.f9470k == 0) {
                try {
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    wVar.i.k();
                    throw th;
                }
            }
            wVar.i.k();
            arrayList = wVar.f9469e;
            if (arrayList == null) {
                throw new a0(wVar.f9470k);
            }
            wVar.f9469e = null;
        }
        g5.f fVar = new g5.f(9);
        int size = arrayList.size();
        f8.o oVarD = null;
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            if (bVar != null) {
                w8.k kVar = bVar.f9383a;
                String strT = bVar.f9384b.t();
                if (kVar.equals(b.f9382e)) {
                    oVarD = f8.o.d("HTTP/1.1 ".concat(strT));
                } else if (!f.contains(kVar)) {
                    m8.b bVar2 = m8.b.f7682e;
                    String strT2 = kVar.t();
                    bVar2.getClass();
                    fVar.o(strT2, strT);
                }
            } else if (oVarD != null && oVarD.f4961c == 100) {
                fVar = new g5.f(9);
                oVarD = null;
            }
        }
        if (oVarD == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        b0 b0Var = new b0();
        b0Var.f7684b = m8.y.HTTP_2;
        b0Var.f7685c = oVarD.f4961c;
        b0Var.f7686d = (String) oVarD.f4962d;
        ArrayList arrayList2 = (ArrayList) fVar.f5309b;
        String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        g5.f fVar2 = new g5.f(9);
        Collections.addAll((ArrayList) fVar2.f5309b, strArr);
        b0Var.f = fVar2;
        if (z9) {
            m8.b.f7682e.getClass();
            if (b0Var.f7685c == 100) {
                return null;
            }
        }
        return b0Var;
    }

    @Override // q8.a
    public final void d() {
        this.f9403c.flush();
    }

    @Override // q8.a
    public final d0 e(c0 c0Var) {
        this.f9402b.f8490e.getClass();
        c0Var.c("Content-Type");
        return new d0(q8.c.a(c0Var), new w8.a0(new f(this, this.f9404d.g)), 1);
    }

    @Override // q8.a
    public final e0 f(m8.a0 a0Var, long j) {
        return this.f9404d.e();
    }
}
