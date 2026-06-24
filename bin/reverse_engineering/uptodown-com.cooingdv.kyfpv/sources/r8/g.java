package r8;

import f8.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import m8.b0;
import m8.c0;
import m8.d0;
import m8.s;
import m8.u;
import m8.x;
import m8.y;
import w8.a0;
import w8.e0;
import w8.i;
import w8.j;
import w8.z;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements q8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f9100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.e f9101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f9102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f9103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9104e = 0;
    public long f = 262144;

    public g(x xVar, p8.e eVar, a0 a0Var, z zVar) {
        this.f9100a = xVar;
        this.f9101b = eVar;
        this.f9102c = a0Var;
        this.f9103d = zVar;
    }

    @Override // q8.a
    public final void a(m8.a0 a0Var) {
        Proxy.Type type = this.f9101b.a().f8471c.f7720b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(a0Var.f7675b);
        sb.append(' ');
        u uVar = a0Var.f7674a;
        if (uVar.f7793a.equals("https") || type != Proxy.Type.HTTP) {
            String str = uVar.i;
            int iIndexOf = str.indexOf(47, uVar.f7793a.length() + 3);
            String strSubstring = str.substring(iIndexOf, n8.c.g(iIndexOf, str.length(), str, "?#"));
            String strE = uVar.e();
            if (strE != null) {
                strSubstring = strSubstring + '?' + strE;
            }
            sb.append(strSubstring);
        } else {
            sb.append(uVar);
        }
        sb.append(" HTTP/1.1");
        h(a0Var.f7676c, sb.toString());
    }

    @Override // q8.a
    public final void b() {
        this.f9103d.flush();
    }

    @Override // q8.a
    public final b0 c(boolean z9) {
        j jVar = this.f9102c;
        int i = this.f9104e;
        if (i != 1 && i != 3) {
            com.google.gson.internal.a.f(this.f9104e, "state: ");
            return null;
        }
        try {
            String strK = jVar.k(this.f);
            this.f -= (long) strK.length();
            o oVarD = o.d(strK);
            int i6 = oVarD.f4962c;
            b0 b0Var = new b0();
            b0Var.f7685b = (y) oVarD.f4961b;
            b0Var.f7686c = i6;
            b0Var.f7687d = (String) oVarD.f4963d;
            g5.f fVar = new g5.f(9);
            while (true) {
                String strK2 = jVar.k(this.f);
                this.f -= (long) strK2.length();
                if (strK2.length() == 0) {
                    break;
                }
                m8.b.f7683e.getClass();
                fVar.n(strK2);
            }
            ArrayList arrayList = (ArrayList) fVar.f5310b;
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            g5.f fVar2 = new g5.f(9);
            Collections.addAll((ArrayList) fVar2.f5310b, strArr);
            b0Var.f = fVar2;
            if (z9 && i6 == 100) {
                return null;
            }
            if (i6 == 100) {
                this.f9104e = 3;
                return b0Var;
            }
            this.f9104e = 4;
            return b0Var;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f9101b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    @Override // q8.a
    public final void d() {
        this.f9103d.flush();
    }

    @Override // q8.a
    public final d0 e(c0 c0Var) {
        p8.e eVar = this.f9101b;
        eVar.f8491e.getClass();
        c0Var.c("Content-Type");
        if (!q8.c.b(c0Var)) {
            return new d0(0L, new a0(g(0L)), 1);
        }
        if ("chunked".equalsIgnoreCase(c0Var.c("Transfer-Encoding"))) {
            u uVar = c0Var.f7693a.f7674a;
            if (this.f9104e == 4) {
                this.f9104e = 5;
                return new d0(-1L, new a0(new c(this, uVar)), 1);
            }
            com.google.gson.internal.a.f(this.f9104e, "state: ");
            return null;
        }
        long jA = q8.c.a(c0Var);
        if (jA != -1) {
            return new d0(jA, new a0(g(jA)), 1);
        }
        if (this.f9104e != 4) {
            com.google.gson.internal.a.f(this.f9104e, "state: ");
            return null;
        }
        this.f9104e = 5;
        eVar.e();
        return new d0(-1L, new a0(new f(this)), 1);
    }

    @Override // q8.a
    public final e0 f(m8.a0 a0Var, long j) {
        if ("chunked".equalsIgnoreCase(a0Var.f7676c.a("Transfer-Encoding"))) {
            if (this.f9104e == 1) {
                this.f9104e = 2;
                return new b(this);
            }
            com.google.gson.internal.a.f(this.f9104e, "state: ");
            return null;
        }
        if (j == -1) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f9104e == 1) {
            this.f9104e = 2;
            return new d(this, j);
        }
        com.google.gson.internal.a.f(this.f9104e, "state: ");
        return null;
    }

    public final e g(long j) {
        if (this.f9104e != 4) {
            com.google.gson.internal.a.f(this.f9104e, "state: ");
            return null;
        }
        this.f9104e = 5;
        e eVar = new e(this);
        eVar.f9098n = j;
        if (j == 0) {
            eVar.b(true, null);
        }
        return eVar;
    }

    public final void h(s sVar, String str) {
        if (this.f9104e != 0) {
            com.google.gson.internal.a.f(this.f9104e, "state: ");
            return;
        }
        i iVar = this.f9103d;
        iVar.m(str).m("\r\n");
        int iD = sVar.d();
        for (int i = 0; i < iD; i++) {
            iVar.m(sVar.b(i)).m(": ").m(sVar.e(i)).m("\r\n");
        }
        iVar.m("\r\n");
        this.f9104e = 1;
    }
}
