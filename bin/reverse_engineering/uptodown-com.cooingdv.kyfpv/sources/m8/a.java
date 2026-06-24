package m8;

import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f7669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SocketFactory f7671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f7672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7673e;
    public final List f;
    public final ProxySelector g;
    public final SSLSocketFactory h;
    public final HostnameVerifier i;
    public final j j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, v8.c cVar, j jVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        t tVar = new t();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            tVar.f7788a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                com.google.gson.internal.a.p("unexpected scheme: ".concat(str2));
                throw null;
            }
            tVar.f7788a = "https";
        }
        if (str == null) {
            com.google.gson.internal.a.i("host == null");
            throw null;
        }
        String strB = n8.c.b(u.h(str, 0, str.length(), false));
        if (strB == null) {
            com.google.gson.internal.a.p("unexpected host: ".concat(str));
            throw null;
        }
        tVar.f7791d = strB;
        if (i <= 0 || i > 65535) {
            com.google.gson.internal.a.p(androidx.lifecycle.l.u(i, "unexpected port: "));
            throw null;
        }
        tVar.f7792e = i;
        this.f7669a = tVar.a();
        if (bVar == null) {
            com.google.gson.internal.a.i("dns == null");
            throw null;
        }
        this.f7670b = bVar;
        if (socketFactory == null) {
            com.google.gson.internal.a.i("socketFactory == null");
            throw null;
        }
        this.f7671c = socketFactory;
        if (bVar2 == null) {
            com.google.gson.internal.a.i("proxyAuthenticator == null");
            throw null;
        }
        this.f7672d = bVar2;
        if (list == null) {
            com.google.gson.internal.a.i("protocols == null");
            throw null;
        }
        this.f7673e = n8.c.k(list);
        if (list2 == null) {
            com.google.gson.internal.a.i("connectionSpecs == null");
            throw null;
        }
        this.f = n8.c.k(list2);
        if (proxySelector == null) {
            com.google.gson.internal.a.i("proxySelector == null");
            throw null;
        }
        this.g = proxySelector;
        this.h = sSLSocketFactory;
        this.i = cVar;
        this.j = jVar;
    }

    public final boolean a(a aVar) {
        return this.f7670b.equals(aVar.f7670b) && this.f7672d.equals(aVar.f7672d) && this.f7673e.equals(aVar.f7673e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && n8.c.i(null, null) && n8.c.i(this.h, aVar.h) && n8.c.i(this.i, aVar.i) && n8.c.i(this.j, aVar.j) && this.f7669a.f7797e == aVar.f7669a.f7797e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7669a.equals(aVar.f7669a) && a(aVar);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.f7673e.hashCode() + ((this.f7672d.hashCode() + ((this.f7670b.hashCode() + androidx.lifecycle.l.o(527, 31, this.f7669a.i)) * 31)) * 31)) * 31)) * 31)) * 961;
        SSLSocketFactory sSLSocketFactory = this.h;
        int iHashCode2 = (iHashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.i;
        int iHashCode3 = (iHashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        j jVar = this.j;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        u uVar = this.f7669a;
        sb.append(uVar.f7796d);
        sb.append(":");
        sb.append(uVar.f7797e);
        sb.append(", proxySelector=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
