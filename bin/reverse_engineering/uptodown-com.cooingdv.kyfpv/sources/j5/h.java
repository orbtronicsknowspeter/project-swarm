package j5;

import a4.x;
import java.net.ProtocolException;
import m8.a0;
import m8.b0;
import m8.c0;
import m8.e0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements m8.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6690a;

    public /* synthetic */ h(int i) {
        this.f6690a = i;
    }

    @Override // m8.v
    public final c0 a(q8.d dVar) throws ProtocolException {
        switch (this.f6690a) {
            case 0:
                c0 c0VarA = dVar.a(dVar.f);
                if (c0VarA.f7701r == null) {
                    e0 e0Var = c0VarA.f7699p;
                    long jB = e0Var != null ? e0Var.b() : -1L;
                    if (jB > 0) {
                        j.a(2, jB);
                    }
                }
                return c0VarA;
            default:
                q8.a aVar = dVar.f8789c;
                p8.e eVar = dVar.f8788b;
                a0 a0Var = dVar.f;
                long jCurrentTimeMillis = System.currentTimeMillis();
                dVar.h.getClass();
                aVar.a(a0Var);
                t0.f.B(a0Var.f7675b);
                aVar.b();
                b0 b0VarC = aVar.c(false);
                b0VarC.f7684a = a0Var;
                b0VarC.f7688e = eVar.a().f;
                b0VarC.f7689k = jCurrentTimeMillis;
                b0VarC.f7690l = System.currentTimeMillis();
                c0 c0VarA2 = b0VarC.a();
                int i = c0VarA2.f7695l;
                if (i == 100) {
                    b0 b0VarC2 = aVar.c(false);
                    b0VarC2.f7684a = a0Var;
                    b0VarC2.f7688e = eVar.a().f;
                    b0VarC2.f7689k = jCurrentTimeMillis;
                    b0VarC2.f7690l = System.currentTimeMillis();
                    c0VarA2 = b0VarC2.a();
                    i = c0VarA2.f7695l;
                }
                b0 b0VarD = c0VarA2.d();
                b0VarD.g = aVar.e(c0VarA2);
                c0 c0VarA3 = b0VarD.a();
                e0 e0Var2 = c0VarA3.f7699p;
                if ("close".equalsIgnoreCase(c0VarA3.f7693a.f7676c.a("Connection")) || "close".equalsIgnoreCase(c0VarA3.c("Connection"))) {
                    eVar.e();
                }
                if ((i != 204 && i != 205) || e0Var2.b() <= 0) {
                    return c0VarA3;
                }
                StringBuilder sbP = x.p(i, "HTTP ", " had non-zero Content-Length: ");
                sbP.append(e0Var2.b());
                throw new ProtocolException(sbP.toString());
        }
    }
}
