package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11477e;

    public y2(String str, String str2, long j, String str3, int i) {
        this.f11473a = str;
        this.f11474b = str2;
        this.f11475c = j;
        this.f11476d = str3;
        this.f11477e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return kotlin.jvm.internal.l.a(this.f11473a, y2Var.f11473a) && kotlin.jvm.internal.l.a(this.f11474b, y2Var.f11474b) && this.f11475c == y2Var.f11475c && kotlin.jvm.internal.l.a(this.f11476d, y2Var.f11476d) && this.f11477e == y2Var.f11477e;
    }

    public final int hashCode() {
        String str = this.f11473a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11474b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        long j = this.f11475c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.f11476d;
        return ((i + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f11477e;
    }

    public final String toString() {
        return "UserDeviceApp(name=" + this.f11473a + ", packagename=" + this.f11474b + ", lastUpdate=" + this.f11475c + ", icon=" + this.f11476d + ", appAvailable=" + this.f11477e + ")";
    }
}
