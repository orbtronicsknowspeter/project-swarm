package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11420a;

    public v(r rVar) {
        rVar.getClass();
        this.f11420a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && kotlin.jvm.internal.l.a(this.f11420a, ((v) obj).f11420a);
    }

    public final int hashCode() {
        return this.f11420a.hashCode();
    }

    public final String toString() {
        return "CheckFilehashStart(d=" + this.f11420a + ")";
    }
}
