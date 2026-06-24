package h9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5512a;

    public f() {
        this.f5512a = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.l.a(this.f5512a, ((f) obj).f5512a);
    }

    public final int hashCode() {
        return this.f5512a.hashCode();
    }

    public final String toString() {
        return "CookieDisclosure(disclosures=" + this.f5512a + ')';
    }

    public f(ArrayList arrayList) {
        this.f5512a = arrayList;
    }
}
