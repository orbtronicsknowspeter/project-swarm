package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11447a;

    public x(r rVar) {
        rVar.getClass();
        this.f11447a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && kotlin.jvm.internal.l.a(this.f11447a, ((x) obj).f11447a);
    }

    public final int hashCode() {
        return this.f11447a.hashCode();
    }

    public final String toString() {
        return "Finished(d=" + this.f11447a + ")";
    }
}
