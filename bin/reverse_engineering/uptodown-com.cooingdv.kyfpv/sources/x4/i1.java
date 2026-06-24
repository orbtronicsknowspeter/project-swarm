package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11218a;

    public i1(String str) {
        this.f11218a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && this.f11218a.equals(((i1) obj).f11218a);
    }

    public final int hashCode() {
        return this.f11218a.hashCode();
    }

    public final String toString() {
        return androidx.lifecycle.l.w("AppUninstalled(packageName=", this.f11218a, ")");
    }
}
