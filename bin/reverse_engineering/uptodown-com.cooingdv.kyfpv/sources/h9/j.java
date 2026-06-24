package h9;

import a4.x;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5547e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5548k;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        this.f5543a = str;
        this.f5544b = str2;
        this.f5545c = str3;
        this.f5546d = str4;
        this.f5547e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.f5548k = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(this.f5543a, jVar.f5543a) && kotlin.jvm.internal.l.a(this.f5544b, jVar.f5544b) && kotlin.jvm.internal.l.a(this.f5545c, jVar.f5545c) && kotlin.jvm.internal.l.a(this.f5546d, jVar.f5546d) && kotlin.jvm.internal.l.a(this.f5547e, jVar.f5547e) && kotlin.jvm.internal.l.a(this.f, jVar.f) && kotlin.jvm.internal.l.a(this.g, jVar.g) && kotlin.jvm.internal.l.a(this.h, jVar.h) && kotlin.jvm.internal.l.a(this.i, jVar.i) && kotlin.jvm.internal.l.a(this.j, jVar.j) && kotlin.jvm.internal.l.a(this.f5548k, jVar.f5548k);
    }

    public final int hashCode() {
        return this.f5548k.hashCode() + i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(this.f5543a.hashCode() * 31, this.f5544b), this.f5545c), this.f5546d), this.f5547e), this.f), this.g), this.h), this.i), this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegInterestScreen(title=");
        sb.append(this.f5543a);
        sb.append(", body=");
        sb.append(this.f5544b);
        sb.append(", objected=");
        sb.append(this.f5545c);
        sb.append(", accept=");
        sb.append(this.f5546d);
        sb.append(", objectAllButton=");
        sb.append(this.f5547e);
        sb.append(", searchBarHint=");
        sb.append(this.f);
        sb.append(", purposesLabel=");
        sb.append(this.g);
        sb.append(", partnersLabel=");
        sb.append(this.h);
        sb.append(", showAllVendorsMenu=");
        sb.append(this.i);
        sb.append(", showIABVendorsMenu=");
        sb.append(this.j);
        sb.append(", backLabel=");
        return x.m(sb, this.f5548k, ')');
    }
}
