package i7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends b implements a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f5703m = new d(1, 0, 1);

    @Override // i7.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f5696a == dVar.f5696a && this.f5697b == dVar.f5697b;
    }

    @Override // i7.a
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f5697b);
    }

    @Override // i7.a
    public final Comparable getStart() {
        return Integer.valueOf(this.f5696a);
    }

    @Override // i7.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5696a * 31) + this.f5697b;
    }

    @Override // i7.b
    public final boolean isEmpty() {
        return this.f5696a > this.f5697b;
    }

    @Override // i7.b
    public final String toString() {
        return this.f5696a + ".." + this.f5697b;
    }
}
