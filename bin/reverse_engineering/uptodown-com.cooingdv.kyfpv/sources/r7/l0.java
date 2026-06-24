package r7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends s7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o7.l f9015b;

    @Override // s7.d
    public final boolean a(s7.b bVar) {
        j0 j0Var = (j0) bVar;
        if (this.f9014a >= 0) {
            return false;
        }
        long j = j0Var.f8999p;
        if (j < j0Var.f9000q) {
            j0Var.f9000q = j;
        }
        this.f9014a = j;
        return true;
    }

    @Override // s7.d
    public final t6.c[] b(s7.b bVar) {
        long j = this.f9014a;
        this.f9014a = -1L;
        this.f9015b = null;
        return ((j0) bVar).s(j);
    }
}
