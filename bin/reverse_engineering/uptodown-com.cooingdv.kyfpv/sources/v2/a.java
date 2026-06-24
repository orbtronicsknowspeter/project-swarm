package v2;

import c.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f10797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10798e;

    public a(String str, String str2, String str3, b bVar, int i) {
        this.f10794a = str;
        this.f10795b = str2;
        this.f10796c = str3;
        this.f10797d = bVar;
        this.f10798e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f10794a;
        String str2 = this.f10794a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = aVar.f10795b;
        String str4 = this.f10795b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = aVar.f10796c;
        String str6 = this.f10796c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        b bVar = aVar.f10797d;
        b bVar2 = this.f10797d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i = aVar.f10798e;
        int i6 = this.f10798e;
        return i6 == 0 ? i == 0 : j.a(i6, i);
    }

    public final int hashCode() {
        String str = this.f10794a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10795b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10796c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f10797d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i = this.f10798e;
        return (i != 0 ? j.c(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f10794a);
        sb.append(", fid=");
        sb.append(this.f10795b);
        sb.append(", refreshToken=");
        sb.append(this.f10796c);
        sb.append(", authToken=");
        sb.append(this.f10797d);
        sb.append(", responseCode=");
        int i = this.f10798e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
