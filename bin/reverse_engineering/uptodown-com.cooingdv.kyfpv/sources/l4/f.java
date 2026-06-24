package l4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7114c;

    public f(a aVar, String str, int i) {
        this.f7112a = aVar;
        this.f7113b = str;
        this.f7114c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.f7112a, fVar.f7112a) && this.f7113b.equals(fVar.f7113b) && this.f7114c == fVar.f7114c;
    }

    public final int hashCode() {
        a aVar = this.f7112a;
        return androidx.lifecycle.l.o((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f7113b) + this.f7114c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallFailed(appInstalling=");
        sb.append(this.f7112a);
        sb.append(", error=");
        sb.append(this.f7113b);
        sb.append(", status=");
        return androidx.lifecycle.l.x(sb, ")", this.f7114c);
    }
}
