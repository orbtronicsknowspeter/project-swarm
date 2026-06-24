package e1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4297d;

    public u0(w0 w0Var, int i, boolean z9, boolean z10) {
        this.f4297d = w0Var;
        this.f4294a = i;
        this.f4295b = z9;
        this.f4296c = z10;
    }

    public m8.o a(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z9;
        m8.o oVar;
        int i = this.f4294a;
        List list = (List) this.f4297d;
        int size = list.size();
        while (true) {
            z9 = true;
            if (i >= size) {
                oVar = null;
                break;
            }
            oVar = (m8.o) list.get(i);
            if (oVar.a(sSLSocket)) {
                this.f4294a = i + 1;
                break;
            }
            i++;
        }
        if (oVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f4296c);
            sb.append(", modes=");
            sb.append(list);
            String string = Arrays.toString(sSLSocket.getEnabledProtocols());
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i6 = this.f4294a;
        while (true) {
            if (i6 >= list.size()) {
                z9 = false;
                break;
            }
            if (((m8.o) list.get(i6)).a(sSLSocket)) {
                break;
            }
            i6++;
        }
        this.f4295b = z9;
        m8.b bVar = m8.b.f7683e;
        boolean z10 = this.f4296c;
        bVar.getClass();
        String[] strArr = oVar.f7771d;
        String[] strArr2 = oVar.f7770c;
        String[] strArrM = strArr2 != null ? n8.c.m(m8.l.f7747b, sSLSocket.getEnabledCipherSuites(), strArr2) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM2 = strArr != null ? n8.c.m(n8.c.f, sSLSocket.getEnabledProtocols(), strArr) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        m8.k kVar = m8.l.f7747b;
        byte[] bArr = n8.c.f8115a;
        int length = supportedCipherSuites.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (kVar.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i10++;
        }
        if (z10 && i10 != -1) {
            String str = supportedCipherSuites[i10];
            int length2 = strArrM.length;
            String[] strArr3 = new String[length2 + 1];
            System.arraycopy(strArrM, 0, strArr3, 0, strArrM.length);
            strArr3[length2] = str;
            strArrM = strArr3;
        }
        m8.n nVar = new m8.n(oVar);
        nVar.a(strArrM);
        nVar.b(strArrM2);
        m8.o oVar2 = new m8.o(nVar);
        String[] strArr4 = oVar2.f7771d;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = oVar2.f7770c;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
        return oVar;
    }

    public void b(String str) {
        ((w0) this.f4297d).p(this.f4294a, this.f4295b, this.f4296c, str, null, null, null);
    }

    public void c(Object obj, String str) {
        ((w0) this.f4297d).p(this.f4294a, this.f4295b, this.f4296c, str, obj, null, null);
    }

    public void d(Object obj, String str, Object obj2) {
        ((w0) this.f4297d).p(this.f4294a, this.f4295b, this.f4296c, str, obj, obj2, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((w0) this.f4297d).p(this.f4294a, this.f4295b, this.f4296c, str, obj, obj2, obj3);
    }

    public u0(List list) {
        this.f4294a = 0;
        this.f4297d = list;
    }
}
