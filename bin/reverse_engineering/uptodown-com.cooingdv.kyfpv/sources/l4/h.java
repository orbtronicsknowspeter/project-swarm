package l4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7116a;

    public h(a aVar) {
        this.f7116a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f7116a.equals(((h) obj).f7116a);
    }

    public final int hashCode() {
        return this.f7116a.hashCode();
    }

    public final String toString() {
        return "InstallTimeout(appInstalling=" + this.f7116a + ")";
    }
}
