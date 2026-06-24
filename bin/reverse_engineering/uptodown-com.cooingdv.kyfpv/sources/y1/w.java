package y1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11689b;

    public w(String str, String str2) {
        this.f11688a = str;
        this.f11689b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.l.a(this.f11688a, wVar.f11688a) && kotlin.jvm.internal.l.a(this.f11689b, wVar.f11689b);
    }

    public final int hashCode() {
        String str = this.f11688a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11689b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f11688a);
        sb.append(", authToken=");
        return a4.x.m(sb, this.f11689b, ')');
    }
}
