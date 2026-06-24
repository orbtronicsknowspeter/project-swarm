package o8;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import m8.a0;
import m8.b0;
import m8.c0;
import m8.v;
import m8.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8343b;

    public /* synthetic */ b(Object obj, int i) {
        this.f8342a = i;
        this.f8343b = obj;
    }

    private final c0 b(q8.d dVar) {
        a0 a0Var = dVar.f;
        p8.e eVar = dVar.f8788b;
        boolean z9 = !a0Var.f7675b.equals(ShareTarget.METHOD_GET);
        x xVar = (x) this.f8343b;
        eVar.getClass();
        try {
            q8.a aVarI = eVar.d(dVar.i, dVar.j, dVar.f8792k, xVar.D, z9).i(xVar, dVar, eVar);
            synchronized (eVar.f8490d) {
                eVar.f8493l = aVarI;
            }
            return dVar.b(a0Var, eVar, aVarI, eVar.a());
        } catch (IOException e10) {
            throw new p8.b(e10);
        }
    }

    public static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static c0 d(c0 c0Var) {
        if (c0Var == null || c0Var.f7699p == null) {
            return c0Var;
        }
        b0 b0VarD = c0Var.d();
        b0VarD.g = null;
        return b0VarD.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f5  */
    @Override // m8.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m8.c0 a(q8.d r35) {
        /*
            Method dump skipped, instruction units count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.b.a(q8.d):m8.c0");
    }
}
