package q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f8608a;

    public o(r rVar) {
        z zVar = z.f8628a;
        this.f8608a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.f8608a.equals(((o) ((a0) obj)).f8608a)) {
            return false;
        }
        Object obj2 = z.f8628a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f8608a.hashCode() ^ 1000003) * 1000003) ^ z.f8628a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f8608a + ", productIdOrigin=" + z.f8628a + "}";
    }
}
