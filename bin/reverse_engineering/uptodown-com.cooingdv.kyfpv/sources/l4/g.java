package l4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7115a;

    public g(a aVar) {
        this.f7115a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.l.a(this.f7115a, ((g) obj).f7115a);
    }

    public final int hashCode() {
        a aVar = this.f7115a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "InstallSuccess(appInstalling=" + this.f7115a + ")";
    }
}
