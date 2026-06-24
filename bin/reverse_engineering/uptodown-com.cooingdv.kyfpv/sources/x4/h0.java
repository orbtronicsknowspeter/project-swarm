package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11210a;

    public h0(r rVar) {
        rVar.getClass();
        this.f11210a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && kotlin.jvm.internal.l.a(this.f11210a, ((h0) obj).f11210a);
    }

    public final int hashCode() {
        return this.f11210a.hashCode();
    }

    public final String toString() {
        return "Paused(download=" + this.f11210a + ")";
    }
}
