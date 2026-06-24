package h9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5537e;

    public h(String str, String str2, int i, String str3, ArrayList arrayList) {
        this.f5533a = str;
        this.f5534b = str2;
        this.f5535c = i;
        this.f5536d = str3;
        this.f5537e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5533a.equals(hVar.f5533a) && this.f5534b.equals(hVar.f5534b) && this.f5535c == hVar.f5535c && this.f5536d.equals(hVar.f5536d) && this.f5537e.equals(hVar.f5537e);
    }

    public final int hashCode() {
        return this.f5537e.hashCode() + androidx.lifecycle.l.o((this.f5535c + androidx.lifecycle.l.o(this.f5533a.hashCode() * 31, 31, this.f5534b)) * 31, 31, this.f5536d);
    }

    public final String toString() {
        return "Disclosure(identifier=" + this.f5533a + ", type=" + this.f5534b + ", maxAgeSeconds=" + this.f5535c + ", domain=" + this.f5536d + ", purposes=" + this.f5537e + ')';
    }
}
