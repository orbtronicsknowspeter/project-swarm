package m8;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f7712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f7713l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f7715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f7717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7718e;
    public final String f;
    public final s g;
    public final r h;
    public final long i;
    public final long j;

    static {
        u8.h hVar = u8.h.f10784a;
        hVar.getClass();
        f7712k = "OkHttp-Sent-Millis";
        hVar.getClass();
        f7713l = "OkHttp-Received-Millis";
    }

    public f(w8.g0 g0Var) throws IOException {
        try {
            g0Var.getClass();
            w8.a0 a0Var = new w8.a0(g0Var);
            this.f7714a = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            this.f7716c = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            g5.f fVar = new g5.f(9);
            int iB = g.b(a0Var);
            for (int i = 0; i < iB; i++) {
                fVar.n(a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL));
            }
            this.f7715b = new s(fVar);
            f8.o oVarD = f8.o.d(a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL));
            this.f7717d = (y) oVarD.f4961b;
            this.f7718e = oVarD.f4962c;
            this.f = (String) oVarD.f4963d;
            g5.f fVar2 = new g5.f(9);
            int iB2 = g.b(a0Var);
            for (int i6 = 0; i6 < iB2; i6++) {
                fVar2.n(a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL));
            }
            String str = f7712k;
            String strC = fVar2.C(str);
            String str2 = f7713l;
            String strC2 = fVar2.C(str2);
            fVar2.Q(str);
            fVar2.Q(str2);
            this.i = strC != null ? Long.parseLong(strC) : 0L;
            this.j = strC2 != null ? Long.parseLong(strC2) : 0L;
            this.g = new s(fVar2);
            if (this.f7714a.startsWith("https://")) {
                String strK = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
                if (strK.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strK + "\"");
                }
                this.h = new r(!a0Var.b() ? g0.a(a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL)) : g0.SSL_3_0, l.a(a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL)), n8.c.k(a(a0Var)), n8.c.k(a(a0Var)));
            } else {
                this.h = null;
            }
            g0Var.close();
        } catch (Throwable th) {
            g0Var.close();
            throw th;
        }
    }

    public static List a(w8.a0 a0Var) throws IOException {
        int iB = g.b(a0Var);
        if (iB == -1) {
            return Collections.EMPTY_LIST;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iB);
            for (int i = 0; i < iB; i++) {
                String strK = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
                w8.h hVar = new w8.h();
                hVar.y(w8.k.c(strK));
                arrayList.add(certificateFactory.generateCertificate(new w8.f(hVar, 0)));
            }
            return arrayList;
        } catch (CertificateException e10) {
            com.google.gson.internal.a.n(e10.getMessage());
            return null;
        }
    }

    public static void b(w8.z zVar, List list) throws IOException {
        try {
            zVar.c(list.size());
            zVar.writeByte(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zVar.m(w8.k.n(((Certificate) list.get(i)).getEncoded()).a());
                zVar.writeByte(10);
            }
        } catch (CertificateEncodingException e10) {
            com.google.gson.internal.a.n(e10.getMessage());
        }
    }

    public final void c(a2.t tVar) {
        w8.z zVar = new w8.z(tVar.j(0));
        String str = this.f7714a;
        zVar.m(str);
        zVar.writeByte(10);
        zVar.m(this.f7716c);
        zVar.writeByte(10);
        s sVar = this.f7715b;
        zVar.c(sVar.d());
        zVar.writeByte(10);
        int iD = sVar.d();
        for (int i = 0; i < iD; i++) {
            zVar.m(sVar.b(i));
            zVar.m(": ");
            zVar.m(sVar.e(i));
            zVar.writeByte(10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7717d == y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f7718e);
        String str2 = this.f;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        zVar.m(sb.toString());
        zVar.writeByte(10);
        s sVar2 = this.g;
        zVar.c(sVar2.d() + 2);
        zVar.writeByte(10);
        int iD2 = sVar2.d();
        for (int i6 = 0; i6 < iD2; i6++) {
            zVar.m(sVar2.b(i6));
            zVar.m(": ");
            zVar.m(sVar2.e(i6));
            zVar.writeByte(10);
        }
        zVar.m(f7712k);
        zVar.m(": ");
        zVar.c(this.i);
        zVar.writeByte(10);
        zVar.m(f7713l);
        zVar.m(": ");
        zVar.c(this.j);
        zVar.writeByte(10);
        if (str.startsWith("https://")) {
            zVar.writeByte(10);
            r rVar = this.h;
            zVar.m(rVar.f7784b.f7757a);
            zVar.writeByte(10);
            b(zVar, rVar.f7785c);
            b(zVar, rVar.f7786d);
            zVar.m(rVar.f7783a.f7730a);
            zVar.writeByte(10);
        }
        zVar.close();
    }

    public f(c0 c0Var) {
        s sVar;
        a0 a0Var = c0Var.f7693a;
        this.f7714a = a0Var.f7674a.i;
        int i = q8.c.f8786a;
        s sVar2 = c0Var.f7700q.f7693a.f7676c;
        s sVar3 = c0Var.f7698o;
        Set setF = q8.c.f(sVar3);
        if (setF.isEmpty()) {
            sVar = new s(new g5.f(9));
        } else {
            g5.f fVar = new g5.f(9);
            int iD = sVar2.d();
            for (int i6 = 0; i6 < iD; i6++) {
                String strB = sVar2.b(i6);
                if (setF.contains(strB)) {
                    String strE = sVar2.e(i6);
                    g5.f.v(strB, strE);
                    fVar.o(strB, strE);
                }
            }
            sVar = new s(fVar);
        }
        this.f7715b = sVar;
        this.f7716c = a0Var.f7675b;
        this.f7717d = c0Var.f7694b;
        this.f7718e = c0Var.f7695l;
        this.f = c0Var.f7696m;
        this.g = sVar3;
        this.h = c0Var.f7697n;
        this.i = c0Var.f7703t;
        this.j = c0Var.f7704u;
    }
}
