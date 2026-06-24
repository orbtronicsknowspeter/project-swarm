package l4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7103c;

    public b(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7101a = str;
        this.f7102b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f7101a, bVar.f7101a) && kotlin.jvm.internal.l.a(this.f7102b, bVar.f7102b);
    }

    public final int hashCode() {
        return this.f7102b.hashCode() + (this.f7101a.hashCode() * 31);
    }

    public final String toString() {
        return "AppToBackup(packageName=" + this.f7101a + ", name=" + this.f7102b + ")";
    }
}
