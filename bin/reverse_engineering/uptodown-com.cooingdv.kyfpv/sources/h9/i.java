package h9;

import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5542e;
    public final String f;
    public final String g;
    public final String h;
    public final e i;
    public final a j;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, e eVar, a aVar) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str8.getClass();
        this.f5538a = str;
        this.f5539b = str2;
        this.f5540c = str3;
        this.f5541d = str4;
        this.f5542e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = eVar;
        this.j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f5538a, iVar.f5538a) && this.f5539b.equals(iVar.f5539b) && kotlin.jvm.internal.l.a(this.f5540c, iVar.f5540c) && kotlin.jvm.internal.l.a(this.f5541d, iVar.f5541d) && kotlin.jvm.internal.l.a(this.f5542e, iVar.f5542e) && kotlin.jvm.internal.l.a(this.f, iVar.f) && this.g.equals(iVar.g) && kotlin.jvm.internal.l.a(this.h, iVar.h) && this.i.equals(iVar.i) && this.j.equals(iVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + i5.b(androidx.lifecycle.l.o(i5.b(i5.b(i5.b(i5.b(androidx.lifecycle.l.o(this.f5538a.hashCode() * 31, 31, this.f5539b), this.f5540c), this.f5541d), this.f5542e), this.f), 31, this.g), this.h)) * 31);
    }

    public final String toString() {
        return "InitScreen(title=" + this.f5538a + ", body=" + this.f5539b + ", settings=" + this.f5540c + ", accept=" + this.f5541d + ", reject=" + this.f5542e + ", consentLink=" + this.f + ", privacyPolicyLink=" + this.g + ", privacyPolicyLinkText=" + this.h + ", consentOrPayUILabels=" + this.i + ", advancedUILabels=" + this.j + ')';
    }
}
