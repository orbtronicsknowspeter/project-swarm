package x;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11014c;

    public b(long j, long j6, Set set) {
        this.f11012a = j;
        this.f11013b = j6;
        this.f11014c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11012a == bVar.f11012a && this.f11013b == bVar.f11013b && this.f11014c.equals(bVar.f11014c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f11012a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f11013b;
        return ((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f11014c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f11012a + ", maxAllowedDelay=" + this.f11013b + ", flags=" + this.f11014c + "}";
    }
}
