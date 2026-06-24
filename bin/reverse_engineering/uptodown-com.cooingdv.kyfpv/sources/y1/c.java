package y1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11610c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            com.google.gson.internal.a.i("Null crashlyticsInstallId");
            throw null;
        }
        this.f11608a = str;
        this.f11609b = str2;
        this.f11610c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f11608a.equals(cVar.f11608a)) {
                String str = cVar.f11609b;
                String str2 = this.f11609b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = cVar.f11610c;
                    String str4 = this.f11610c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11608a.hashCode() ^ 1000003) * 1000003;
        String str = this.f11609b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f11610c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f11608a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f11609b);
        sb.append(", firebaseAuthenticationToken=");
        return a4.x.n(sb, this.f11610c, "}");
    }
}
