package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11209b;

    public h(String str, String str2) {
        this.f11208a = str;
        this.f11209b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11208a.equals(hVar.f11208a) && this.f11209b.equals(hVar.f11209b);
    }

    public final int hashCode() {
        return this.f11209b.hashCode() + (this.f11208a.hashCode() * 31);
    }

    public final String toString() {
        return "{packagename='" + this.f11208a + "', installerPackagename='" + this.f11209b + "'}";
    }
}
