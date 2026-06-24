package v2;

import c.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10801c;

    public b(String str, int i, long j) {
        this.f10799a = str;
        this.f10800b = j;
        this.f10801c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f10799a;
        String str2 = this.f10799a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f10800b != bVar.f10800b) {
            return false;
        }
        int i = bVar.f10801c;
        int i6 = this.f10801c;
        return i6 == 0 ? i == 0 : j.a(i6, i);
    }

    public final int hashCode() {
        String str = this.f10799a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f10800b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i6 = this.f10801c;
        return (i6 != 0 ? j.c(i6) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f10799a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f10800b);
        sb.append(", responseCode=");
        int i = this.f10801c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
