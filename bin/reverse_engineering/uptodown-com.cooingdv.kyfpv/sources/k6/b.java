package k6;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6982b;

    public b(Integer num, a aVar) {
        this.f6981a = num;
        this.f6982b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6981a.equals(bVar.f6981a) && this.f6982b.equals(bVar.f6982b);
    }

    public final int hashCode() {
        return this.f6982b.hashCode() + (this.f6981a.hashCode() * 31);
    }

    public final String toString() {
        return "GBCPurpose(id=" + this.f6981a + ", banner=" + this.f6982b + ')';
    }
}
