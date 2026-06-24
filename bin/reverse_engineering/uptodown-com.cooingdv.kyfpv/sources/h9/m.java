package h9;

import a4.x;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5577e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f5581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f5582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f5583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5584q;

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        str.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        str15.getClass();
        str16.getClass();
        str17.getClass();
        this.f5573a = str;
        this.f5574b = str2;
        this.f5575c = str3;
        this.f5576d = str4;
        this.f5577e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.f5578k = str11;
        this.f5579l = str12;
        this.f5580m = str13;
        this.f5581n = str14;
        this.f5582o = str15;
        this.f5583p = str16;
        this.f5584q = str17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.a(this.f5573a, mVar.f5573a) && this.f5574b.equals(mVar.f5574b) && this.f5575c.equals(mVar.f5575c) && kotlin.jvm.internal.l.a(this.f5576d, mVar.f5576d) && kotlin.jvm.internal.l.a(this.f5577e, mVar.f5577e) && kotlin.jvm.internal.l.a(this.f, mVar.f) && kotlin.jvm.internal.l.a(this.g, mVar.g) && kotlin.jvm.internal.l.a(this.h, mVar.h) && kotlin.jvm.internal.l.a(this.i, mVar.i) && kotlin.jvm.internal.l.a(this.j, mVar.j) && kotlin.jvm.internal.l.a(this.f5578k, mVar.f5578k) && kotlin.jvm.internal.l.a(this.f5579l, mVar.f5579l) && kotlin.jvm.internal.l.a(this.f5580m, mVar.f5580m) && kotlin.jvm.internal.l.a(this.f5581n, mVar.f5581n) && kotlin.jvm.internal.l.a(this.f5582o, mVar.f5582o) && kotlin.jvm.internal.l.a(this.f5583p, mVar.f5583p) && kotlin.jvm.internal.l.a(this.f5584q, mVar.f5584q);
    }

    public final int hashCode() {
        return this.f5584q.hashCode() + i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(androidx.lifecycle.l.o(androidx.lifecycle.l.o(this.f5573a.hashCode() * 31, 31, this.f5574b), 31, this.f5575c), this.f5576d), this.f5577e), this.f), this.g), this.h), this.i), this.j), this.f5578k), this.f5579l), this.f5580m), this.f5581n), this.f5582o), this.f5583p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerDetailLabel(purposesLabel=");
        sb.append(this.f5573a);
        sb.append(", legitimateIntLabel=");
        sb.append(this.f5574b);
        sb.append(", specialPurposesLabel=");
        sb.append(this.f5575c);
        sb.append(", featuresLabel=");
        sb.append(this.f5576d);
        sb.append(", specialFeaturesLabel=");
        sb.append(this.f5577e);
        sb.append(", dataDeclarationsLabel=");
        sb.append(this.f);
        sb.append(", privacyPolicyLabel=");
        sb.append(this.g);
        sb.append(", cookieMaxAgeLabel=");
        sb.append(this.h);
        sb.append(", daysLabel=");
        sb.append(this.i);
        sb.append(", secondsLabel=");
        sb.append(this.j);
        sb.append(", disclosureLabel=");
        sb.append(this.f5578k);
        sb.append(", cookieAccessLabel=");
        sb.append(this.f5579l);
        sb.append(", yesLabel=");
        sb.append(this.f5580m);
        sb.append(", noLabel=");
        sb.append(this.f5581n);
        sb.append(", backLabel=");
        sb.append(this.f5582o);
        sb.append(", dataRetentionLabel=");
        sb.append(this.f5583p);
        sb.append(", legitimateInterestPrivacyLink=");
        return x.m(sb, this.f5584q, ')');
    }
}
