package p6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8453b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8454l;

    public n(Object obj, Object obj2, Object obj3) {
        this.f8452a = obj;
        this.f8453b = obj2;
        this.f8454l = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.a(this.f8452a, nVar.f8452a) && kotlin.jvm.internal.l.a(this.f8453b, nVar.f8453b) && kotlin.jvm.internal.l.a(this.f8454l, nVar.f8454l);
    }

    public final int hashCode() {
        Object obj = this.f8452a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8453b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f8454l;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f8452a + ", " + this.f8453b + ", " + this.f8454l + ')';
    }
}
