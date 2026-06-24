package j5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends t0.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6704c;

    public m(String str) {
        this.f6704c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f6704c.equals(((m) obj).f6704c);
    }

    public final int hashCode() {
        return this.f6704c.hashCode();
    }

    public final String toString() {
        return androidx.lifecycle.l.w("HashMismatch(calculatedHash=", this.f6704c, ")");
    }
}
