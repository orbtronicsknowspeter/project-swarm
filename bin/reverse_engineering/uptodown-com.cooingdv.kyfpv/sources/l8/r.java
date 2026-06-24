package l8;

import a4.x;
import java.util.ArrayList;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7262e;
    public final Object f;
    public final String g;
    public final String h;
    public final String i;

    public r(boolean z9, String str, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, String str7, int i) {
        z9 = (i & 2) != 0 ? false : z9;
        str = (i & 4) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        str3 = (i & 16) != 0 ? "" : str3;
        str4 = (i & 32) != 0 ? "" : str4;
        Object obj = (i & 64) != 0 ? t.f8725a : arrayList;
        str5 = (i & 128) != 0 ? "" : str5;
        str6 = (i & 256) != 0 ? "" : str6;
        str7 = (i & 512) != 0 ? "" : str7;
        this.f7258a = z9;
        this.f7259b = str;
        this.f7260c = str2;
        this.f7261d = str3;
        this.f7262e = str4;
        this.f = obj;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f7258a == rVar.f7258a && this.f7259b.equals(rVar.f7259b) && this.f7260c.equals(rVar.f7260c) && this.f7261d.equals(rVar.f7261d) && this.f7262e.equals(rVar.f7262e) && this.f.equals(rVar.f) && this.g.equals(rVar.g) && this.h.equals(rVar.h) && this.i.equals(rVar.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z9 = this.f7258a;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        return this.i.hashCode() + androidx.lifecycle.l.o(androidx.lifecycle.l.o((this.f.hashCode() + androidx.lifecycle.l.o(androidx.lifecycle.l.o(androidx.lifecycle.l.o(androidx.lifecycle.l.o(r02 * 31, 31, this.f7259b), 31, this.f7260c), 31, this.f7261d), 31, this.f7262e)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("USPPortalLabels(isGdprEnabledInUS=false, suppressCcpaLinks=");
        sb.append(this.f7258a);
        sb.append(", uspPrivacyPolicyLinkText=");
        sb.append(this.f7259b);
        sb.append(", uspDeleteDataLinkText=");
        sb.append(this.f7260c);
        sb.append(", uspAccessDataLinkText=");
        sb.append(this.f7261d);
        sb.append(", uspDnsTitle=");
        sb.append(this.f7262e);
        sb.append(", uspDnsText=");
        sb.append(this.f);
        sb.append(", uspDeleteDataLink=");
        sb.append(this.g);
        sb.append(", uspAccessDataLink=");
        sb.append(this.h);
        sb.append(", uspPrivacyPolicyLink=");
        return x.m(sb, this.i, ')');
    }
}
