package h9;

import a4.x;
import com.google.android.gms.internal.measurement.i5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5493e;
    public final String f;

    public b(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.f5489a = str;
        this.f5490b = list;
        this.f5491c = str2;
        this.f5492d = str3;
        this.f5493e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f5489a, bVar.f5489a) && kotlin.jvm.internal.l.a(this.f5490b, bVar.f5490b) && kotlin.jvm.internal.l.a(this.f5491c, bVar.f5491c) && kotlin.jvm.internal.l.a(this.f5492d, bVar.f5492d) && kotlin.jvm.internal.l.a(this.f5493e, bVar.f5493e) && kotlin.jvm.internal.l.a(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i5.b(i5.b(i5.b(j8.e.a(this.f5489a.hashCode() * 31, this.f5490b), this.f5491c), this.f5492d), this.f5493e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CCPAScreen(title=");
        sb.append(this.f5489a);
        sb.append(", body=");
        sb.append(this.f5490b);
        sb.append(", deleteDataLinkText=");
        sb.append(this.f5491c);
        sb.append(", accessDataLinkText=");
        sb.append(this.f5492d);
        sb.append(", privacyPolicyLinkText=");
        sb.append(this.f5493e);
        sb.append(", backLabel=");
        return x.m(sb, this.f, ')');
    }
}
