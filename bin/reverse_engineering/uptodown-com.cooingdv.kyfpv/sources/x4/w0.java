package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11428a;

    public w0(r rVar) {
        this.f11428a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && kotlin.jvm.internal.l.a(this.f11428a, ((w0) obj).f11428a);
    }

    public final int hashCode() {
        r rVar = this.f11428a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "DownloadingUpdate(download=" + this.f11428a + ")";
    }
}
