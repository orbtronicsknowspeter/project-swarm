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
    public final /* synthetic */ int f6689a;

    public /* synthetic */ h(int i) {
        this.f6689a = i;
    }

    @Override // m8.v
    public final c0 a(q8.d dVar) throws ProtocolException {
        switch (this.f6689a) {
            case 0:
                c0 c0VarA = dVar.a(dVar.f);
                if (c0VarA.f7700r == null) {
                    e0 e0Var = c0VarA.f7698p;
                    long jB = e0Var != null ? e0Var.b() : -1L;
                    if (jB > 0) {
                        j.a(2, jB);
                    }
                }
                return c0VarA;
            default:
                q8.a aVar = dVar.f8788c;
                p8.e eVar = dVar.f8787b;
                a0 a0Var = dVar.f;
                long jCurrentTimeMillis = System.currentTimeMillis();
                dVar.h.getClass();
                aVar.a(a0Var);
                t0.f.B(a0Var.f7674b);
                aVar.b();
                b0 b0VarC = aVar.c(false);
                b0VarC.f7683a = a0Var;
                b0VarC.f7687e = eVar.a().f;
                b0VarC.f7688k = jCurrentTimeMillis;
                b0VarC.f7689l = System.currentTimeMillis();
                c0 c0VarA2 = b0VarC.a();
                int i = c0VarA2.f7694l;
                if (i == 100) {
                    b0 b0VarC2 = aVar.c(false);
                    b0VarC2.f7683a = a0Var;
                    b0VarC2.f7687e = eVar.a().f;
                    b0VarC2.f7688k = jCurrentTimeMillis;
                    b0VarC2.f7689l = System.currentTimeMillis();
                    c0VarA2 = b0VarC2.a();
                    i = c0VarA2.f7694l;
                }
                b0 b0VarD = c0VarA2.d();
                b0VarD.g = aVar.e(c0VarA2);
                c0 c0VarA3 = b0VarD.a();
                e0 e0Var2 = c0VarA3.f7698p;
                if ("close".equalsIgnoreCase(c0VarA3.f7692a.f7675c.a("Connection")) || "close".equalsIgnoreCase(c0VarA3.c("Connection"))) {
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
