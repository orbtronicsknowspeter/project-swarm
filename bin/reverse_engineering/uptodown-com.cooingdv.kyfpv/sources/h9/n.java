package h9;

import a4.x;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5589e;
    public final String f;
    public final String g;

    public n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.f5585a = str;
        this.f5586b = str2;
        this.f5587c = str3;
        this.f5588d = str4;
        this.f5589e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.a(this.f5585a, nVar.f5585a) && kotlin.jvm.internal.l.a(this.f5586b, nVar.f5586b) && kotlin.jvm.internal.l.a(this.f5587c, nVar.f5587c) && kotlin.jvm.internal.l.a(this.f5588d, nVar.f5588d) && kotlin.jvm.internal.l.a(this.f5589e, nVar.f5589e) && kotlin.jvm.internal.l.a(this.f, nVar.f) && kotlin.jvm.internal.l.a(this.g, nVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + i5.b(i5.b(i5.b(i5.b(i5.b(this.f5585a.hashCode() * 31, this.f5586b), this.f5587c), this.f5588d), this.f5589e), this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerScreen(title=");
        sb.append(this.f5585a);
        sb.append(", bodyText=");
        sb.append(this.f5586b);
        sb.append(", searchBarHint=");
        sb.append(this.f5587c);
        sb.append(", partnersLabel=");
        sb.append(this.f5588d);
        sb.append(", showAllVendorsMenu=");
        sb.append(this.f5589e);
        sb.append(", showIABVendorsMenu=");
        sb.append(this.f);
        sb.append(", backLabel=");
        return x.m(sb, this.g, ')');
    }
}
