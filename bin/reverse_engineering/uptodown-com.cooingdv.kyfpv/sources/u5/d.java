package u5;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f10711a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.l.a(this.f10711a, ((d) obj).f10711a);
    }

    public final int hashCode() {
        return this.f10711a.hashCode();
    }

    public final String toString() {
        return "GoogleVendorList(googleVendorsInfoList=" + this.f10711a + ')';
    }
}
