package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f11081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11083c;

    public c2(d2 d2Var, int i, int i6) {
        d2Var.getClass();
        this.f11081a = d2Var;
        this.f11082b = i;
        this.f11083c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return kotlin.jvm.internal.l.a(this.f11081a, c2Var.f11081a) && this.f11082b == c2Var.f11082b && this.f11083c == c2Var.f11083c;
    }

    public final int hashCode() {
        return (((this.f11081a.hashCode() * 31) + this.f11082b) * 31) + this.f11083c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyLikeData(reply=");
        sb.append(this.f11081a);
        sb.append(", success=");
        sb.append(this.f11082b);
        sb.append(", statusCode=");
        return androidx.lifecycle.l.x(sb, ")", this.f11083c);
    }
}
