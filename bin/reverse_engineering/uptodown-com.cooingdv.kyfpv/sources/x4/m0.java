package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11286a;

    public m0(r rVar) {
        this.f11286a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && kotlin.jvm.internal.l.a(this.f11286a, ((m0) obj).f11286a);
    }

    public final int hashCode() {
        r rVar = this.f11286a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "Cancelled(d=" + this.f11286a + ")";
    }
}
