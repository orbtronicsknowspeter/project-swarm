package h9;

import com.google.android.gms.internal.measurement.i5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5553e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f5557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f5558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f5559p;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3) {
        this.f5549a = str;
        this.f5550b = str2;
        this.f5551c = str3;
        this.f5552d = str4;
        this.f5553e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.f5554k = str11;
        this.f5555l = str12;
        this.f5556m = str13;
        this.f5557n = list;
        this.f5558o = list2;
        this.f5559p = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.l.a(this.f5549a, kVar.f5549a) && kotlin.jvm.internal.l.a(this.f5550b, kVar.f5550b) && kotlin.jvm.internal.l.a(this.f5551c, kVar.f5551c) && kotlin.jvm.internal.l.a(this.f5552d, kVar.f5552d) && kotlin.jvm.internal.l.a(this.f5553e, kVar.f5553e) && kotlin.jvm.internal.l.a(this.f, kVar.f) && kotlin.jvm.internal.l.a(this.g, kVar.g) && kotlin.jvm.internal.l.a(this.h, kVar.h) && kotlin.jvm.internal.l.a(this.i, kVar.i) && kotlin.jvm.internal.l.a(this.j, kVar.j) && kotlin.jvm.internal.l.a(this.f5554k, kVar.f5554k) && kotlin.jvm.internal.l.a(this.f5555l, kVar.f5555l) && kotlin.jvm.internal.l.a(this.f5556m, kVar.f5556m) && kotlin.jvm.internal.l.a(this.f5557n, kVar.f5557n) && kotlin.jvm.internal.l.a(this.f5558o, kVar.f5558o) && kotlin.jvm.internal.l.a(this.f5559p, kVar.f5559p);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    public final int hashCode() {
        return this.f5559p.hashCode() + j8.e.a(j8.e.a(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(this.f5549a.hashCode() * 31, this.f5550b), this.f5551c), this.f5552d), this.f5553e), this.f), this.g), this.h), this.i), this.j), this.f5554k), this.f5555l), this.f5556m), this.f5557n), this.f5558o);
    }

    public final String toString() {
        return "MobileUiLabels(doneLabel=" + this.f5549a + ", searchLabel=" + this.f5550b + ", cancelLabel=" + this.f5551c + ", showVendorsLabel=" + this.f5552d + ", showIabLabel=" + this.f5553e + ", consentLabel=" + this.f + ", flexPurposesLabel=" + this.g + ", cookieAccessBodyText=" + this.h + ", noneLabel=" + this.i + ", someLabel=" + this.j + ", allLabel=" + this.f5554k + ", closeLabel=" + this.f5555l + ", allVendorsLabel=" + this.f5556m + ", summaryScreenBodyRejectService=" + this.f5557n + ", summaryScreenBodyTextReject=" + this.f5558o + ", summaryScreenBodyTextRejectNew=" + this.f5559p + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k() {
        q6.t tVar = q6.t.f8725a;
        this("", "", "", "", "", "", "", "", "", "", "", "", "", tVar, tVar, tVar);
    }
}
