package e4;

import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4.e f4709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2 f4710b;

    public v0(x4.e eVar, q2 q2Var) {
        this.f4709a = eVar;
        this.f4710b = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f4709a.equals(v0Var.f4709a) && this.f4710b.equals(v0Var.f4710b);
    }

    public final int hashCode() {
        return this.f4710b.hashCode() + (this.f4709a.hashCode() * 31);
    }

    public final String toString() {
        return "AppUpdateData(app=" + this.f4709a + ", update=" + this.f4710b + ")";
    }
}
