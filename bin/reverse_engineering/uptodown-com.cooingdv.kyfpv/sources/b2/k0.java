package b2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f847e;
    public final String f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f843a = str;
        this.f844b = str2;
        this.f845c = str3;
        this.f846d = str4;
        this.f847e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            k0 k0Var = (k0) ((u1) obj);
            if (this.f843a.equals(k0Var.f843a) && this.f844b.equals(k0Var.f844b)) {
                String str = k0Var.f845c;
                String str2 = this.f845c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = k0Var.f846d;
                    String str4 = this.f846d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = k0Var.f847e;
                        String str6 = this.f847e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = k0Var.f;
                            String str8 = this.f;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f843a.hashCode() ^ 1000003) * 1000003) ^ this.f844b.hashCode()) * 1000003;
        String str = this.f845c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f846d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f847e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f843a);
        sb.append(", version=");
        sb.append(this.f844b);
        sb.append(", displayVersion=");
        sb.append(this.f845c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f846d);
        sb.append(", developmentPlatform=");
        sb.append(this.f847e);
        sb.append(", developmentPlatformVersion=");
        return a4.x.n(sb, this.f, "}");
    }
}
