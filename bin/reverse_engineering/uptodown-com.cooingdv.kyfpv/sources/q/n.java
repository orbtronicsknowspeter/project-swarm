package q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f8607a;

    public n(l lVar) {
        this.f8607a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.f8626a;
        if (obj2.equals(obj2)) {
            return this.f8607a.equals(((n) yVar).f8607a);
        }
        return false;
    }

    public final int hashCode() {
        return ((x.f8626a.hashCode() ^ 1000003) * 1000003) ^ this.f8607a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f8626a + ", androidClientInfo=" + this.f8607a + "}";
    }
}
