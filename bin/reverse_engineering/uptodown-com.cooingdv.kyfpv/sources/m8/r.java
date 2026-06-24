package m8;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f7783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f7784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7786d;

    public r(g0 g0Var, l lVar, List list, List list2) {
        this.f7783a = g0Var;
        this.f7784b = lVar;
        this.f7785c = list;
        this.f7786d = list2;
    }

    public static r a(SSLSession sSLSession) {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("cipherSuite == null");
            return null;
        }
        l lVarA = l.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("tlsVersion == null");
            return null;
        }
        g0 g0VarA = g0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listL = peerCertificates != null ? n8.c.l(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new r(g0VarA, lVarA, listL, localCertificates != null ? n8.c.l(localCertificates) : Collections.EMPTY_LIST);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f7783a.equals(rVar.f7783a) && this.f7784b.equals(rVar.f7784b) && this.f7785c.equals(rVar.f7785c) && this.f7786d.equals(rVar.f7786d);
    }

    public final int hashCode() {
        return this.f7786d.hashCode() + ((this.f7785c.hashCode() + ((this.f7784b.hashCode() + ((this.f7783a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
