package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11340a;

    public q0(r rVar) {
        this.f11340a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && kotlin.jvm.internal.l.a(this.f11340a, ((q0) obj).f11340a);
    }

    public final int hashCode() {
        r rVar = this.f11340a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "ProgressUpdate(d=" + this.f11340a + ")";
    }
}
