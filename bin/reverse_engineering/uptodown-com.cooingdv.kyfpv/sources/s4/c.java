package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9181e;

    public c(long j, long j6, String str, long j10, boolean z9) {
        this.f9177a = j;
        this.f9178b = j6;
        this.f9179c = str;
        this.f9180d = j10;
        this.f9181e = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9177a == cVar.f9177a && this.f9178b == cVar.f9178b && kotlin.jvm.internal.l.a(this.f9179c, cVar.f9179c) && this.f9180d == cVar.f9180d && this.f9181e == cVar.f9181e;
    }

    public final int hashCode() {
        long j = this.f9177a;
        long j6 = this.f9178b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        String str = this.f9179c;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f9180d;
        return ((((i + iHashCode) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f9181e ? 1231 : 1237);
    }

    public final String toString() {
        return "UrlDownloadAppInfo(appID=" + this.f9177a + ", fileID=" + this.f9178b + ", sha256=" + this.f9179c + ", versionCode=" + this.f9180d + ", isDeepLink=" + this.f9181e + ")";
    }
}
