package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11151a;

    public f0(r rVar) {
        rVar.getClass();
        this.f11151a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && kotlin.jvm.internal.l.a(this.f11151a, ((f0) obj).f11151a);
    }

    public final int hashCode() {
        return this.f11151a.hashCode();
    }

    public final String toString() {
        return "Downloading(download=" + this.f11151a + ")";
    }
}
