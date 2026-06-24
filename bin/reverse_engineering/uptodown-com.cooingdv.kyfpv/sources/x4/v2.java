package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11426d;

    public v2(String str, int i, int i6, int i10) {
        str.getClass();
        this.f11423a = str;
        this.f11424b = i;
        this.f11425c = i6;
        this.f11426d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return kotlin.jvm.internal.l.a(this.f11423a, v2Var.f11423a) && this.f11424b == v2Var.f11424b && this.f11425c == v2Var.f11425c && this.f11426d == v2Var.f11426d;
    }

    public final int hashCode() {
        return (((((this.f11423a.hashCode() * 31) + this.f11424b) * 31) + this.f11425c) * 31) + this.f11426d;
    }

    public final String toString() {
        return "FollowUserData(userID=" + this.f11423a + ", success=" + this.f11424b + ", statusCode=" + this.f11425c + ", following=" + this.f11426d + ")";
    }
}
