package m8;

import com.google.android.gms.internal.measurement.z3;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements Cloneable {
    public static final List H = n8.c.l(y.HTTP_2, y.HTTP_1_1);
    public static final List I = n8.c.l(o.f7767e, o.f);
    public final b A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f7814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7815b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f7816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f7817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f7818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f7819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProxySelector f7820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f7821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f7822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SocketFactory f7823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SSLSocketFactory f7824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z3 f7825u;
    public final v8.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f7826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f7827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f7828y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m f7829z;

    static {
        b.f7683e = new b();
    }

    public x(w wVar) {
        boolean z9;
        this.f7814a = wVar.f7798a;
        this.f7815b = wVar.f7799b;
        List list = wVar.f7800c;
        this.f7816l = list;
        this.f7817m = n8.c.k(wVar.f7801d);
        this.f7818n = n8.c.k(wVar.f7802e);
        this.f7819o = wVar.f;
        this.f7820p = wVar.g;
        this.f7821q = wVar.h;
        this.f7822r = wVar.i;
        this.f7823s = wVar.j;
        Iterator it = list.iterator();
        loop0: while (true) {
            z9 = false;
            while (it.hasNext()) {
                z9 = (z9 || ((o) it.next()).f7768a) ? true : z9;
            }
        }
        if (z9) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            u8.h hVar = u8.h.f10784a;
                            SSLContext sSLContextG = hVar.g();
                            sSLContextG.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f7824t = sSLContextG.getSocketFactory();
                            this.f7825u = hVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e10) {
                            throw n8.c.a("No System TLS", e10);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e11) {
                throw n8.c.a("No System TLS", e11);
            }
        }
        this.f7824t = null;
        this.f7825u = null;
        this.v = wVar.f7803k;
        j jVar = wVar.f7804l;
        z3 z3Var = this.f7825u;
        this.f7826w = n8.c.i(jVar.f7746b, z3Var) ? jVar : new j(jVar.f7745a, z3Var);
        this.f7827x = wVar.f7805m;
        this.f7828y = wVar.f7806n;
        this.f7829z = wVar.f7807o;
        this.A = wVar.f7808p;
        this.B = wVar.f7809q;
        this.C = wVar.f7810r;
        this.D = wVar.f7811s;
        this.E = wVar.f7812t;
        this.F = wVar.f7813u;
        this.G = wVar.v;
        if (this.f7817m.contains(null)) {
            com.google.gson.internal.a.h(this.f7817m, "Null interceptor: ");
            throw null;
        }
        if (this.f7818n.contains(null)) {
            com.google.gson.internal.a.h(this.f7818n, "Null network interceptor: ");
            throw null;
        }
    }
}
