package q8;

import javax.net.ssl.SSLSocketFactory;
import m8.c0;
import m8.j;
import m8.u;
import m8.v;
import m8.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f8794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8795b;

    public e(x xVar) {
        this.f8794a = xVar;
    }

    public static boolean d(c0 c0Var, u uVar) {
        u uVar2 = c0Var.f7693a.f7674a;
        return uVar2.f7796d.equals(uVar.f7796d) && uVar2.f7797e == uVar.f7797e && uVar2.f7793a.equals(uVar.f7793a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x017d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [m8.e0, p8.a, q8.a] */
    /* JADX WARN: Type inference failed for: r10v4 */
    @Override // m8.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m8.c0 a(q8.d r18) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.e.a(q8.d):m8.c0");
    }

    public final m8.a b(u uVar) {
        SSLSocketFactory sSLSocketFactory;
        v8.c cVar;
        j jVar;
        boolean zEquals = uVar.f7793a.equals("https");
        x xVar = this.f8794a;
        if (zEquals) {
            sSLSocketFactory = xVar.f7824t;
            cVar = xVar.v;
            jVar = xVar.f7826w;
        } else {
            sSLSocketFactory = null;
            cVar = null;
            jVar = null;
        }
        return new m8.a(uVar.f7796d, uVar.f7797e, xVar.A, xVar.f7823s, sSLSocketFactory, cVar, jVar, xVar.f7827x, xVar.f7815b, xVar.f7816l, xVar.f7820p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r5 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.io.IOException r3, p8.e r4, boolean r5, m8.a0 r6) {
        /*
            r2 = this;
            r4.g(r3)
            m8.x r0 = r2.f8794a
            boolean r0 = r0.D
            r1 = 0
            if (r0 != 0) goto Lb
            goto L2c
        Lb:
            if (r5 == 0) goto L10
            r6.getClass()
        L10:
            boolean r6 = r3 instanceof java.net.ProtocolException
            if (r6 == 0) goto L15
            return r1
        L15:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L20
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L2c
            if (r5 != 0) goto L2c
            goto L32
        L20:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L2d
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L2d
        L2c:
            return r1
        L2d:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L32
            return r1
        L32:
            m8.f0 r3 = r4.f8489c
            if (r3 != 0) goto L5c
            a2.q r3 = r4.f8488b
            if (r3 == 0) goto L45
            int r5 = r3.f44b
            java.util.ArrayList r3 = r3.f43a
            int r3 = r3.size()
            if (r5 >= r3) goto L45
            goto L5c
        L45:
            p8.c r3 = r4.g
            int r4 = r3.f8485e
            java.util.List r5 = r3.f8484d
            int r5 = r5.size()
            if (r4 >= r5) goto L52
            goto L5c
        L52:
            java.util.ArrayList r3 = r3.g
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L5b
            goto L5c
        L5b:
            return r1
        L5c:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.e.c(java.io.IOException, p8.e, boolean, m8.a0):boolean");
    }
}
