package i9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5708b;

    public a(long j, String str) {
        this.f5707a = str;
        this.f5708b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5707a.equals(aVar.f5707a) && this.f5708b == aVar.f5708b;
    }

    public final int hashCode() {
        int iHashCode = this.f5707a.hashCode() * 31;
        long j = this.f5708b;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "ApiResponse(body=" + this.f5707a + ", timestamp=" + this.f5708b + ')';
    }
}
