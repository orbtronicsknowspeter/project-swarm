package t2;

import a4.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9539c;

    public a(String str, long j, long j6) {
        this.f9537a = str;
        this.f9538b = j;
        this.f9539c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9537a.equals(aVar.f9537a) && this.f9538b == aVar.f9538b && this.f9539c == aVar.f9539c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9537a.hashCode() ^ 1000003) * 1000003;
        long j = this.f9538b;
        long j6 = this.f9539c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f9537a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f9538b);
        sb.append(", tokenCreationTimestamp=");
        return x.l(sb, this.f9539c, "}");
    }
}
