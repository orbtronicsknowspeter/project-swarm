package l8;

import a4.x;
import com.google.android.gms.internal.measurement.i5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7236e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final n6.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f7237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f7238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f7240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f7241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f7242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f7243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f7244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f7245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f7246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f7247u;
    public final String v;

    public n(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, n6.a aVar, d dVar, p pVar, i iVar, k kVar, b bVar, h hVar, r rVar, String str9, ArrayList arrayList, boolean z9, String str10, int i) {
        d dVar2;
        int i6 = i & 1;
        t tVar = t.f8725a;
        List list2 = i6 != 0 ? tVar : list;
        String str11 = (i & 2) != 0 ? "" : str;
        String str12 = (i & 4) != 0 ? "" : str2;
        String str13 = (i & 8) != 0 ? "" : str3;
        String str14 = (i & 16) != 0 ? "" : str4;
        String str15 = (i & 32) != 0 ? "" : str5;
        String str16 = (i & 64) != 0 ? "" : str6;
        String str17 = (i & 128) != 0 ? "" : str7;
        String str18 = (i & 256) != 0 ? "" : str8;
        n6.a aVar2 = (i & 512) != 0 ? new n6.a(7, null, null) : aVar;
        if ((i & 1024) != 0) {
            Boolean bool = Boolean.FALSE;
            dVar2 = new d(bool, bool, bool, bool);
        } else {
            dVar2 = dVar;
        }
        p pVar2 = (i & 2048) != 0 ? null : pVar;
        i iVar2 = (i & 8192) != 0 ? new i() : iVar;
        k kVar2 = (i & 16384) != 0 ? new k() : kVar;
        b bVar2 = (i & 32768) != 0 ? new b() : bVar;
        h hVar2 = (i & 65536) != 0 ? new h() : hVar;
        r rVar2 = (i & 131072) != 0 ? new r(false, null, null, null, null, null, null, null, null, 1023) : rVar;
        String str19 = (i & 262144) != 0 ? "" : str9;
        Object obj = (i & 524288) != 0 ? tVar : arrayList;
        boolean z10 = (i & 1048576) != 0 ? false : z9;
        String str20 = (i & 2097152) != 0 ? "" : str10;
        this.f7232a = list2;
        this.f7233b = str11;
        this.f7234c = str12;
        this.f7235d = str13;
        this.f7236e = str14;
        this.f = str15;
        this.g = str16;
        this.h = str17;
        this.i = str18;
        this.j = aVar2;
        this.f7237k = dVar2;
        this.f7238l = pVar2;
        this.f7239m = 0L;
        this.f7240n = iVar2;
        this.f7241o = kVar2;
        this.f7242p = bVar2;
        this.f7243q = hVar2;
        this.f7244r = rVar2;
        this.f7245s = str19;
        this.f7246t = obj;
        this.f7247u = z10;
        this.v = str20;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Collection] */
    public final h8.i a() {
        if (this.f7236e.length() <= 0) {
            return null;
        }
        i iVar = this.f7240n;
        ?? r22 = iVar.f7205l;
        ?? r32 = iVar.f7207n;
        ?? r42 = iVar.f7209p;
        ?? r52 = iVar.f7208o;
        ?? r62 = iVar.f7206m;
        if (r22.isEmpty() && r62.isEmpty() && r52.isEmpty() && r42.isEmpty() && r32.isEmpty()) {
            return null;
        }
        return new h8.i(-1, this.f7236e, null, q6.l.I0((Collection) iVar.f7205l), q6.l.I0((Collection) r62), null, q6.l.I0((Collection) r32), q6.l.I0((Collection) r52), q6.l.I0((Collection) r42), null, null, 0, null, null, null, null, null, 914980);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.a(this.f7232a, nVar.f7232a) && kotlin.jvm.internal.l.a(this.f7233b, nVar.f7233b) && kotlin.jvm.internal.l.a(this.f7234c, nVar.f7234c) && kotlin.jvm.internal.l.a(this.f7235d, nVar.f7235d) && kotlin.jvm.internal.l.a(this.f7236e, nVar.f7236e) && kotlin.jvm.internal.l.a(this.f, nVar.f) && kotlin.jvm.internal.l.a(this.g, nVar.g) && kotlin.jvm.internal.l.a(this.h, nVar.h) && kotlin.jvm.internal.l.a(this.i, nVar.i) && kotlin.jvm.internal.l.a(this.j, nVar.j) && kotlin.jvm.internal.l.a(this.f7237k, nVar.f7237k) && kotlin.jvm.internal.l.a(this.f7238l, nVar.f7238l) && this.f7239m == nVar.f7239m && kotlin.jvm.internal.l.a(this.f7240n, nVar.f7240n) && kotlin.jvm.internal.l.a(this.f7241o, nVar.f7241o) && kotlin.jvm.internal.l.a(this.f7242p, nVar.f7242p) && kotlin.jvm.internal.l.a(this.f7243q, nVar.f7243q) && kotlin.jvm.internal.l.a(this.f7244r, nVar.f7244r) && kotlin.jvm.internal.l.a(this.f7245s, nVar.f7245s) && kotlin.jvm.internal.l.a(this.f7246t, nVar.f7246t) && this.f7247u == nVar.f7247u && kotlin.jvm.internal.l.a(this.v, nVar.v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    public final int hashCode() {
        int iB = i5.b(i5.b(i5.b(i5.b(i5.b(this.f7232a.hashCode() * 31, this.f7233b), this.f7234c), this.f7235d), this.f7236e), this.f);
        String str = this.g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode3 = (this.f7237k.hashCode() + ((this.j.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        p pVar = this.f7238l;
        int iHashCode4 = (iHashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        long j = this.f7239m;
        int iA = j8.e.a(i5.b((this.f7244r.hashCode() + ((this.f7243q.hashCode() + androidx.lifecycle.l.o((this.f7241o.hashCode() + ((this.f7240n.hashCode() + ((((int) (j ^ (j >>> 32))) + iHashCode4) * 31)) * 31)) * 31, 31, this.f7242p.f7181a)) * 31)) * 31, this.f7245s), this.f7246t);
        boolean z9 = this.f7247u;
        ?? r22 = z9;
        if (z9) {
            r22 = 1;
        }
        return this.v.hashCode() + ((iA + r22) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalConfig(applicableRegulations=");
        sb.append(this.f7232a);
        sb.append(", inmobiAccountId=");
        sb.append(this.f7233b);
        sb.append(", hashCode=");
        sb.append(this.f7234c);
        sb.append(", publisherCountryCode=");
        sb.append(this.f7235d);
        sb.append(", publisherName=");
        sb.append(this.f7236e);
        sb.append(", lang_=");
        sb.append(this.f);
        sb.append(", siteUuid=");
        sb.append((Object) this.g);
        sb.append(", themeUuid=");
        sb.append((Object) this.h);
        sb.append(", cmpVersion=");
        sb.append((Object) this.i);
        sb.append(", geoIP=");
        sb.append(this.j);
        sb.append(", features=");
        sb.append(this.f7237k);
        sb.append(", theme=");
        sb.append(this.f7238l);
        sb.append(", currentTimeStamp=");
        sb.append(this.f7239m);
        sb.append(", gdprPortalConfig=");
        sb.append(this.f7240n);
        sb.append(", mspaPortalConfig=");
        sb.append(this.f7241o);
        sb.append(", ccpaPortalConfig=");
        sb.append(this.f7242p);
        sb.append(", gbcPortalConfig=");
        sb.append(this.f7243q);
        sb.append(", uspPortalLabels=");
        sb.append(this.f7244r);
        sb.append(", noRegulationMessage=");
        sb.append(this.f7245s);
        sb.append(", supportedLanguages=");
        sb.append(this.f7246t);
        sb.append(", optOutFromAllEnabled=");
        sb.append(this.f7247u);
        sb.append(", inmobiBrandingLogoUrl=");
        return x.m(sb, this.v, ')');
    }
}
