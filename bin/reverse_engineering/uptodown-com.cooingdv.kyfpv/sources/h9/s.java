package h9;

import a4.x;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5606e;
    public final String f;

    public s(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f5602a = str;
        this.f5603b = str2;
        this.f5604c = str3;
        this.f5605d = str4;
        this.f5606e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.l.a(this.f5602a, sVar.f5602a) && kotlin.jvm.internal.l.a(this.f5603b, sVar.f5603b) && kotlin.jvm.internal.l.a(this.f5604c, sVar.f5604c) && kotlin.jvm.internal.l.a(this.f5605d, sVar.f5605d) && kotlin.jvm.internal.l.a(this.f5606e, sVar.f5606e) && kotlin.jvm.internal.l.a(this.f, sVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i5.b(i5.b(i5.b(i5.b(this.f5602a.hashCode() * 31, this.f5603b), this.f5604c), this.f5605d), this.f5606e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StacksScreen(title=");
        sb.append(this.f5602a);
        sb.append(", legalDescriptionTextLabel=");
        sb.append(this.f5603b);
        sb.append(", agreeToAllButton=");
        sb.append(this.f5604c);
        sb.append(", searchBarHint=");
        sb.append(this.f5605d);
        sb.append(", closeLabel=");
        sb.append(this.f5606e);
        sb.append(", backLabel=");
        return x.m(sb, this.f, ')');
    }
}
