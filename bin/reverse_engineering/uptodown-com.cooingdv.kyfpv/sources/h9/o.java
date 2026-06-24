package h9;

import a4.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5591b;

    public o(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f5590a = str;
        this.f5591b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.f5590a, oVar.f5590a) && kotlin.jvm.internal.l.a(this.f5591b, oVar.f5591b);
    }

    public final int hashCode() {
        return this.f5591b.hashCode() + (this.f5590a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnersDisclosureLabels(disclosureLabel=");
        sb.append(this.f5590a);
        sb.append(", backLabel=");
        return x.m(sb, this.f5591b, ')');
    }
}
