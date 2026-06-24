package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11076a;

    public c0(r rVar) {
        rVar.getClass();
        this.f11076a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.l.a(this.f11076a, ((c0) obj).f11076a);
    }

    public final int hashCode() {
        return this.f11076a.hashCode();
    }

    public final String toString() {
        return "Started(d=" + this.f11076a + ")";
    }
}
