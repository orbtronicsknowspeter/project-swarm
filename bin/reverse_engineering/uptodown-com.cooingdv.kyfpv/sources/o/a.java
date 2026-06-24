package o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f8123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f8124c;

    public a(Object obj, d dVar, b bVar) {
        this.f8122a = obj;
        this.f8123b = dVar;
        this.f8124c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f8122a.equals(aVar.f8122a) || !this.f8123b.equals(aVar.f8123b)) {
            return false;
        }
        b bVar = aVar.f8124c;
        b bVar2 = this.f8124c;
        return bVar2 == null ? bVar == null : bVar2.equals(bVar);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f8122a.hashCode()) * 1000003) ^ this.f8123b.hashCode()) * 1000003;
        b bVar = this.f8124c;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f8122a + ", priority=" + this.f8123b + ", productData=" + this.f8124c + ", eventContext=null}";
    }
}
