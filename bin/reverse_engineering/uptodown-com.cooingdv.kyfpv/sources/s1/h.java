package s1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9134b;

    public h(r rVar, boolean z9) {
        this.f9133a = rVar;
        this.f9134b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f9133a.equals(this.f9133a) && hVar.f9134b == this.f9134b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9133a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f9134b).hashCode();
    }
}
