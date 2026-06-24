package n1;

import a4.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7899c;

    public a(long j, long j6, long j10) {
        this.f7897a = j;
        this.f7898b = j6;
        this.f7899c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f7897a == aVar.f7897a && this.f7898b == aVar.f7898b && this.f7899c == aVar.f7899c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7897a;
        long j6 = this.f7898b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f7899c;
        return i ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f7897a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f7898b);
        sb.append(", uptimeMillis=");
        return x.l(sb, this.f7899c, "}");
    }
}
