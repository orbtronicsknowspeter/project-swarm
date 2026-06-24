package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11300e;

    public n2(long j, String str, String str2, String str3, String str4) {
        this.f11296a = j;
        this.f11297b = str;
        this.f11298c = str2;
        this.f11299d = str3;
        this.f11300e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.f11296a == n2Var.f11296a && kotlin.jvm.internal.l.a(this.f11297b, n2Var.f11297b) && kotlin.jvm.internal.l.a(this.f11298c, n2Var.f11298c) && kotlin.jvm.internal.l.a(this.f11299d, n2Var.f11299d) && kotlin.jvm.internal.l.a(this.f11300e, n2Var.f11300e);
    }

    public final int hashCode() {
        long j = this.f11296a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f11297b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11298c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11299d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11300e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemMessage(id=");
        sb.append(this.f11296a);
        sb.append(", title=");
        sb.append(this.f11297b);
        a4.x.B(sb, ", body=", this.f11298c, ", url=", this.f11299d);
        return a4.x.o(sb, ", actionButtonText=", this.f11300e, ")");
    }
}
