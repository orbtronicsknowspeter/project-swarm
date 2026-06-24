package x;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.e f11010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11011b;

    public a(q2.e eVar, HashMap map) {
        this.f11010a = eVar;
        this.f11011b = map;
    }

    public final long a(o.d dVar, long j, int i) {
        long jF = j - this.f11010a.f();
        b bVar = (b) this.f11011b.get(dVar);
        long j6 = bVar.f11012a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * ((long) r12)))), jF), bVar.f11013b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11010a.equals(aVar.f11010a) && this.f11011b.equals(aVar.f11011b);
    }

    public final int hashCode() {
        return ((this.f11010a.hashCode() ^ 1000003) * 1000003) ^ this.f11011b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f11010a + ", values=" + this.f11011b + "}";
    }
}
