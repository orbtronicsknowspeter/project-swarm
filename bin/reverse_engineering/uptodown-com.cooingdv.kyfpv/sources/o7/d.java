package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f8250a;

    public d(c[] cVarArr) {
        this.f8250a = cVarArr;
    }

    @Override // o7.i
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.f8250a) {
            o0 o0Var = cVar.f8242o;
            if (o0Var == null) {
                kotlin.jvm.internal.l.i("handle");
                throw null;
            }
            o0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f8250a + ']';
    }
}
