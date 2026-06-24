package p6;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f8455a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.l.c(this.f8455a & 255, ((o) obj).f8455a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f8455a == ((o) obj).f8455a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8455a;
    }

    public final String toString() {
        return String.valueOf(this.f8455a & 255);
    }
}
