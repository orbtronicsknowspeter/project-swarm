package y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.j f11581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.i f11582c;

    public b(long j, r.j jVar, r.i iVar) {
        this.f11580a = j;
        this.f11581b = jVar;
        this.f11582c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11580a == bVar.f11580a && this.f11581b.equals(bVar.f11581b) && this.f11582c.equals(bVar.f11582c);
    }

    public final int hashCode() {
        long j = this.f11580a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11581b.hashCode()) * 1000003) ^ this.f11582c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f11580a + ", transportContext=" + this.f11581b + ", event=" + this.f11582c + "}";
    }
}
