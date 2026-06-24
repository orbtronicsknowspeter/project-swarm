package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11339e;
    public final int f;

    public q(long j, long j6, int i, boolean z9, boolean z10, int i6) {
        this.f11335a = j;
        this.f11336b = j6;
        this.f11337c = i;
        this.f11338d = z9;
        this.f11339e = z10;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f11335a == qVar.f11335a && this.f11336b == qVar.f11336b && this.f11337c == qVar.f11337c && this.f11338d == qVar.f11338d && this.f11339e == qVar.f11339e && this.f == qVar.f;
    }

    public final int hashCode() {
        long j = this.f11335a;
        long j6 = this.f11336b;
        return (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + this.f11337c) * 31) + (this.f11338d ? 1231 : 1237)) * 31) + (this.f11339e ? 1231 : 1237)) * 31) + this.f;
    }

    public final String toString() {
        return "DeviceStatus(id=" + this.f11335a + ", timestamp=" + this.f11336b + ", batteryLevel=" + this.f11337c + ", isCharging=" + this.f11338d + ", isWifiConnected=" + this.f11339e + ", uploadSpeedKbps=" + this.f + ")";
    }
}
