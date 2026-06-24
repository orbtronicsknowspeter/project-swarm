package p6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8442b;

    public i(Object obj, Object obj2) {
        this.f8441a = obj;
        this.f8442b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f8441a, iVar.f8441a) && kotlin.jvm.internal.l.a(this.f8442b, iVar.f8442b);
    }

    public final int hashCode() {
        Object obj = this.f8441a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8442b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f8441a + ", " + this.f8442b + ')';
    }
}
