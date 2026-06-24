package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends Exception {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9324l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9326b;

    public y0(int i, String str) {
        super(str);
        this.f9325a = i;
        this.f9326b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f9325a == y0Var.f9325a && kotlin.jvm.internal.l.a(this.f9326b, y0Var.f9326b);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f9326b;
    }

    public final int hashCode() {
        return this.f9326b.hashCode() + (this.f9325a * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ProgramException(statusCode=" + this.f9325a + ", message=" + this.f9326b + ")";
    }
}
