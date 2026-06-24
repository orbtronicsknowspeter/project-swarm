package b2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f781d;

    public e1(f1 f1Var, String str, String str2, long j) {
        this.f778a = f1Var;
        this.f779b = str;
        this.f780c = str2;
        this.f781d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f778a.equals(e1Var.f778a) && this.f779b.equals(e1Var.f779b) && this.f780c.equals(e1Var.f780c) && this.f781d == e1Var.f781d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f778a.hashCode() ^ 1000003) * 1000003) ^ this.f779b.hashCode()) * 1000003) ^ this.f780c.hashCode()) * 1000003;
        long j = this.f781d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f778a);
        sb.append(", parameterKey=");
        sb.append(this.f779b);
        sb.append(", parameterValue=");
        sb.append(this.f780c);
        sb.append(", templateVersion=");
        return a4.x.l(sb, this.f781d, "}");
    }
}
