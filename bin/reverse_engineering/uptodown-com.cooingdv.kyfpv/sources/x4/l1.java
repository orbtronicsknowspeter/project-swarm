package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11277c;

    public l1(String str, String str2, String str3) {
        this.f11275a = str;
        this.f11276b = str2;
        this.f11277c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return kotlin.jvm.internal.l.a(this.f11275a, l1Var.f11275a) && kotlin.jvm.internal.l.a(this.f11276b, l1Var.f11276b) && kotlin.jvm.internal.l.a(this.f11277c, l1Var.f11277c);
    }

    public final int hashCode() {
        String str = this.f11275a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11276b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11277c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failed(packageName=");
        sb.append(this.f11275a);
        sb.append(", appName=");
        sb.append(this.f11276b);
        sb.append(", errorMessage=");
        return a4.x.n(sb, this.f11277c, ")");
    }
}
