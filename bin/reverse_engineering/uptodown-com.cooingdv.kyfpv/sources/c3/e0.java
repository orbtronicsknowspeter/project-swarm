package c3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1235d;

    public e0(String str, int i, int i6, boolean z9) {
        this.f1232a = str;
        this.f1233b = i;
        this.f1234c = i6;
        this.f1235d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f1232a.equals(e0Var.f1232a) && this.f1233b == e0Var.f1233b && this.f1234c == e0Var.f1234c && this.f1235d == e0Var.f1235d;
    }

    public final int hashCode() {
        return (((((this.f1232a.hashCode() * 31) + this.f1233b) * 31) + this.f1234c) * 31) + (this.f1235d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f1232a + ", pid=" + this.f1233b + ", importance=" + this.f1234c + ", isDefaultProcess=" + this.f1235d + ')';
    }
}
