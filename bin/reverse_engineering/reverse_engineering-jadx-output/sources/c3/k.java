package c3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f1280c;

    public k(j jVar, j jVar2, double d10) {
        this.f1278a = jVar;
        this.f1279b = jVar2;
        this.f1280c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1278a == kVar.f1278a && this.f1279b == kVar.f1279b && Double.compare(this.f1280c, kVar.f1280c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f1279b.hashCode() + (this.f1278a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1280c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f1278a + ", crashlytics=" + this.f1279b + ", sessionSamplingRate=" + this.f1280c + ')';
    }
}
