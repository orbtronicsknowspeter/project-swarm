package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f11245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11247c;

    public j2(k2 k2Var, int i, int i6) {
        k2Var.getClass();
        this.f11245a = k2Var;
        this.f11246b = i;
        this.f11247c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return kotlin.jvm.internal.l.a(this.f11245a, j2Var.f11245a) && this.f11246b == j2Var.f11246b && this.f11247c == j2Var.f11247c;
    }

    public final int hashCode() {
        return (((this.f11245a.hashCode() * 31) + this.f11246b) * 31) + this.f11247c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewLikeData(review=");
        sb.append(this.f11245a);
        sb.append(", success=");
        sb.append(this.f11246b);
        sb.append(", statusCode=");
        return androidx.lifecycle.l.x(sb, ")", this.f11247c);
    }
}
