package m8;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f7767e;
    public static final o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f7770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f7771d;

    static {
        l[] lVarArr = {l.f7751k, l.f7753m, l.f7752l, l.f7754n, l.f7756p, l.f7755o, l.i, l.j, l.g, l.h, l.f7750e, l.f, l.f7749d};
        n nVar = new n(true);
        String[] strArr = new String[13];
        for (int i = 0; i < 13; i++) {
            strArr[i] = lVarArr[i].f7757a;
        }
        nVar.a(strArr);
        g0 g0Var = g0.TLS_1_0;
        g0[] g0VarArr = {g0.TLS_1_3, g0.TLS_1_2, g0.TLS_1_1, g0Var};
        boolean z9 = nVar.f7763a;
        if (z9) {
            String[] strArr2 = new String[g0VarArr.length];
            for (int i6 = 0; i6 < g0VarArr.length; i6++) {
                strArr2[i6] = g0VarArr[i6].f7730a;
            }
            nVar.b(strArr2);
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("no TLS versions for cleartext connections");
        }
        if (!z9) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("no TLS extensions for cleartext connections");
            return;
        }
        nVar.f7766d = true;
        o oVar = new o(nVar);
        f7767e = oVar;
        g0[] g0VarArr2 = {g0Var};
        boolean z10 = oVar.f7768a;
        if (!z10) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("no TLS versions for cleartext connections");
            return;
        }
        String[] strArr3 = new String[g0VarArr2.length];
        for (int i10 = 0; i10 < g0VarArr2.length; i10++) {
            strArr3[i10] = g0VarArr2[i10].f7730a;
        }
        if (!z10) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("no TLS versions for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            com.google.gson.internal.a.p("At least one TLS version is required");
        } else if (z10) {
            f = new o(new n(false));
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("no TLS extensions for cleartext connections");
        }
    }

    public o(n nVar) {
        this.f7768a = nVar.f7763a;
        this.f7770c = nVar.f7764b;
        this.f7771d = nVar.f7765c;
        this.f7769b = nVar.f7766d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f7768a) {
            return false;
        }
        String[] strArr = this.f7771d;
        if (strArr != null && !n8.c.o(n8.c.f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f7770c;
        return strArr2 == null || n8.c.o(l.f7747b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o oVar = (o) obj;
        boolean z9 = oVar.f7768a;
        boolean z10 = this.f7768a;
        if (z10 != z9) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f7770c, oVar.f7770c) && Arrays.equals(this.f7771d, oVar.f7771d) && this.f7769b == oVar.f7769b;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f7768a) {
            return ((((527 + Arrays.hashCode(this.f7770c)) * 31) + Arrays.hashCode(this.f7771d)) * 31) + (!this.f7769b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f7768a) {
            return "ConnectionSpec()";
        }
        String string2 = "[all enabled]";
        String[] strArr = this.f7770c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(l.a(str));
            }
            string = DesugarCollections.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f7771d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(g0.a(str2));
            }
            string2 = DesugarCollections.unmodifiableList(arrayList2).toString();
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + string2 + ", supportsTlsExtensions=" + this.f7769b + ")";
    }
}
