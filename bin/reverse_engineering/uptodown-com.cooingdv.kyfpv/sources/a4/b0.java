package a4;

import android.net.NetworkInfo;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.i f73a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f74b;

    public b0(f0.i iVar, o0 o0Var) {
        this.f73a = iVar;
        this.f74b = o0Var;
    }

    @Override // a4.n0
    public final boolean b(k0 k0Var) {
        String scheme = ((Uri) k0Var.f127b).getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // a4.n0
    public final int d() {
        return 2;
    }

    @Override // a4.n0
    public final m0 e(k0 k0Var, int i) throws z, a0 {
        m8.i iVar;
        if (i == 0) {
            iVar = null;
        } else if ((i & 4) != 0) {
            iVar = m8.i.f7735n;
        } else {
            m8.h hVar = new m8.h();
            if ((i & 1) != 0) {
                hVar.f7731a = true;
            }
            if ((i & 2) != 0) {
                hVar.f7732b = true;
            }
            iVar = new m8.i(hVar);
        }
        y2.s sVar = new y2.s(9);
        sVar.D(((Uri) k0Var.f127b).toString());
        if (iVar != null) {
            String string = iVar.toString();
            if (string.isEmpty()) {
                ((g5.f) sVar.f11758m).Q("Cache-Control");
            } else {
                sVar.w("Cache-Control", string);
            }
        }
        m8.a0 a0VarN = sVar.n();
        m8.x xVar = (m8.x) this.f73a.f4812b;
        m8.z zVar = new m8.z(xVar, a0VarN);
        xVar.f7819o.getClass();
        zVar.f7839l = m8.b.f7682d;
        synchronized (zVar) {
            if (zVar.f7841n) {
                throw new IllegalStateException("Already Executed");
            }
            zVar.f7841n = true;
        }
        zVar.f7838b.f8795b = u8.h.f10784a.i();
        zVar.f7839l.getClass();
        try {
            try {
                xVar.f7814a.e(zVar);
                m8.c0 c0VarA = zVar.a();
                xVar.f7814a.f(zVar);
                m8.e0 e0Var = c0VarA.f7699p;
                int i6 = c0VarA.f7695l;
                if (i6 < 200 || i6 >= 300) {
                    e0Var.close();
                    throw new a0(androidx.lifecycle.l.u(c0VarA.f7695l, "HTTP "));
                }
                int i10 = c0VarA.f7701r == null ? 3 : 2;
                if (i10 == 2 && e0Var.b() == 0) {
                    e0Var.close();
                    throw new z("Received response with 0 content-length header.");
                }
                if (i10 == 3 && e0Var.b() > 0) {
                    o0 o0Var = this.f74b;
                    long jB = e0Var.b();
                    n nVar = o0Var.f148b;
                    nVar.sendMessage(nVar.obtainMessage(4, Long.valueOf(jB)));
                }
                return new m0(e0Var.c(), i10);
            } catch (IOException e10) {
                zVar.f7839l.getClass();
                throw e10;
            }
        } catch (Throwable th) {
            zVar.f7837a.f7814a.f(zVar);
            throw th;
        }
    }

    @Override // a4.n0
    public final boolean f(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
